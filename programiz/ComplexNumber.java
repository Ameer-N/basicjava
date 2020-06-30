package programiz;

import java.util.Scanner;

public class ComplexNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter comlex number1:");
	System.out.println("enter real part:");
	int real1=scan.nextInt();
	System.out.println("enter complex part:");
	int complex1=scan.nextInt();
	System.out.println("enter comlex number2:");
	System.out.println("enter real part:");
	int real2=scan.nextInt();
	System.out.println("enter complex part:");
	int complex2=scan.nextInt();
	System.out.println("the sum is:"+(real1+real2)+"+"+(complex1+complex2)+"i");
	}

}
