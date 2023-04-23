package review01;  //主类名必须是Main,交代码时不要加入包名package,只需要把导入的包名加上

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;


public class main {

public static void main(String[] args)  {
/*****************************************数组操作*************************************/
//	System.out.println("请输入：");
//	System.out.println("返回值+"+a);
//	int[] ads=new int[] {1,5,2,0,1};
//	Arrays.sort(ads);
//	System.out.println(Arrays.toString(ads));
//	System.out.println(Arrays.binarySearch(ads, 5));
//	for( int i=0;i<5;++i) {
//		System.out.println(ads[i]);
//	}  
//	System.out.println(ads.length);
//	int[][] ads1=new int[3][2];
//	for (int j = 0; j < ads1.length; j++) {
//		for (int k = 0; k <  ads1[j].length; k++) {
//			System.out.println(ads1[j][k]);
//		}
//	}
//	String[] names=new String[3];
//	System.out.println(names);
//	System.out.println(names[0]);
//	System.out.println(names[1]);
//	System.out.println(names[2]);
/******************************正常输入输出***********************************/
//	Scanner cin=new Scanner(System.in);
//	float a;
//	int b,c;
//	while(cin.hasNext()){//最后会继续等待输入
//
//		a=cin.nextFloat();
//
//		b=cin.nextInt();
//
//		c=cin.nextInt();
//		
//		System.out.println();
//		System.out.println(a+" "+b+" "+c);
//		}
//	cin.close();
	
	
	/*
测试范例，最后一行要有个回车
 2 3
1 2 3
4 5 6

	 * */
//	Scanner cin2=new Scanner(System.in);
//	int a,b;
//	a=cin2.nextInt();
//	b=cin2.nextInt();
//	System.out.println();
//	int [][] data=new int[a][b];
//	for(int i=0;i<a;++i) {
//		for (int j = 0; j < b; j++) {
//			data[i][j]=cin2.nextInt();
//		}
//		System.out.println(Arrays.toString(data[i]));
//	}
	
	
/**********************************数组复制与扩充**********************************************/
//	int[] a= {2,3,4,5,6,7,8};
//	int[]b=new int[20];
//	System.arraycopy(a, 0, b, 0, 7);
//	System.out.println(Arrays.toString(b));
//	a=Arrays.copyOf(a, a.length+2); 
//	System.out.println(Arrays.toString(a));
/**********************************快速输入输出************************************************/
//	//方法需要抛异常
//	//用于数据量大时的输出，不会自动换行,输出整形需要转换成字符串否则会输出对应asllc码
//	BufferedWriter cout=new BufferedWriter(new OutputStreamWriter(System.out));
//	cout.write("sjhchd0n");
//	cout.write("csdsvf00100");
//	cout.write(33+"\n");
//	
//	//read()使用两次才能抵消回车，readLine使用一次即可
//	BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
//	int a=cin.read();//int read() 读取单个字符
//	//cin.read(cbuf);//int read(char[] cbuf) 读入字符数组
//	String s=cin.readLine();//String readLine()读取一行可读入空格
//	cout.write(a);
//	cout.write("\n");
//	cout.write(s);
//	cout.flush();//刷新缓冲区，将内容输出到控制台，不加这句无法输出
//	cout.close();
/***************************************************************************************/
	
/********************************进制转换*******************************************************/
//	//一个重要的函数：Integer.toString(k,r) ，将十进制的数k转换为r进制的数。返回一个String。
//	int k = 17;
//	System.out.println(Integer.toBinaryString(k)); //转二进制
//	System.out.println(Integer.toOctalString(k)); //转八进制
//	System.out.println(Integer.toHexString(k)); //转十六进制
//
//	int r =2;
//	System.out.println(Integer.toString(k,r)); //转r进制
//	r=8;
//	System.out.println(Integer.toString(k,r)); //转r进制
//	r=16;
//	System.out.println(Integer.toString(k,r)); //转r进制
//	System.out.println("****");
//	//函数：Integer.parseInt(str,r) ，将r进制的数字字符串str转换为十进制，并返回十进制的数。
//	System.out.println(Integer.parseInt("10001",2));
//	System.out.println(Integer.parseInt("21",8));
//	System.out.println(Integer.parseInt("11",16));


/***************************************************************************************/
	
/**********************************************保留小数位数*********************************/
//	//String.format()
//	double a = 123.456789;
//	double b = 123.444444;
//	String sa = String.format("%.2f",a);
//	System.out.println(sa);
//	String sb = String.format("%.2f",b);
//	System.out.println(sb);
//	//简写
//	System.out.println(String.format("%.2f",a));
//	System.out.println("*************");
//	//DecimalFormat的format方法
//	double a1 = 123.456789;
//	double b1 = 123.444444;
//	DecimalFormat dfa = new DecimalFormat("0.00");
//	System.out.println(dfa.format(a1));
//	DecimalFormat dfb = new DecimalFormat("0.00");
//	System.out.println(dfb.format(b1));
//	//简写
//	System.out.println(new DecimalFormat("0.00").format(a1));


/*******************************************************************************************/
	
/******************************************String**************************************/
//	//String的实例化方式 	
//	//字面量方式  --字符串常量池
//	//new+构造器的方式   --堆
//	String s1="zava1";
//	String s2=new String("java2");
//	System.out.println(s1.charAt(0));
//	System.out.println(s1.compareTo(s2));
//	System.out.println(s1.concat("zhang"));
//	System.out.println(s1.contains("ava"));
//	System.out.println(s1.endsWith("va1"));
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.substring(0,3));
	
/*************************************************************************************************/
	
	
/***************************************分割字符串************************************************/
	//split()，其中表达式就是一个正则表达式。返回的是一个字符串数组。
	
	
	//特殊情况（斜线\）
//	String s = "ab\\cd\\ef\\g\\h";
//	String[] s1 = s.split("\\\\"); //以 \ 为分割线
//	System.out.println(s);
//	int len=s1.length;
//	     for(int i=0;i<len;++i){
//	       System.out.println(s1[i]);
//	   }
	
	
	     //需要加双斜线的：+、*、$、^、
//	     String s11 = "ab+cdef+gh";
//	     String[] s1 = s11.split("\\+"); 
//	     String s12 = "ab*cdef*gh";
//	     String[] s2 = s12.split("\\*"); 
//	     String s13 = "ab$cdef$gh";
//	     String[] s3 = s13.split("\\$"); 
//	     String s14 = "ab^cdef^gh";
//	     String[] s4 = s14.split("\\^"); 
	
	
	     //其他
//	     String s = "ab,cde,fgh";
//	     String[] s1 = s.split(",");
//	     //输出
//	     ab
//	     cde
//	     fgh
	
	
//	     //多个符号作为分隔符，使用多个分隔符则需要借助 | 符号
//	String s = "ab,c+de@fgh";
//	String[] s1 = s.split(",|\\+|@"); //以逗号、加号、@为分隔符，之间用或（|）
	
	
	
//	//静态方法join()，它用指定的字符串连接字符串数组。返回一个字符串
//	String s = "ab,c+de@fgh";
//	String[] s1 = s.split(",|\\+|@");
//	System.out.println(s);
//	int len=s1.length;
//	for(int i=0;i<len;++i){
//		System.out.println(s1[i]);
//	}
//	System.out.println("===============================");
//	String s3 = String.join("****",s1);
//	System.out.println(s3);
//	//输出
//	ab,c+de@fgh
//	ab
//	c
//	de
//	fgh
//	===============================
//	ab****c****de****fgh

	     

/***************************************************************************************************/
	
/***************************************StringBuffer和StringBuilder**************************************************************/
//	StringBuilder strB = new StringBuilder();
//
//	//1、append(String str)/append(Char c)：字符串连接
//	System.out.println("StringBuilder:"+strB.append("ch").append("111").append('c'));
//	//return "StringBuilder:ch111c"
//
//	//2、toString()：返回一个与构建起或缓冲器内容相同的字符串
//	System.out.println("String:"+strB.toString());
//	//return "String:ch111c"
//
//	//3、appendcodePoint(int cp)：追加一个代码点，并将其转换为一个或两个代码单元并返回this
//	System.out.println("StringBuilder.appendCodePoint:"+strB.appendCodePoint(2));
//	//return "StringBuilder.appendCodePoint:ch111c"
//
//	//4、setCharAt(int i, char c)：将第 i 个代码单元设置为 c（可以理解为替换）
//	strB.setCharAt(2, 'd');
//	System.out.println("StringBuilder.setCharAt:" + strB);
//	//return "StringBuilder.setCharAt:chd11c"
//
//	//5、insert(int offset, String str)/insert(int offset, Char c)：在指定位置之前插入字符(串)
//	System.out.println("StringBuilder.insertString:"+ strB.insert(2, "LS"));
//	//return "StringBuilder.insertString:chLSd11c"
//	System.out.println("StringBuilder.insertChar:"+ strB.insert(2, 'L'));
//	//return "StringBuilder.insertChar:chLLSd11c"
//
//	//6、delete(int startIndex,int endIndex)：删除起始位置（含）到结尾位置（不含）之间的字符串
//	System.out.println("StringBuilder.delete:"+ strB.delete(2, 4));
//	//return "StringBuilder.delete:chSd11c"
//	
//	//String与StringBuilder相互转化
//	String ss = "abcder";
//	StringBuilder sbs = new StringBuilder(ss); //String转换为StringBuffer
//	StringBuilder resbs = sbs.reverse();
//	String news = resbs.toString(); //StringBuffer转换为String
//	System.out.println(news);
//
//	如果要操作少量的数据用 String ；
//	单线程操作大量数据用StringBuilder ；
//	多线程操作大量数据，用StringBuffer
	
	
/*****************************************************************************************************************************/

/*****************************************************位运算知识***************************************************/
//	//在博弈论中的尼姆博弈中会用到 。任何数与 0 异或等于它本身，即 n ^ 0 = n。
//	//判断奇数
//	int n=3;
//	if((n&1)==1) {
//		System.out.println("n是奇数");
//	}else{
//		System.out.println("n是偶数");
//	}
//	//两数交换
//	int a=23;int b=7;
//	a=a^b; //（1）
//	b=a^b; //（2）
//	a=a^b; //（3）
//	System.out.println(a+" "+b+" ");
//	//给你一组整型数据，这些数据中，其中有一个数只出现了一次，其他的数都出现了两次，让你找出这个数来 
//			//	public static int find(int[] arr){
//			//	    int tmp = arr[0];
//			//	    for(int i = 1;i < arr.length; i++){
//			//	        tmp = tmp ^ arr[i];
//			//	    }
//			//	    return tmp;
//			//	}
//
//	// 求一个数的n次方,这里以3的n次方为例。
//			//	public static int pow(int n){
//			//        int sum = 1;
//			//        int tmp = 3; //3的n次方，也可以改为其他数
//			//        while(n != 0){
//			//            if(n&1){ 
//			//                sum *= tmp;
//			//            }
//			//            tmp *= tmp;
//			//            n = n >> 1;
//			//        }
//			//        return sum;
//			//    }
//	//找出不大于N的最大的2的幂指数
//			//	public static int findN(int n){
//			//        n |= n >> 1;
//			//        n |= n >> 2;
//			//        n |= n >> 4;
//			//        n |= n >> 8;// 整型一般是 32 位，这里是假设 8 位。
//			//        return (n + 1) >> 1; //加1右移
//			//}
//	//两个数求平均值
//	int a6=1;
//	int b6=422;
//	int aver=(a6&b6) + ((a6^b6) >> 1);
//
//	//正常求两个数的平均数为相加除以2，但如果是两个很大的数呢？以至于相加的结果超出了所有整数类型的范围？
//	//相加的结果超出了数据的最大范围值时。这时为防止这样的两个很大的数相加的结果超出数据类型的最大值。采用新的求法。
//	int a7=100,b7=62;
//	int mid2=(b7-a7)/2+a7; //技巧算法，防止爆int
//	
//	int mid3=((b7-a7)>>1)+a7; //等价于上面
//	
//	//从数组中找出落单的数
//			//	public static void main(String[] args) {
//			//        int[] arr = {1,1,1,1,2,3,3,5,6,6,2};
//			//        int x = 0;//空二进制,此处可以理解为0000 0000, 任何数与0异或结果都是其本身
//			//        for (int i : arr) {//与数组中的每一个元素异或->两个相同的数异或消除->最后只保留剩下的数
//			//             x = x ^ i;
//			//        }
//			//        System.out.println(x);
//			//  }
//
//	//判断一个数是否为2的整数次幂 注意：如果是负数和0需要特判。
//	int n1=1024;
//    if((n1&(n1-1))==0){
//        System.out.println("YES");
//    }else {
//        System.out.println("NO");
//    }
/*************************************************************************************************************************/
/******************************************************大数	BigInteger*************************************************************/
//	Scanner cin =new Scanner(System.in);
//	String s=cin.next();
//	BigInteger bs=new BigInteger(s);
//	System.out.println(bs);
//	
//	String s1 = cin.next(); //10000
//	BigInteger bs1 = new BigInteger(s1,2); //将字符串数字当成2进制
//	System.out.println(bs1); //16
//	System.out.println(8%2);
//	output
//	1125451212
//	1125451212
//	10000000001
//	1025
//	BigInteger abs()  返回大整数的绝对值
//	BigInteger add(BigInteger val) 返回两个大整数的和
//	BigInteger and(BigInteger val)  返回两个大整数的按位与的结果
//	BigInteger andNot(BigInteger val) 返回两个大整数与非的结果
//	BigInteger divide(BigInteger val)  返回两个大整数的商
//	double doubleValue()   返回大整数的double类型的值
//	float floatValue()   返回大整数的float类型的值
//	BigInteger gcd(BigInteger val)  返回大整数的最大公约数
//	int intValue() 返回大整数的整型值
//	long longValue() 返回大整数的long型值
//	BigInteger max(BigInteger val) 返回两个大整数的最大者
//	BigInteger min(BigInteger val) 返回两个大整数的最小者
//	BigInteger mod(BigInteger val) 用当前大整数对val求模
//	BigInteger multiply(BigInteger val) 返回两个大整数的积
//	BigInteger negate() 返回当前大整数的相反数
//	BigInteger not() 返回当前大整数的非
//	BigInteger or(BigInteger val) 返回两个大整数的按位或
//	BigInteger pow(int exponent) 返回当前大整数的exponent次方
//	BigInteger remainder(BigInteger val) 返回当前大整数除以val的余数
//	BigInteger shiftLeft(int n) 将当前大整数左移n位后返回
//	BigInteger shiftRight(int n) 将当前大整数右移n位后返回
//	BigInteger subtract(BigInteger val)返回两个大整数相减的结果
//	byte[] toByteArray(BigInteger val)将大整数转换成二进制反码保存在byte数组中
//	String toString() 将当前大整数转换成十进制的字符串形式
//	BigInteger xor(BigInteger val) 返回两个大整数的异或
	
