package review01;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

//ͼ�Ĵ洢��ʽ��
public class Main1 {
	public static int max=1000;
	public static void main(String[] args) {
		//1.�ڽӾ���
//		Scanner cin=new Scanner(System.in);
//		int n=cin.nextInt();//n����
//		int m=cin.nextInt();//m����
//		int[][] G=new int[max][max];//�ٽӾ���
//		while(m!=0) {
//			int a=cin.nextInt(); //���
//			int b=cin.nextInt();//�յ�
//			int c=cin.nextInt();//�ߵ�Ȩ��
//			G[a][b]=c;//����ͼ
//			G[b][a]=c;
//			
//			//G[a]][b]=c;//����ͼ
//			m=m-1;
//		}
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=n; j++) {
//				System.out.print(G[i][j]+" ");
//			}
//			System.out.println();
//		}
//		cin.close();
////		output	
////		4 4
////		1 2 7
////		1 3 7
////		2 4 7
////		1 3 7
////		0 7 7 0 
////		7 0 0 7 
////		7 0 0 0 
////		0 7 0 0 
		//2.�ڽӱ�
		Scanner cin =new Scanner(System.in);
		ArrayList[] list=new ArrayList[max];
		int n=cin.nextInt();
		int m=cin.nextInt();
		for (int i = 1; i <=n; i++) {
			list[i]=new ArrayList<Integer>();
		}
		while(m!=0) {
			int a=cin.nextInt();
			int b=cin.nextInt();
			list[a].add(b);
			list[b].add(a);
			m=m-1;
		}
		for (int i = 1; i <= n; i++) {
			int len=list[i].size();
			for (int j = 0; j <len ; j++) {
				System.out.print(list[i].get(j));
			}
			System.out.println();
		}
		cin.close();
		
		//output
//		4 4
//		1 4
//		1 3
//		2 3
//		2 4
//		43
//		34
//		12
//		12
	}
//	public static class Edge{
//		private int pre;
//		private int to;
//		private int w;
//		public int getPre() {
//			return pre;
//		}
//		public void setPre(int pre) {
//			this.pre = pre;
//		}
//		public int getTo() {
//			return to;
//		}
//		public void setTo(int to) {
//			this.to = to;
//		}
//		public int getW() {
//			return w;
//		}
//		public void setW(int w) {
//			this.w = w;
//		}
//	}

}
