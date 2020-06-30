package programiz;

import java.util.Scanner;

public class VowelorConsonent {
    private static void check(char ch) {
    	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
	    	if(ch>=65 && ch<=92) {
	    		ch=(char)(ch-'A'+'a');
	    	}
	    	switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(ch+" is vowel");
			break;
			default:
				System.out.println(ch+" is consonents");
			}
    	}
    	else {
    		System.out.println("not a character it seems like integer or special character!");
    	}
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("enter char to check(vowels/consonent)");
        char ch=scan.next().charAt(0);
        scan.close();
        check(ch);
	}

}
