package practice;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size=0,sum=0;
		int [] array;
		try {
			System.out.print("Enter the size of array:");
			size = scan.nextInt();
			array=new int[size];
			for(int inc = 0 ; inc < size ; inc++) {				
				System.out.print("Enter "+(inc+1)+" element:");
				array[inc]=scan.nextInt();
				sum+=array[inc];
			}
		} catch (Exception e) {
		   System.out.println("Error!");
		}
		System.out.println("sum is : "+sum);
		scan.close();
	}

}
