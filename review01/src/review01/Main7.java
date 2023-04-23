package review01;

import java.util.Scanner;

//计算最长上升子序列的长度



public class Main7 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=228;
		int[] res=new int[456];
		
		for (int i = 0; i < res.length; i++) {
			res[i]=cin.nextInt();
		}
		int nv=0;
		for (int i = 0; i <228; i++) {
			if(res[i]==0&&res[228+i]==5) {
				nv++;
			}
		}
		System.out.println(nv);
//		int n1=0;
//		int n2=0;
//		int n3=0;
//		int n4=0;
//		int n5=0;
//		int add=0;
//		for (int j = 0; j < res.length; j++) {
//		if(res[j]==1) n1++;
//		else if(res[j]==2)n2++;
//		else if(res[j]==3)n3++;
//		else if(res[j]==4)n4++;
//		else n5++;
//		
//		add=add+res[j];
//		}
//	System.out.println(n1);
//	System.out.println(n2);
//	System.out.println(n3);
//	System.out.println(n4);
//	System.out.println(n5);
	}

}