	//进制转换
//	String string1 = new BigInteger("20", 10).toString(2);
//	System.out.println("十进制的20转换成二进制是："+string1);
//
//	String string2 = new BigInteger("20", 10).toString(8);
//	System.out.println("十进制的20转换成八进制是："+string2);
//
//	String string3 = new BigInteger("20", 10).toString(16);
//	System.out.println("十进制的20转换成十六进制是："+string3);
//
//	//out
//	十进制的20转换成二进制是：10100
//	十进制的20转换成八进制是：24
//	十进制的20转换成十六进制是：14


/*****************************************************************************************************************************/
/***********************************************************小数BigDecimal************************************************/	
//	Scanner cin = new Scanner(System.in);
//	BigDecimal a,b;
//	a = cin.nextBigDecimal();
//	b = cin.nextBigDecimal();
//	System.out.println(a.add(b)); //加
//	System.out.println(a.subtract(b)); //减
//	System.out.println(a.multiply(b)); //乘
//	System.out.println(a.divide(b)); //除
//	System.out.println(a.remainder(b)); //求余
//	// a=7.3 b=3.2
//	10.5
//	4.1
//	23.36
//	2.28125
//	0.9
//		//对一个BigDecimal设置它的scale，如果精度比原始值低，那么按照指定的方法进行四舍五入或者直接截断
//		BigDecimal d1 = new BigDecimal("123.456789");
//		BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 四舍五入
//		BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 直接截断
//		System.out.println(d2); //123.4568
//		System.out.println(d3); //123.4567
//		//对BigDecimal做加、减、乘时，精度不会丢失，但是做除法时，存在无法除尽的情况，这时，就必须指定精度以及如何进行截断
//		BigDecimal d11 = new BigDecimal("123.456");
//		BigDecimal d21 = new BigDecimal("23.456789");
//		BigDecimal d31 = d11.divide(d21, 10, RoundingMode.HALF_UP); //保留10位小数并四舍五入
//		BigDecimal d41 = d11.divide(d21); // 报错：ArithmeticException，因为除不尽


/***********************************************************************************************************************/	
/**********************************************************日期Date*********************************************************/
//	//使用当前日期和时间来初始化对象。Date date = new Date();
//	//1.获取当前系统时间
//	Date date = new Date();
//	System.out.println(date);
//	System.out.println(date.toString());
//	//2.接收一个参数，该参数是从 1970 年 1 月 1 日起的毫秒数
//	Date date1 = new Date(10000000);
//	System.out.println(date1); //Thu Jan 01 10:46:40 CST 1970
//	System.out.println(date1.toString()); //Thu Jan 01 10:46:40 CST 1970
	//3.方法
		//		boolean after(Date date) 若当调用此方法的Date对象在指定日期之后返回true,否则返回false。
		//		boolean before(Date date) 若当调用此方法的Date对象在指定日期之前返回true,否则返回false。
		//		Object clone( ) 返回此对象的副本。
		//		int compareTo(Date date) 比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数。
		//		int compareTo(Object obj) 若obj是Date类型则操作等同于compareTo(Date) 。否则它抛出ClassCastException。
		//		boolean equals(Object date) 当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
		//		long getTime( ) 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
		//		void setTime(long time) 用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
		//		String toString( ) 把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
	//4.使用 SimpleDateFormat 格式化日期
//	Date date = new Date(120000000);
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	System.out.println(sdf.format(date));
//	//自定义格式  其中 yyyy 是完整的公元年，MM 是月份，dd 是日期，HH:mm:ss 是时、分、秒。
//	Date date1 = new Date(120000000);
//	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss");
//	System.out.println(sdf1.format(date1));
	
