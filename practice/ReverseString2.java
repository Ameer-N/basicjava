package practice;
import java.util.Scanner;
public class ReverseString2{
	 String reversedStr="";
	    String temp="";
    private  boolean isLetter(char ch) {
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			   return true;
		return false;
	}
	private void printForward(char ch) {
	    reversedStr+=temp;
	    reversedStr+=ch;
	    temp="";
	}
	private void printBackward(char ch) {
	    temp=ch+temp;
	}
	private  void strRev(String str) {
		reversedStr="";
		for(int inc=0;inc<str.length();inc++) {
		    char ch=str.charAt(inc);
    		if(isLetter(ch)){
    		    printBackward(ch);
    		}
    		else{
    		    printForward(ch);
    		}
		}
	    reversedStr+=temp;
	}
	public static void main(String[] args) {
		ReverseString2 m=new ReverseString2();
        Scanner scan=new Scanner(System.in);
        m.strRev( "1 cup of hot coffee costs 8.00, whereas coffee cost 45.00.");
        System.out.println( "1 cup of hot coffee costs 8.00, whereas coffee cost 45.00.");
        System.out.print(m.reversedStr);
        m.strRev( "It Costs 25000rs for 1 LCD Projector.");
        System.out.println( "\nIt Costs 25000rs for 1 LCD Projector.");
        System.out.print(m.reversedStr);
        m.strRev( "8990.33");
        System.out.println( "\n8990.33");
        System.out.print(m.reversedStr);
		scan.close();
	}
}
