package programiz;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter first Number:");
		double no1=scan.nextDouble();
		System.out.print("enter Second Number:");
		double no2=scan.nextDouble();
		System.out.print("operation:(+,-,/,%):");
		char no=scan.next().charAt(0);
		double sum=0f;
		switch(no) {
		case '+':
			System.out.println("addition:");
			sum=no1+no2;
			System.out.println("sum is:"+sum);
			break;
		case '-':
			System.out.println("subtraction:");
			sum=no1-no2;
			System.out.println("sub is:"+sum);
			break;
		case '*':
			System.out.println("multipy:");
			sum=no1*no2;
			System.out.println("multipy is:"+sum);
			break;
		case '/':
			System.out.println("division:");
			sum=no1/no2;
			System.out.println("division is:"+sum);
			break;
		case '%':
			System.out.println("modulus:");
			sum=no1%no2;
			System.out.println("modulus is:"+sum);
			break;
		default:
			System.out.println("illegal operation");
		}
		scan.close();
	}

}
