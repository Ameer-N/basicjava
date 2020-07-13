package practice2;

import java.util.Scanner;

public class MenuPalindrome {
	public void checkPalind(String tostr) {
		int half=tostr.length()/2,flag=0;
		int length=tostr.length()-1;
		for(int inc=0;inc<half;inc++) {
			if(tostr.charAt(inc)==tostr.charAt(length--)) {
				flag++;
			}
		}
		if(flag==half) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	public static void main(String[] args) {
		MenuPalindrome menu = new MenuPalindrome();
		Scanner scan = new Scanner(System.in);
		int again=0;
		while(again==0) {
			int option=1;
			String str="";
			while(option!=3) {
				System.out.println("Select the below menu option:");
				System.out.println(str+"1.Enter number to check palindrome\n"
						+ "2.Enter string to find palindrome\n"
						+"3.Exit");
				System.out.println("Enter option:");
		        option= scan.nextInt();
			    switch (option) {
					case 1: 
						System.out.println("enter number");
						int no =scan.nextInt();
						String tostr=Integer.toString(no);
						menu.checkPalind(tostr);
						break;
					case 2: 
						System.out.println("enter String");
					    String string = scan.next();
						menu.checkPalind(string);
						break;
					case 3: 
						System.out.println("Exits");
						break;
				    default:
				    	System.out.println("enter option is wrong");
			       }
			    str="reenter";
			}
		    System.out.print("do you want to re run the program again:(y/n): ");
		    if(scan.next().charAt(0) == 'y') {
		    	again=0;
		    }
		    else {
		    	System.out.println("exited completely");
		    	again=1;
		    }    	
	    }
        scan.close();
	    }
}