	//5.System类中的currentTimeMillis()
	//返回一个long型的数值，这个数值是当下时间与1970年1月1日零时的时间差，以毫秒为单位。最简单的一个运用是可以计算一个程序的运行时间。
//	long start = System.currentTimeMillis();
//	long end = System.currentTimeMillis();
//	long t = end - start;
	
	//6.字符串转换为时间
	//SimpleDateFormat 类有一些附加的方法，特别是parse()，它试图按照给定的SimpleDateFormat 
	//对象的格式化存储来解析字符串。format()将Date对象格式化为字符串
//	String tm = "2021年7月13日";
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");//用来解析字符串
//	Date date;
//	try {
//		date = sdf.parse(tm);
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd"); //按照格式输出时间字符串
//	System.out.printf(sdf2.format(date));
//
//	//输出
//	2021/07/13
	
	
	
	//7.Calendar类
	//Calendar类是一个抽象类,可以方便的设置（加减）和获取日期数据的特定部分。它还有个已知的子类GregorianCalendar。
	//Calender的月份MONTH是从0开始，也就是1-12月对应 0-11，但日期和年份是从1开始的。DAY_OF_WEEK从1开始，也就是周日到周六对应 1-7
	
//	Calendar c = Calendar.getInstance();//默认是当前日期,创建一个代表系统当前日期的Calendar对象
//	
//	//创建一个代表2021年7月13日的Calendar对象
//	Calendar c1 = Calendar.getInstance();
//	c1.set(2021, 7 - 1, 13);
//	
//	//方法
//	//设置值
//	public final void set(int year,int month,int date)
//	public void set(int field,int value)
//			c1.set(Calendar.DATE,10);//c1对象代表的日期设置为10号，其它所有的数值会被重新计算
//			c1.set(Calendar.YEAR,2008);//c1对象代表的年份设置为2008年，其他的所有数值会被重新计算：
//	//加值
//	c1.add(Calendar.DATE, 10);//c1对象的日期加上10，也就是c1也就表示为10天后的日期，其它所有的数值会被重新计算
//	
//	//取值
//	Calendar c1 = Calendar.getInstance();
//	// 获得年份
//	int year = c1.get(Calendar.YEAR);
//	// 获得月份
//	int month = c1.get(Calendar.MONTH) + 1; //因为是从0开始的，所以要加1
//	// 获得日期
//	int date = c1.get(Calendar.DATE);
//	// 获得小时
//	int hour = c1.get(Calendar.HOUR_OF_DAY);
//	// 获得分钟
//	int minute = c1.get(Calendar.MINUTE);
//	// 获得秒
//	int second = c1.get(Calendar.SECOND);
//	// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
//	int day = c1.get(Calendar.DAY_OF_WEEK);
	
	
	
