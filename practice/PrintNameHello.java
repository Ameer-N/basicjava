package practice;

import java.util.Scanner;

public class PrintNameHello {
	public void printHello(String name){
		System.out.println("Hello,"+name+"!");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintNameHello hello = new PrintNameHello();
		System.out.print("Enter your Name : ");
		String name = scan.nextLine();
	    hello.printHello(name);
		scan.close();
	}
}
