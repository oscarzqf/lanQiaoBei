package review01;

import java.util.Scanner;

//manachaer��������Ӵ�ģ��
public class Main6 {

	 public static int maxd = 100000+7;
	    public static char[] s = new char[maxd];
	    public static char[] t = new char[maxd*2+5];
	    public static int[] p = new int[maxd];
	    public static int rcen = 0; //��¼�����Ĵ� �Ļ��Ĵ� �� ����
	    public static int rlen = 0; //�ֱ��Ǽ�¼�����Ĵ� �Ļ��Ĵ� �� ����

	public static int manacher(char[] x) {
        int len = x.length;
        int j = 0;
        t[j++] = '$';
        t[j++] = '#';
        for (int i = 0; i < len; i++) {
            t[j++] = s[i];
            t[j++] = '#';
        }
        t[j] = '\0';
        p[0] = 0;
        int mx = 0, id = 0;
        int ans = 0;
        for (int i = 0; i < j; i++) {
            if (i < mx) p[i] = Math.min(p[id * 2 - i], mx - i);
            else p[i] = 1;
            while (i-p[i]>=0 && t[i - p[i]] == t[i + p[i]]) p[i]++;
            if (i + p[i] > mx) {
                mx = p[i] + i;
                id = i;
                ans = Math.max(ans, p[i] - 1);
            }
            if (p[i] > rlen) {
                rlen = p[i];    //�����rlen�����൱����ans+1���������p[i]�ĳ�p[i]-1�����ans�������Ĵ��ĳ��ȡ�
                rcen = i;	//���if�жϲ���Ӱ��ans��
                //ֻ�����������¼���Ĵ���λ�úͳ��Ⱥ���ԭ������������Ĵ��������rlen��ans��˼����һ���ģ����ǻ��Ĵ��ĳ���
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str=cin.next();
		s=str.toCharArray();
		int n=manacher(s);
		int begin=(rcen-rlen)/2;//(rcen-rlen)/2 Ϊԭ���е���ʼ�±�λ��
		System.out.println("���Ĵ��ĳ���Ϊ "+n);
        System.out.println("���Ĵ���ԭ���е���ʼλ��Ϊ��"+begin+" -> ���Ĵ�����Ϊ��"+(rlen - 1)); // rlen-1ҲΪ���Ĵ��ĳ��ȣ��������� n�ͷ����е�ans����ȵ�,���ʿ�manacher�����е�ans����εó���
        for (int i = begin; i < begin+n; i++) {//������Ĵ������ڲ���д
            System.out.print(str.charAt(i));
        }
        System.out.println();
        cin.close();
        //output
        	//babad
			//        ���Ĵ��ĳ���Ϊ 3
			//        ���Ĵ���ԭ���е���ʼλ��Ϊ��0 -> ���Ĵ�����Ϊ��3
			//        bab
	}

}
