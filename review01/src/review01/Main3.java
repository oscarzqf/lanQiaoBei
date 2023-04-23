package review01;

import java.util.Scanner;
//�߶�������״�����˽�
//��״����ģ�壬��״�����ܽ�������⣺
//���Խ���󲿷�����������޸��Լ���ѯ����
public class Main3 {
	
	//��ĳһλ���Ķ����������һλ1����λ�ñ�ʾ����//��lowbit(44)=lowbit(101100)=(100)=4;
	public static int lowbit(int x){
	    return x&(-x);
	}
	//�������룺����һ������Ϊn�����飬����������ֲ���������x��������k���������[x,y]��ÿ�����ĺ�
//1.�����޸������ѯ
	public static int max=100000+7;
	public static int[] a = new int[max]; //ԭ����
	public static int[] tree = new int[max]; //��״����
	
	//��xλ�ü���k,nΪ�������ֵ
    public static void update(int x,int k,int n){
        while(x<=n){
            tree[x]+=k;
            x+=lowbit(x);
        }
    }
    //�����ѯ��1~x�ĺͣ���ǰ׺�ͣ�
    public static int query(int x){
        int ans = 0;
        while(x>0){
            ans+=tree[x];
            x-=lowbit(x);
        }
        return ans;
    }
    
    //2.�����޸ģ������ѯ
    public static int[] a1 = new int[max]; //ԭ����
    public static int[] sum1 = new int[max];
    public static int[] sum2 = new int[max];
    
  //��iλ�ü���k,nΪ�������ֵ
    public static void update1(int i,int k,int n){
        int x = i; //������Ҫi�����Բ��ܸı�i��ֵ
        while(x<=n){
            sum1[x] +=k;
            sum2[x] +=k*(i-1);
            x+=lowbit(x);
        }
    }
    //��ǰ׺��
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
           update1(i,a1[i]-a1[i-1],n); //�����ֵ��ʱ��Ҳ�൱�ڸ�����ֵ,�����Ҳ������ʵ�ֵ�
        }
        int x=cin.nextInt();
        int y = cin.nextInt();
        int k = cin.nextInt();
        //����[x,y]����k
        update1(x,k,n);
        update1(y+1,-k,n);
        //��[x,y]�����
        int sum = query1(y) - query1(x-1);
        cin.close();

	}

    
    

    

}