	//8.GregorianCalendar子类，可以调用父类的属性和方法
//	public static void main(String[] args) {
//	      String months[] = {
//	      "Jan", "Feb", "Mar", "Apr",
//	      "May", "Jun", "Jul", "Aug",
//	      "Sep", "Oct", "Nov", "Dec"};
//	      
//	      int year;
//	      // 初始化 Gregorian 日历
//	      // 使用当前时间和日期
//	      // 默认为本地时间和时区
//	      GregorianCalendar gcalendar = new GregorianCalendar();
//	      // 显示当前时间和日期的信息
//	      System.out.print("Date: ");
//	      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
//	      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
//	      System.out.println(year = gcalendar.get(Calendar.YEAR));
//	      System.out.print("Time: ");
//	      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
//	      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
//	      System.out.println(gcalendar.get(Calendar.SECOND));
//	      
//	      // 测试当前年份是否为闰年
//	      if(gcalendar.isLeapYear(year)) {
//	         System.out.println("当前年份是闰年");
//	      }
//	      else {
//	         System.out.println("当前年份不是闰年");
//	      }
//	   }

//	//输出
//	Date: Dec 14 2021
//	Time: 3:51:32
//	当前年份不是闰年
	
	//9.求两个时间间隔
//    public static long getStartToEndTime(String start,String end) throws Exception{
//        String startTime = start;
//        String endTime = end;
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //时间格式根据需要变动
//        Date d1 = format.parse(startTime);
//        Date d2 = format.parse(endTime);
//        long diff = Math.abs(d1.getTime() - d2.getTime());
//        
//        System.out.println("相差 " + diff + " 毫秒");
//        long diffSeconds = diff / 1000 % 60; //秒
//        long diffMinutes = diff / (60 * 1000) % 60; //分钟
//        long diffHours = diff / (60 * 60 * 1000) % 24; //小时
//        long diffDays = diff / (24 * 60 * 60 * 1000); //天
//        System.out.print("两个时间相差：");
//        System.out.print(diffDays + " 天, ");
//        System.out.print(diffHours + " 小时, ");
//        System.out.print(diffMinutes + " 分钟, ");
//        System.out.println(diffSeconds + " 秒.");
//        System.out.println("相差 " + diffDays / 365 + " 年");
//        return diff;
//    }

