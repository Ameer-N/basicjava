package programiz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome_2 {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter string");
	 String str=scan.next();
	 scan.close();
	 Stack<Character> stack=new Stack<Character>();
	 for(int i=0;i<str.length();i++) {
		 stack.push(str.charAt(i));
	 }
	 
	 String reversedStr="",reversedStr1="";
	while(!stack.isEmpty()) {
		reversedStr=reversedStr+stack.pop();
	}
	System.out.println("stack");
	System.out.println(str+" is palindrome:"+str.equals(reversedStr));
	Queue<Character> queue=new LinkedList<Character>();
    for(int i=str.length()-1;i>=0;i--) {
    	queue.add(str.charAt(i));
    }
    while(!queue.isEmpty()) {
    	reversedStr1+=queue.remove();
    }
    System.out.println("queue");
    System.out.println(str+" is palindrome:"+str.equals(reversedStr1));
	
	
	
	}

}
