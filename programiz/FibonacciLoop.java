package programiz;

import java.util.Scanner;

public class FibonacciLoop {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int first=0,second=1,sum=0;
		System.out.println("enter limit to get fibonacci series:");
		int no=scan.nextInt();
		scan.close();
		for(int i=1;i<=no;i++) {
			System.out.print(first+" ");
			sum=first+second;
			first=second;
			second=sum;
		}
	}

}
