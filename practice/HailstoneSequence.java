package practice;

import java.util.Scanner;

public class HailstoneSequence {
	public void printSeq(int n) {
		int steps=0;
		while(n != 1) {
			if(n % 2 == 0) {
				System.out.println(n+" is even so i take half: "+n/2);
				n/=2;
			}
			else {
				System.out.println(n+" is odd so make 3n+1: "+(3 * n + 1));
				n=3 * n + 1;
			}
			steps++;
		}
		System.out.println("There are total "+steps+" steps to reach 1");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HailstoneSequence seq = new HailstoneSequence();
		int n;
		try {
			System.out.print("Enter the Integer value to HailstoneSequence:");
			n = scan.nextInt();
		    seq.printSeq(n);
		} catch (Exception e) {
		   System.out.println("Error!");
		}
		scan.close();
	}
}