	//10求日期的天数、周数、星期数
//	Date date = new Date();
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
//	System.out.println(sdf.format(date));
//	SimpleDateFormat sdf2 = new SimpleDateFormat("E 一年中的第w周、第D天 一个月中的第W周的周F 一天中的24制的第k小时（点）12制的第K小时（点）");
//	System.out.println(sdf2.format(date));
//
//	//输出
//	2021年12月14日 17时15分42秒407毫秒
//	星期二 一年中的第51周、第348天 一个月中的第3周的周2 一天中的24制的第17小时（点）12制的第5小时（点）
	
//	//*************//
//	//11.LocalDate 、LocalTime、LocalDateTime
//	//now()获取当前的日期、时间、日期加时间
//	LocalDate t1=LocalDate.now();
//	//of()设置指定的年、月、日，没有偏移量
//	LocalDate t2=LocalDate.of(1900, 1, 1);
//	//getXxx()获取相关属性
//	System.out.println(t2.getDayOfMonth());
//	System.out.println(t2.getDayOfWeek());
//	System.out.println(t2.getDayOfYear());
//	System.out.println(t2.getYear());
//	//withXxx：设置相关属性，不可变性
//	LocalDate t3=t1.withDayOfMonth(3);
//	//plusXxx:不可变性，属性加
//	LocalDate t4=t1.plusDays(1);
//	//minusXxx:不可变性，属性减
//	LocalDate t5=t1.minusDays(1);
//	//compareTo()将此日期与另一个日期比较
//	int res=t1.compareTo(t2);
//	//isLeapYear() 检查年份是否是闰年
//	boolean res1=t1.isLeapYear();
//	//toString()将此日期输出为 String ，如 2007-12-03 
//	String s1=t1.toString();
//	
//	//DateTimeFormatter格式化或解析日期、时间
//	//自定义格式，如ofPattern("yyyy-MM-dd hh:mm:ss");
//	DateTimeFormatter f1=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//	//日期---》字符串
//	String str=f1.format(LocalDateTime.now());
//	//字符串---》日期
//	static LocalDate parse(CharSequence text, DateTimeFormatter formatter) 
//	使用特定格式化 LocalDate从文本字符串获取 LocalDate的实例。 
	

	
/*******************************************************************************************************************/
	
/****************************************************Math***********************************************************/	
	//abs()绝对值
	//max()
	//min()
	//sqrt()平方根 
	//static double ceil(double a) //向上取整。返回大于等于参数的最小 double值
	//static double floor(double a) //向下取整。返回小于等于参数的最大 double值
/***************************************************************************************************************/

/*************************************************集合框架****************************************************************/
//	//1.Collection集合元素的遍历，使用迭代器
//	Collection<Integer> coll=new ArrayList<Integer>();
//	coll.add(14);
//	coll.add(44);
//	Iterator<Integer> iterator=coll.iterator();
//	while(iterator.hasNext()) {
//		int tmp=iterator.next();
//		if(tmp==14) {
//			System.out.println("0k");
//		}
//		System.out.println(tmp);
//	}
//	//2.增强for循环遍历
//	for(Integer i : coll) {
//		System.out.println(i);
//	}
	
//	//3.List接口常用方法
//	ArrayList<Integer>  l2=new ArrayList<Integer>();
//	//add(int num)增
//	l2.add(22);
//	//remove(int index)删指定位置元素
//	l2.remove(0);
//	//set(int index,Object ele)改,
//	l2.set(0, 1);
//	//get(int index)查
//	l2.get(0);
//	//add(int index,Object obj)插:在index位置插入obj
//	l2.add(1,45);
//	//boolean addAll(int index,Collection eles) 从index开始将集合eles所有元素添加到当前集合
//	//int indexof(Object obj)返回obj在集合中首次出现的位置，没有返回-1
//	//int lastIndexOf(Object obj)
//	//List subList(int fromindex,int toindex),返回[fromIndex,toIndex)子集合
//	//size()获取长度
//	l2.size();
//	//toArray()转换成数组
//	//遍历方法：iterator  / 增强for /普通循环
	
