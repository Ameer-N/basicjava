package programiz;

import java.util.Scanner;

public class Primeornot {
	private static boolean checkPrime(int no) {
		if(no%2==0)
			return false;
		for(int i=3;i*i<=no;i+=2) {
			if(no%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number(prime or not:)");
		int no=scan.nextInt();
		System.out.println(no+ ",is prime or not:"+checkPrime(no));
		scan.close();
	}
}
