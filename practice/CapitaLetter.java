package practice;


import java.util.Scanner;

public class CapitaLetter {
	public void printCapital(String str) {
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				newStr+=ch;
			}
		}
		System.out.print("newString is "+newStr);
	}
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    CapitaLetter capital = new CapitaLetter();
    System.out.print("Enter String:");
    String str=scan.next();
    capital.printCapital(str);
    scan.close();
	}
}
