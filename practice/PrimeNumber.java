package practice;

import java.util.Scanner;

public class PrimeNumber {
	public void isPrime(long num){
		int flag=0;
		if(num%2==0 && num !=2 || num==1) {
			flag=1;
		}
		for(long inc=3;inc*inc<=num;inc+=2) {
			if(num%inc==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(num+" true");
		else
			System.out.println(num+" false ");
	}
	public static void main(String[] args) {
		PrimeNumber prime=new PrimeNumber();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to check(isprime/or not prime):");
		System.out.print("Enter limit:");
		int limit=scan.nextInt();
		long [] arr = new long[limit];
		for(int inc=0;inc<limit;inc++){
			System.out.print("Enter "+(inc+1)+" number:");
			arr[inc]=scan.nextLong();
		}
		for(long val:arr)
	     	prime.isPrime(val);
		
		scan.close();
	}

}
