package practice;

import java.util.Scanner;
public class ReverseString{
    String reversedStr="";
    private  boolean isLetter(char ch) {
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			return true;
		return false;
	}
	private void printForward(String str,int inc,int space) {
		for(int jnc=inc-1;jnc>space;jnc--){
		    reversedStr+=str.charAt(jnc);
		}
		reversedStr+=' ';
	}
	private void printBackward(String str,int inc,int space) {
		for(int jnc=space+1;jnc<inc;jnc++){
		    reversedStr+=str.charAt(jnc);
		}
		reversedStr+=' ';
	}
	private  void strRev(String str) {
		int space=-1;
		for(int inc=space+1;inc<str.length();inc++) {
			if(str.charAt(inc)==' '){
			   if(isLetter(str.charAt(space+1))){
			       printForward(str,inc,space);
			   }
			   else{
			       printBackward(str,inc,space);
			   }
			space=inc;
			}
		}
		if(isLetter(str.charAt(space+1))){
		    printForward(str,str.length(),space);
		}
		else{
			printBackward(str,str.length(),space);
	    }
	}
	public static void main(String[] args) {
		ReverseString m=new ReverseString();
        Scanner scan=new Scanner(System.in);
        String str="1 cup of hot coffee costs 8.00, but coffee is pt.";
        m.strRev(str);
         System.out.println(str);
        System.out.println(m.reversedStr);
		scan.close();
	}
}
