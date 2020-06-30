package programiz;

import java.util.Scanner;

public class ReverseRecur_2 {
	public String checkReverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return checkReverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		ReverseRecur_2 rev=new ReverseRecur_2();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string(to reverese):");
		String str=scan.next();
		String restr=rev.checkReverse(str);
		System.out.println(restr);
        scan.close();
	}

}
