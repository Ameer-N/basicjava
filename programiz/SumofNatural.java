package programiz;

import java.util.Scanner;

public class SumofNatural {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the limit (sum of natural number):");
	int range=scan.nextInt(),sum=0;
	while(range>0) {
		sum+=range;
		range--;
	}
	System.out.println("sum of n natural number is : "+sum);
	scan.close(); 

	}

}
