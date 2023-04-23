package lanqiao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	System.out.println(1);
	char s='L';
	int s1=s;
	int[] a=new int[1024];
	System.out.println(s1);
	LocalDate t1=LocalDate.now();
	System.out.println(t1.getDayOfYear());
	System.out.println(t1.getMonth());
	DateTimeFormatter f1=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
	System.out.println(f1.format(LocalDateTime.now()));
	
	cin.close();
}
}
