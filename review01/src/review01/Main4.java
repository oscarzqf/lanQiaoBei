package review01;

import java.util.Scanner;

//连续最大子数组模板
//分为连续子数组和非连续子数组，在一维的情况下可以等同于子串和子序列的最大和

//连续子数组：
//对于一个数A[ i ]，若是A[ i ] 的左边累计数非负，那么加上A[ i ] 能使得值不小于A[ i ]，
//认为累计值对整体和是有贡献的。如果前几项累计值负数，则认为有害于总和。

//一维
//动态规划：算法时间复杂度：O(n)
//对于一个数A[ i ]，若是A[ i ] 的左边累计数非负，
//那么加上A[ i ] 能使得值不小于A[ i ]，认为累计值对整体和是有贡献的。
//如果前几项累计值负数，则认为有害于总和，应丢弃。
//dp[ i ]表示以a[ i ]结尾的「连续子数组的最大和」，不是整个数组的最大子数组和。
//dp[i]=dp[i-1]+a[i] dp[i-1]>0
//dp[i]=a[i]         dp[i-1]<=0
//即dp[i]=max{dp[i-1]+a[i],a[i]}
//初始状态dp[0]=a[0]
public class Main4 {
//	public static int max=200000+7;
//	public static void main(String[] args) {
//		Scanner cin=new Scanner(System.in);
//		int n=cin.nextInt();
//		int[] a=new int[max];
//		int[] dp=new int[max];
//		for (int i = 0; i < n; i++) {
//			a[i]=cin.nextInt();
//		}
//		int ans=a[0];//ans存储最后的答案
//		dp[0]=a[0];//初始化第一个默认是自己
//		for (int i =1 ; i < n; i++) {
//			dp[i]=Math.max(dp[i-1]+a[i], a[i]);
//			ans=Math.max(ans, dp[i]);
//		}
//		System.out.println(ans);
//		cin.close();
//		//output
//			//		9
//			//		-2 1 -3 (4 -1 2 1) -5 4
//			//		6
//	}
	
//二维
//	将二维转化为一维数组计算，然后计算一维的最大子数组问题。
//	方法：将每一列求一个前缀和，得到一个一维数组。
//	时间复杂度：O(n*n*m)
	//求一维数组的最大子数组
    public static int getOne(int[]a,int n){ //n为长度，a数组是下标从1开始存储的
        int[] dp = new int[max]; //dp[i]表示以a[i]结尾的「连续子数组的最大和」
        int ans = a[1]; //ans用来存储最后的答案
        dp[1]=a[1]; //初始化第一个数默认是它自己
        for(int i=1;i<=n;++i){ //如果a数组是从0开始存的，这里必须从第二个数开始，否则会存在下标为 0-1=-1 的情况.而现在这里从1或2开始都行
            dp[i]=Math.max(dp[i-1]+a[i],a[i]);
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }

	public static int max = 200000+7;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();//行
		int m=cin.nextInt();//列
		int[][] a=new int[100][100];//原数组
		for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                a[i][j] =cin.nextInt();
            }
        }
		//求每一列的前缀和，每一列中从第一行到第i行的和
        int[][] p = new int[105][105]; //p[i][j]表示j这一列的前i个数的和
        for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                p[i][j]=p[i-1][j]+a[i][j];
            }
        }
        int maxans = 0;
        for(int i=1;i<=n;++i){ //第i行
            for(int j=i;j<=n;++j){ //到最后一行
                maxans=Math.max(maxans,getOne(p[i],m));
            }
        }
		//output
			//		2 3
			//		1 2 3
			//		3 -1 4
			//		12
	}
	
	
	
	
	
}
