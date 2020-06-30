package programiz;

import java.util.Scanner;

public class CharArraytoString {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter char array:");
	char [] arr={'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
    String str=new String(arr);
	System.out.println(String.valueOf(arr));
    System.out.println(String.valueOf(str) instanceof String);
    System.out.println(str);
	scan.close();
	}

}
