package review01;

import java.util.Scanner;

//manachaer求最长回文子串模板
public class Main6 {

	 public static int maxd = 100000+7;
	    public static char[] s = new char[maxd];
	    public static char[] t = new char[maxd*2+5];
	    public static int[] p = new int[maxd];
	    public static int rcen = 0; //记录处理后的串 的回文串 的 中心
	    public static int rlen = 0; //分别是记录处理后的串 的回文串 的 长度

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
                rlen = p[i];    //这里的rlen就像相当与是ans+1，即这里的p[i]改成p[i]-1后就是ans，即回文串的长度。
                rcen = i;	//这个if判断并不影响ans，
                //只是用来方便记录回文串的位置和长度好在原串中再输出回文串。这里的rlen与ans意思都是一样的，都是回文串的长度
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str=cin.next();
		s=str.toCharArray();
		int n=manacher(s);
		int begin=(rcen-rlen)/2;//(rcen-rlen)/2 为原串中的起始下标位置
		System.out.println("回文串的长度为 "+n);
        System.out.println("回文串在原串中的起始位置为："+begin+" -> 回文串长度为："+(rlen - 1)); // rlen-1也为回文串的长度，即这里与 n和方法中的ans是相等的,本质看manacher方法中的ans是如何得出的
        for (int i = begin; i < begin+n; i++) {//输出回文串，等于不能写
            System.out.print(str.charAt(i));
        }
        System.out.println();
        cin.close();
        //output
        	//babad
			//        回文串的长度为 3
			//        回文串在原串中的起始位置为：0 -> 回文串长度为：3
			//        bab
	}

}