	//4.Set接口没有额外定义新的方法，使用的额都是Collection中声明过的方法
//	  Set<Integer> ttf = new TreeSet<>();
//	  Set<Integer> two = new TreeSet<>();
//		  //增加
//		  ttf.add(5); //单个增加
//		  ttf.addAll(two); //将集合two中的元素全部添加到ttf中
//		  //删除
//		  ttf.clear(); //删除所有元素
//		  ttf.remove(2); //删除指定元素
//		  ttf.removeAll(two); //删除ttf中存在于指定集合two中的元素
//
//		  //查找
//		  ttf.contains(2); //判断元素是否存在
//		  ttf.retainAll(two); //保留ttf中在指定集合two中也存在的那些元素
//		  ttf.containsAll(two);  //查看ttf是否包含指定集合two中的所有元素
//
//		  //其他操作
//		  ttf.isEmpty(); //判断ttf是否为空
//		  ttf.size(); //返回ttf里元素数量
//		  ttf.equals(two); //将指定的对象与此列表进行比较以获得相等性,当大小、内容全部相同返回true，否则返回false
//		  ttf.toArray(); //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组,也可以指定返回数组的类型
		
		  
		  //5.Map接口及常用方法，key无序不可重复，value无序可重复
//		  Map<String,Integer> map = new HashMap<>();
//		  Map<String,Integer> two = new HashMap<>();
//		  //增加
//		  map.put("key",123);
//		  map.putAll(two); //将指定map复制到此map（可选操作）。
//		  //删除
//		  map.clear(); //删除所有的映射（可选操作）。
//		  map.remove("key"); //如果存在，从该地图中删除一个键的映射。
//		  map.remove("key",159); //删除符合的键值对
//		  //查找
//		  map.containsKey("key"); //如果此映射包含指定键的映射，则返回 true 。
//		  map.containsValue("value"); //如果此地图将一个或多个键映射到指定的值，则返回 true 。
//		  map.entrySet(); //返回包含映射的Set集合,返回类型 Set<Map.Entry<K,V>>
//		  map.get("key"); //返回指定键所映射的值，如果没有此键则返回null
//		  map.getOrDefault("key",456); //返回指定键所映射的值，如果没有则返回设置的默认值。
//		  map.keySet(); //返回包含的键的Set集合。Set<K>
//		  map.values(); //返回包含的值的Collection集合。 Collection<V>
//		  //替换
//		  map.replace("key", 456); //找到指定的键，修改并返回原来的值。
//		  map.replace("key", 123, 789); //找到key为key，值为123的，才将123修改为789。否则不修改。
//		  //其他
//		  map.isEmpty(); //如果不包含键值映射，则返回 true 。
//		  map.equals("156"); //将指定的对象与此映射进行比较
//		  map.putIfAbsent("key",789); //如果指定的键尚未与某个值相关联（或映射到 null ）,则将其与给定值相关联并返回 null ，如果已经有关联的值，则返回。
//		  map.size(); //键值对的数量
//		  
//		  //遍历 Map.Entry是Map的一个内部接口。配合Map使用。主要的三个方法。K getKey()：V getValue()：V setValue(V value)
//		  LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
//		  lm.put("C",3);
//		  lm.put("A",1);
//		  lm.put("B",2);
//		  lm.put("D",4);
//		  Set<Map.Entry<String, Integer>> ent = lm.entrySet();
//		  Iterator<Map.Entry<String, Integer>> it = ent.iterator();
//		  while(it.hasNext()){
//		    Map.Entry<String,Integer> mid = it.next();
//		    System.out.println(mid.getKey());
//		    System.out.println(mid.getValue());
//		  }		
		
