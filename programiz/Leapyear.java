package programiz;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter year to check(leap/not leap):"); 
	int year=scan.nextInt();
	if(year%4==0 && year%100!=0 || year%400==0) {
		System.out.println(year+" is leap year");
		
	}
	else {
		System.out.println(year+" is not leap year");
	}
	}
}
