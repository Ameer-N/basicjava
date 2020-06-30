package programiz;

import java.util.Scanner;

public class PositiveOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no to check wht is :(pos/neg)");
		long no=scan.nextLong();
		if(no==0) {
			System.out.println(no+" is neither positive nor positive ");
		}
		else if(no>0) {
			System.out.println(no+" is positive");
		}
		else {
			System.out.println(no+" is negative");
		}
		scan.close();
	}

}
