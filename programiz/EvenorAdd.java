package programiz;

import java.util.Scanner;

public class EvenorAdd {

	public static void main(String[] args) {
		System.out.println("even or odd no");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int no1=scan.nextInt();
		if(no1 %2 ==0) {
			System.out.println("even no");
		}
		else {
			System.out.println("odd no");
		}
		
	}

}
