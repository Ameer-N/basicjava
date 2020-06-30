package programiz;

import java.util.Scanner;

public class CheckPalindrome {
    Character[] thearray;
    int arraySize;
    int topvalue=-1;
    public CheckPalindrome(int size) {
	  arraySize=size;
	  thearray=new Character[size];
	}
    public void push(char str) {
		if(topvalue+1<=arraySize) {
			thearray[++topvalue]=str;
		}
		else {
			System.out.println("stack is full!");
		}
	}
    public void pop() {
    	int flag=0;
		if(topvalue-1>=0) {
		 for(int i=0;i<arraySize/2;i++) {
	    	  if(thearray[i]==thearray[topvalue]) {
	    		  --topvalue;
	    		  flag=1;
	    	  }
	    	  else {
	    		  System.out.println("not a palindrome");
	    		  flag=0;
	    		  break;
	    	  }
		 }
		 if(flag==1)
			 System.out.println("it is palindrome!");
     	}
		else {
			System.out.println("stack is full!");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string:");
		String str=scan.next();
		CheckPalindrome check=new CheckPalindrome(str.length());
		scan.close();
		for(int i=0;i<str.length();i++)
		    check.push(str.charAt(i));
		check.pop();	
	}

}
