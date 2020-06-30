package programiz;

import java.util.Scanner;

public class QuotandRem {
    private static void checkqr(double no1,double no2) {
		System.out.printf("Quot:%.2f,rem:%.2f",(no1/no2),(no1%no2));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number1:");
		double no1=scan.nextDouble();
		System.out.println("Enter number2:");
		double no2=scan.nextDouble();	
		checkqr(no1,no2);
		scan.close();

	}

}
