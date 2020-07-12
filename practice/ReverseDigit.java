package practice;

import java.util.Scanner;

public class ReverseDigit {
	public String digitReverse(int digit){
		String reversedDigit="";
		while(digit>0) {
			reversedDigit=reversedDigit+(digit%10);
			digit/=10;
		}
		return reversedDigit;
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	ReverseDigit rev=new ReverseDigit();
	System.out.print("Enter a Number(reverse digit):");
	int digit=scan.nextInt();
	System.out.println("Reversed digit of "+digit+" = "+rev.digitReverse(digit));
	scan.close();
	}
}
