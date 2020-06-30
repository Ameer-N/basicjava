package programiz;

import java.util.Scanner;

public class Chartostring {

	public static void main(String[] args) {
		System.out.println("enter char (to string:)");
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		String str=String.valueOf(ch);
		System.out.println("str is a string:"+str instanceof String);
		System.out.println(Character.toString(ch));
		String str2="ameer";
		System.out.println("char at index:"+str2.charAt(0));
		System.out.println("str->for loop:");
		for(int i=0;i<str2.length();i++) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		System.out.println("char sequence:");
		char[] seq=str2.toCharArray();
		System.out.println(seq.length);
		scan.close();

	}

}