		//6.Stack栈
		//size()
		//empty()测试此堆栈是否为空。
		//peek()查看栈顶元素。
		//pop()删除栈顶元素，并将该元素作为返回值返回
		//push(E item) 添加元素到堆栈的顶部
		//search(Object o)返回一个对象在此堆栈上的基于1的位置。
//	Stack<Integer> s = new Stack<Integer>();
//	System.out.println(s.empty()? "是空的":"不是空的");
//	s.push(15);
//	s.push(16);
//	while(!s.empty()) {
//		System.out.println(s.peek());
//		System.out.println(s.pop());
//	}
	
		//7.队列
		//	压入元素(添加)：add()、offer()
		//	相同：未超出容量，从队尾压入元素，并返回压入的元素。
		//	区别：在超出容量时，add()方法会对抛出异常，offer()返回false
		//
		//	弹出元素(删除)：remove()、poll()
		//	相同：容量大于0的时候，删除并返回队头元素。
		//	区别：在容量为0的时候，remove()会抛出异常，poll()返回false
		//
		//	获取队头元素(不删除)：element()、peek()
		//	相同：容量大于0的时候，都返回队头元素。但是不删除。
		//	区别：容量为0的时候，element()会抛出异常，peek()返回null。
		//
		//LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
	        //add()和remove()方法在失败的时候会抛出异常(不推荐)
//	        Queue<String> queue = new LinkedList<String>();
//	        //添加元素
//	        queue.offer("a");
//	        queue.offer("b");
//	        queue.offer("c");
//	        queue.offer("d");
//	        queue.offer("e");
//	        for(String q : queue){
//	            System.out.println(q);
//	        }
//	        
//	        System.out.println("===");
//	        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
//	        for(String q : queue){
//	            System.out.println(q);
//	        }
//	        
//	        System.out.println("===");
//	        System.out.println("element="+queue.element()); //返回第一个元素 
//	        for(String q : queue){
//	            System.out.println(q);
//	        }
//	        
//	        System.out.println("===");
//	        System.out.println("peek="+queue.peek()); //返回第一个元素 
//	        for(String q : queue){
//	            System.out.println(q);
//	        }
	
	
		//8.Deque双端队列
		//		普通队列(一端进另一端出):
		//		Queue queue = new LinkedList()或Deque deque = new LinkedList()
		//		双端队列(两端都可进出)
		//		Deque deque = new LinkedList()
		//		堆栈
		//		Deque deque = new LinkedList()
	    //当作普通队列，就用普通队列的方法，当作双端队列就用双端队列的方法，当作堆栈就用堆栈的方法
	 	
	
		//9.PriorityQueue（优先队列）
				//	peek()//返回队首元素
				//	poll()//返回队首元素，队首元素出队列
				//	add()//添加元素
				//	offer()//添加元素
				//	size()//返回队列元素个数
				//	isEmpty()//判断队列是否为空，为空返回true,不空返回false
				//toArray()转成数组后遍历
	//不用比较器，默认升序排列
//    Queue<Integer> q = new PriorityQueue<>();
//    q.add(3);
//    q.add(2);
//    q.add(4);
//    while(!q.isEmpty())
//    {
//        System.out.print(q.poll()+" ");
//    }
    
