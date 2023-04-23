package review01;

import java.util.Scanner;

//求公共子序列长度lcs
//状态转移方程
//dp[i][j] = max(dp[i-1][j], dp[i][j-1],dp[i-1][j-1] + 
//(A[i]==B[j] ? 1 : 0))，表示在这三种状态中取到最大值。
//第一种状态表示不录入第一个序列的第i个字符是的最长公共子序列
//第二种状态表示不录入第二个序列的第j个字符是的最长公共子序列
//第三种状态表示第一个序列的前i-1个字符与第二个序列的前j-1个字符的公共
//子序列加上最后一个字符的录入状态，如果最后一个字符相等则录入状态为1，
//否则不录入状态为0；
public class Main5 {
	public static int max=10000+7;
//public static void main(String[] args) {
//	Scanner cin=new Scanner(System.in);
//	String s1=cin.next();
//	String s2=cin.next();
//	char[] a=s1.toCharArray();
//	char[] b=s2.toCharArray();
//	int[][] dp=new int[max][max];//dp[i][j]表示串a的前i个和串b的前j个的公共子序列的最长长度
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

//求公共子序列，根据动态规划的状态，来判断我们要求得的序列中的字符有哪些
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		char[] a=cin.next().toCharArray();
		char[] b=cin.next().toCharArray();
		int[][] dp=new int[max][max];
		char[] ch = new char[max]; //用来存储公共子序列
		int ind = 0; //记录公共子序列在ch数组中的下标，所以最后一定是等于公共子序列的长度的
		
		int lenx = a.length;
        int leny = b.length;
        for(int i=1;i<=lenx;++i){
            for(int j=1;j<=leny;++j){
                if(a[i-1]==b[j-1]) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]); //当当前对应位置不等时，就看是不要串a的，还是不要串b中的
            }
        }
        
		int i=a.length;
		int j=b.length;
		while(i!=0 && j!=0){
            if(a[i-1]==b[j-1]){
                ch[ind++]=a[--i]; //因为字符数组是从0开始存储的，所以这里需要先减再存
                j--;
            }else if(dp[i][j-1]>dp[i-1][j]) { //因为前面lcs方法中，要的是dp较大值，所以要的是a串中的，b串中就可以少一个
                j--;
            }else if(dp[i][j-1]<=dp[i-1][j]){ //同理，这里要的是b串中的，所以让a串中少一个
                i--;
            }
        }
		
		int len=dp[a.length][b.length];
		System.out.println(len);
		for (int jr = len-1; jr>=0; --jr) {//存储的最后结果是公共子序列的相反序列，因为是从后往前存的
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
