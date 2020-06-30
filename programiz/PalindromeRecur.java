package programiz;

import java.util.Scanner;

public class PalindromeRecur {
	public boolean palind(String str) {
		if(str.length()==0 || str.length()==1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			 return palind(str.substring(1,str.length()-1));
		}
		return false;
	}
	public static void main(String[] args) {
		PalindromeRecur recur=new PalindromeRecur();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string(palindrome):");
		String str=scan.next();
		boolean res=recur.palind(str);
		if(res) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		scan.close();

	}

}
