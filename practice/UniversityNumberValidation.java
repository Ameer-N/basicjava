package practice;

import java.util.Scanner;

public class UniversityNumberValidation {
	private boolean  islength(String str) {
		if(str.length()==10) 
			return true;
		return false;
	}
	private boolean isOneorTwo(char ch) {
		if(ch=='1' || ch=='2')
			return true;
	  return false;
	}
	private boolean  isUpper(char ch) {
		if(ch>='A' && ch<='Z')
			return true;
		return false;
	}
	private boolean  isDigit(char ch) {
		if(ch>='0' && ch<='9')
			return true;
		return false;
	}
	private boolean  isPresent(char ch1,char ch2) {
		String [] depart= {"CS","IS","EC","ME"};
		String comp="";
		comp+=ch1;
		comp+=ch2;
	    for(String str:depart) {
	    	if(str.equals(comp))
	    	    return true;
	    }
		return false;
	}
	private  void TestUSN(String str) {
	if(islength(str) &&
	isOneorTwo(str.charAt(0)) &&
	isUpper(str.charAt(1)) &&
	isUpper(str.charAt(2)) &&
	isDigit(str.charAt(3)) &&
	isDigit(str.charAt(4)) &&
	isPresent(str.charAt(5),str.charAt(6)) &&
	isDigit(str.charAt(7)) &&
	isDigit(str.charAt(8)) &&
	isDigit(str.charAt(9))) {
		System.out.println("SUCCESS");
	}
	else {
		System.out.println("Faliure");
	}
	
	
	}
	public static void main(String[] args) {
		UniversityNumberValidation usn=new UniversityNumberValidation();
		Scanner scan = new Scanner(System.in);
		String str="1DS09CS010";
		usn.TestUSN(str);
		scan.close();
	}
}
