package programiz;

import java.util.Scanner;

public class CheckPalindrome_3 {
 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string:");
		String str=scan.next();
		String reversedStr="",reversedStr1="";
		for(int i=str.length()-1;i>=0;i--) {
			reversedStr+=str.charAt(i);
		}
		System.out.println("for loop:");
		System.out.println(str+" is palindrome:"+str.equals(reversedStr));
		scan.close();
		int i=str.length()-1;
		while(i>=0) {
			reversedStr1+=str.charAt(i);
			i--;
		}
		System.out.println("while loop:");
		System.out.println(str+" is palindrome:"+str.equals(reversedStr1));
	}

}
