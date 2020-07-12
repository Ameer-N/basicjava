package practice;

import java.util.Scanner;

public class Table {
    public void printTable(int num) {
		for(int inc=1;inc<=12;inc++) {
			System.out.println(num+" * "+inc+" = "+num*inc);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Table table = new Table();
		int num;
		try {
			System.out.print("Enter the Integer value to find Tables:");
			num = scan.nextInt();
			System.out.println("7 table:");
		    table.printTable(num);
		} catch (Exception e) {
		   System.out.println("Error!");
		}
		scan.close();
	}
}
