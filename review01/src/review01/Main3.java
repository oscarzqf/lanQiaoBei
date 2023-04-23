package review01;

import java.util.Scanner;
//线段树和树状数组了解
//树状数组模板，树状数组能解决的问题：
//可以解决大部分区间上面的修改以及查询问题
public class Main3 {
	
	//求某一位数的二进制中最后一位1所在位置表示的数//如lowbit(44)=lowbit(101100)=(100)=4;
	public static int lowbit(int x){
	    return x&(-x);
	}
	//问题引入：给出一个长度为n的数组，完成以下两种操作：将第x个数加上k与输出区间[x,y]内每个数的和
//1.单点修改区间查询
	public static int max=100000+7;
	public static int[] a = new int[max]; //原数组
	public static int[] tree = new int[max]; //树状数组
	
	//在x位置加上k,n为数组最大值
    public static void update(int x,int k,int n){
        while(x<=n){
            tree[x]+=k;
            x+=lowbit(x);
        }
    }
    //区间查询求1~x的和（即前缀和）
    public static int query(int x){
        int ans = 0;
        while(x>0){
            ans+=tree[x];
            x-=lowbit(x);
        }
        return ans;
    }
    
    //2.区间修改，区间查询
    public static int[] a1 = new int[max]; //原数组
    public static int[] sum1 = new int[max];
    public static int[] sum2 = new int[max];
    
  //在i位置加上k,n为数组最大值
    public static void update1(int i,int k,int n){
        int x = i; //后面需要i，所以不能改变i的值
        while(x<=n){
            sum1[x] +=k;
            sum2[x] +=k*(i-1);
            x+=lowbit(x);
        }
    }
    //求前缀和
    public static int query1(int i){
        int ans = 0,x=i;
        while(x>0){
            ans+=i*sum1[x]-sum2[x];
            x-=lowbit(x);
        }
        return ans;
    }
    public static void main(String[] args) {
    	Scanner cin= new Scanner(System.in);
    	int n = cin.nextInt();
        for(int i=1;i<=n;++i){
            a1[i]=cin.nextInt();
           update1(i,a1[i]-a1[i-1],n); //输入初值的时候，也相当于更新了值,差分中也是这样实现的
        }
        int x=cin.nextInt();
        int y = cin.nextInt();
        int k = cin.nextInt();
        //区间[x,y]加上k
        update1(x,k,n);
        update1(y+1,-k,n);
        //求[x,y]区间和
        int sum = query1(y) - query1(x-1);
        cin.close();

	}

    
    

    

}