		//  //自定义比较器，降序排列
		//    static Comparator<Integer> cmp = new Comparator<Integer>() {
		//          public int compare(Integer e1, Integer e2) {
		//            return e2 - e1;
		//          }
		//        };
		//    Queue<Integer> qq = new PriorityQueue<>(cmp);
		//    qq.add(3);
		//    qq.add(2);
		//    qq.add(4);
		//    while(!qq.isEmpty())
		//    {
		//        System.out.print(qq.poll()+" ");
		//    }
	
	
//	辗转相除法求最大公约数
//	int gcd(int a,int b) {
//		return b==0?a:gcd(b,a%b);
//	}
	
	
//	素数
//	int m=0;
//	for (int i = 2; i <n; i++) {
//		if(n%i==0) {
//			m++;
//		}
//	}
//	if(m==0) {
//		true;
//	}else {
//		false;
//	}
	
//	DFS
//	void dfs(int d, int c) {
//		if(d==n) {
//			if(c>ans) ans=c; return;
//		}
//		dfs(d+1,c+w[i]);
//		dfs(d+1,c);
//	}
	
	
//	打表，写出输出数组直接给结果
	
//	计算器程序员模式
	
//	巧用替换：统计字符某一个字符的数，输出所以结果后复制到word查找计数
	
//	数字计算excel
	
//	走迷宫等可以手动数
	
//	for循环暴力求解

//	特判:相想出几个结果，if输出
//	if(x==1) cout
//	if(x==2) cout
//	.
//	.
//	.
	
//	2022040820220408
	
	
	

/*****************************************************************************************************************/
	

}

}
