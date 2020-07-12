package practice;

import java.util.Scanner;

public class MaxNumber {
	public int getMax(int no1,int no2,int no3) {
		return no1>no2 && no1>no3?no1:no2>no3?no2:no3;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MaxNumber num = new MaxNumber();
		System.out.println("find maximum: ");
		int no1,no2,no3;
		no1=no2=no3=0;
		System.out.print("Enter 1 number:");
		no1=scan.nextInt();
		System.out.print("Enter 2 number:");
		no2=scan.nextInt();
		System.out.print("Enter 3 number:");
		no3=scan.nextInt();
	    System.out.println("Maximum number is : "+num.getMax(no1,no2,no3));
		scan.close();
	}
}
