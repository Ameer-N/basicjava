package programiz;

import java.util.Scanner;

public class BitwiseSwap {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no(swap with bitwise operator)");
	System.out.print("1 num: ");
	int no1=scan.nextInt();
	System.out.print("2 num: ");
	int no2=scan.nextInt();
	System.out.println("before swap:no1:"+no1+",no2:"+no2);
	no1=no1 ^ no2;
	no2=no1 ^ no2;
	no1=no1 ^ no2;
	System.out.println("After swap:no1:"+no1+",no2:"+no2);
	scan.close();

	}

}
