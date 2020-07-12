package practice;

import java.util.Scanner;

public class NewName {
	private int findSpace(String name) {
		int space=0;
		for(int ind=0;ind<name.length();ind++) {
			if(name.charAt(ind) == ' ') {
				space=ind;
			}
		}
		return space;
	}
	private void newName(int fnameSpace,int snameSpace,String fname,String sname){
		String newName1="";
		for(int inc=0;inc<fnameSpace;inc++) {
			newName1+=fname.charAt(inc);
		}
		for(int inc=snameSpace;inc<sname.length();inc++) {
			newName1+=sname.charAt(inc);
		}		
		System.out.println(newName1);
	}
	public static void main(String[] args) {
	NewName name=new NewName();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first name:");
	String fname=scan.nextLine();
	System.out.println("Enter Second name:");
	String sname=scan.nextLine();
	int fnameSpace=0,snameSpace=0;
	fnameSpace=name.findSpace(fname);
	snameSpace=name.findSpace(sname);
	name.newName(fnameSpace,snameSpace,fname,sname);
	name.newName(snameSpace,fnameSpace,sname,fname);
	scan.close();

	}
}
