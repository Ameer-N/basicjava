package practice;

import java.util.Scanner;

public class PasswordGenerate {
	String passWord="",fname,mname,lname;
	int age;
    public PasswordGenerate(String fname,String mname,String lname,int age) {
    this.fname=fname;
    this.mname=mname;
    this.lname=lname;
    this.age=age;
	}
    private void findInitial(String str) {
    	for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				passWord+=ch;
			}
		}
	}
    private void addNumber(int age) {
		passWord+=age;
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter firstname:");
    String fname=scan.next();
    System.out.print("Enter middlename:");
    String mname=scan.next();
    System.out.print("Enter lastname:");
    String lname=scan.next();
    System.out.print("Enter age:");
    int age=scan.nextInt();
    PasswordGenerate pg = new PasswordGenerate(fname,mname,lname,age);
    pg.findInitial(fname);
    pg.findInitial(mname);
    pg.findInitial(lname);
    pg.addNumber(age);
    System.out.println("the password is:"+pg.passWord);
        scan.close();
	}
}
