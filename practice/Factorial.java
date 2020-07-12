package practice;

import java.util.Scanner;

public class Factorial {
	public int checkFact(int num) {
		if(num < 2)
			return 1;
		return num * checkFact(num - 1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Factorial fact = new Factorial();
		int num = 0,result = 0;
		try {
			System.out.print("Enter the Integer value to find factorial:");
			num = scan.nextInt();
			result = fact.checkFact(num);
			System.out.println("Factorial of "+num+" is = "+result);
		} catch (Exception e) {
		   System.out.println("Error:mismatched value!Expected Integer");
		}
		scan.close();
		
	}
}
