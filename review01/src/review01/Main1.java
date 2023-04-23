package review01;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

//图的存储方式：
public class Main1 {
	public static int max=1000;
	public static void main(String[] args) {
		//1.邻接矩阵
//		Scanner cin=new Scanner(System.in);
//		int n=cin.nextInt();//n个点
//		int m=cin.nextInt();//m条边
//		int[][] G=new int[max][max];//临接矩阵
//		while(m!=0) {
//			int a=cin.nextInt(); //起点
//			int b=cin.nextInt();//终点
//			int c=cin.nextInt();//边的权重
//			G[a][b]=c;//无向图
//			G[b][a]=c;
//			
//			//G[a]][b]=c;//有向图
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
		//2.邻接表
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
