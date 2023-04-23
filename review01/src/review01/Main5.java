package review01;

import java.util.Scanner;

//�󹫹������г���lcs
//״̬ת�Ʒ���
//dp[i][j] = max(dp[i-1][j], dp[i][j-1],dp[i-1][j-1] + 
//(A[i]==B[j] ? 1 : 0))����ʾ��������״̬��ȡ�����ֵ��
//��һ��״̬��ʾ��¼���һ�����еĵ�i���ַ��ǵ������������
//�ڶ���״̬��ʾ��¼��ڶ������еĵ�j���ַ��ǵ������������
//������״̬��ʾ��һ�����е�ǰi-1���ַ���ڶ������е�ǰj-1���ַ��Ĺ���
//�����м������һ���ַ���¼��״̬��������һ���ַ������¼��״̬Ϊ1��
//����¼��״̬Ϊ0��
public class Main5 {
	public static int max=10000+7;
//public static void main(String[] args) {
//	Scanner cin=new Scanner(System.in);
//	String s1=cin.next();
//	String s2=cin.next();
//	char[] a=s1.toCharArray();
//	char[] b=s2.toCharArray();
//	int[][] dp=new int[max][max];//dp[i][j]��ʾ��a��ǰi���ʹ�b��ǰj���Ĺ��������е������
//	for (int i = 1; i < a.length; i++) {
//		for (int j = 1; j < b.length; j++) {
//			dp[i][j]=Math.max(Math.max(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]+
//					(a[i]==b[j] ? 1 : 0) );
//		}
//	}
//	System.out.println(dp[a.length-1][b.length-1]);
//	cin.close();
//	//output
//			//	abcfbc abfcab
//			//	3
//}

//�󹫹������У����ݶ�̬�滮��״̬�����ж�����Ҫ��õ������е��ַ�����Щ
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		char[] a=cin.next().toCharArray();
		char[] b=cin.next().toCharArray();
		int[][] dp=new int[max][max];
		char[] ch = new char[max]; //�����洢����������
		int ind = 0; //��¼������������ch�����е��±꣬�������һ���ǵ��ڹ��������еĳ��ȵ�
		
		int lenx = a.length;
        int leny = b.length;
        for(int i=1;i<=lenx;++i){
            for(int j=1;j<=leny;++j){
                if(a[i-1]==b[j-1]) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]); //����ǰ��Ӧλ�ò���ʱ���Ϳ��ǲ�Ҫ��a�ģ����ǲ�Ҫ��b�е�
            }
        }
        
		int i=a.length;
		int j=b.length;
		while(i!=0 && j!=0){
            if(a[i-1]==b[j-1]){
                ch[ind++]=a[--i]; //��Ϊ�ַ������Ǵ�0��ʼ�洢�ģ�����������Ҫ�ȼ��ٴ�
                j--;
            }else if(dp[i][j-1]>dp[i-1][j]) { //��Ϊǰ��lcs�����У�Ҫ����dp�ϴ�ֵ������Ҫ����a���еģ�b���оͿ�����һ��
                j--;
            }else if(dp[i][j-1]<=dp[i-1][j]){ //ͬ������Ҫ����b���еģ�������a������һ��
                i--;
            }
        }
		
		int len=dp[a.length][b.length];
		System.out.println(len);
		for (int jr = len-1; jr>=0; --jr) {//�洢��������ǹ��������е��෴���У���Ϊ�ǴӺ���ǰ���
			System.out.print(ch[jr]);
		}
		System.out.println();
		
		cin.close();
		//output
			//		abcicba
			//		abdkscab
			//		4
		
	}
}
