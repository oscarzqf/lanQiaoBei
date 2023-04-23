package review01;

import java.util.Scanner;

//�������������ģ��
//��Ϊ����������ͷ����������飬��һά������¿��Ե�ͬ���Ӵ��������е�����

//���������飺
//����һ����A[ i ]������A[ i ] ������ۼ����Ǹ�����ô����A[ i ] ��ʹ��ֵ��С��A[ i ]��
//��Ϊ�ۼ�ֵ����������й��׵ġ����ǰ�����ۼ�ֵ����������Ϊ�к����ܺ͡�

//һά
//��̬�滮���㷨ʱ�临�Ӷȣ�O(n)
//����һ����A[ i ]������A[ i ] ������ۼ����Ǹ���
//��ô����A[ i ] ��ʹ��ֵ��С��A[ i ]����Ϊ�ۼ�ֵ����������й��׵ġ�
//���ǰ�����ۼ�ֵ����������Ϊ�к����ܺͣ�Ӧ������
//dp[ i ]��ʾ��a[ i ]��β�ġ���������������͡�������������������������͡�
//dp[i]=dp[i-1]+a[i] dp[i-1]>0
//dp[i]=a[i]         dp[i-1]<=0
//��dp[i]=max{dp[i-1]+a[i],a[i]}
//��ʼ״̬dp[0]=a[0]
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
//		int ans=a[0];//ans�洢���Ĵ�
//		dp[0]=a[0];//��ʼ����һ��Ĭ�����Լ�
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
	
//��ά
//	����άת��Ϊһά������㣬Ȼ�����һά��������������⡣
//	��������ÿһ����һ��ǰ׺�ͣ��õ�һ��һά���顣
//	ʱ�临�Ӷȣ�O(n*n*m)
	//��һά��������������
    public static int getOne(int[]a,int n){ //nΪ���ȣ�a�������±��1��ʼ�洢��
        int[] dp = new int[max]; //dp[i]��ʾ��a[i]��β�ġ���������������͡�
        int ans = a[1]; //ans�����洢���Ĵ�
        dp[1]=a[1]; //��ʼ����һ����Ĭ�������Լ�
        for(int i=1;i<=n;++i){ //���a�����Ǵ�0��ʼ��ģ��������ӵڶ�������ʼ�����������±�Ϊ 0-1=-1 �����.�����������1��2��ʼ����
            dp[i]=Math.max(dp[i-1]+a[i],a[i]);
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }

	public static int max = 200000+7;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();//��
		int m=cin.nextInt();//��
		int[][] a=new int[100][100];//ԭ����
		for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                a[i][j] =cin.nextInt();
            }
        }
		//��ÿһ�е�ǰ׺�ͣ�ÿһ���дӵ�һ�е���i�еĺ�
        int[][] p = new int[105][105]; //p[i][j]��ʾj��һ�е�ǰi�����ĺ�
        for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                p[i][j]=p[i-1][j]+a[i][j];
            }
        }
        int maxans = 0;
        for(int i=1;i<=n;++i){ //��i��
            for(int j=i;j<=n;++j){ //�����һ��
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
