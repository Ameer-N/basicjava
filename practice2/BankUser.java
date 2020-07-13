package practice2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CompareByName implements Comparator<BankUser> {

    @Override
    public int compare(BankUser b1, BankUser b2) {

        return b1.name.compareTo(b2.name);
    }
}
public class BankUser{
	static int no =100;
	int accountNumber;
	String name;
	String accountType;
	String dateOfBirth;
	int balance;
	String address;
	public void generateAccountNumber() {
		accountNumber=no++;
	}
	public  BankUser(String name,String acctype,String dob,int balance,String address) {
		this.name=name;
		this.accountType=acctype;
		this.dateOfBirth=dob;
		this.balance=balance;
		this.address=address;
		generateAccountNumber();
	}
	@Override
	public String toString() {
		return name+" "+accountNumber+" "+accountType+" "+dateOfBirth+" "+balance+" "+address+",\n";
	}
	public static boolean checkAccountno(int accno,List<BankUser> list) {
		boolean isValid=false;
		for(BankUser val:list) {
			if(val.accountNumber == accno) {
				return !isValid;
			}
		}
		return isValid;
	}
	public static void changeName(int accno,String updname,List<BankUser> base){
		for(BankUser val:base) {
			if(val.accountNumber == accno) {
				val.name=updname;
			}
		}
	}
	public static void changeadd(int accno,String updadd,List<BankUser> base){
		for(BankUser val:base) {
			if(val.accountNumber == accno) {
				val.address=updadd;
			}
		}
	}
	public static void deluser(int accno,List<BankUser> base){
		int index=-1;
		for(BankUser val:base) {
			index++;
			if(val.accountNumber == accno) {
				break;
			}
		}
		base.remove(index);
	}
	
	public static void displayAcc(int disaccno,List<BankUser> base){
		for(BankUser val:base) {
			if(val.accountNumber == disaccno) {
				System.out.println("user details");
				System.out.println(val);
			}
		}
	}
	public static void displayName(String disName,List<BankUser> base){
		for(BankUser val:base) {
			if(val.name.equals(disName)) {
				System.out.println("user details");
				System.out.println(val);
			}
		}
	}
	public static void displayNonZero(List<BankUser> base){
		for(BankUser val:base) {
			if(val.balance >0 ) {
				System.out.println(val);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BankUser> base= new ArrayList<BankUser>();
		String name;
		String accountType;
		String dateOfBirth;
		int balance;
		String address;
		int option=1;
		System.out.println("Welcome to bank:");
		while(option !=5 ) {
			System.out.println("1.create new account\n2.update existing account\n3.delete\n4.display\n5.Exit");		
			System.out.print("enter your option: ");
			option= scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("create your account by filing below details :");
				System.out.print("Enter your name :");
				name=scan.next();
				System.out.print("Enter your accounttype:(saving/loan/current): ");
				accountType=scan.next();
				System.out.print("Enter your dateofbirth(dd/mm/yyyy):");
				dateOfBirth = scan.next();
				System.out.print("Enter your Amount to your account:");
			    balance = scan.nextInt();
			    System.out.print("Enter address:");
			    scan.nextLine();
				address = scan.nextLine();
				BankUser bank = new BankUser(name,accountType,dateOfBirth,balance,address);
				base.add(bank);
				System.out.println(base);
		        break;	
			case 2:
				System.out.print("update exiting data:");
				System.out.println("1.update name \n 2.update address");
				System.out.print("enter option: ");
				int updoption =scan.nextInt();
				System.out.print("enter account number:");
				int accno = scan.nextInt();
				boolean isValid = checkAccountno(accno,base);
				System.out.println(isValid);
				if(isValid) {
					if(updoption ==1) {
						System.out.print("Enter new username:");
					    String updname = scan.next();
					    changeName(accno,updname,base);			
					}
					else if(updoption ==2) {
						System.out.print("Enter new address:");
					    String updadd = scan.next();
					    changeadd(accno,updadd,base);	
					}
				}
				System.out.println(base);
				break;
			case 3:
				System.out.println("delete user");
				System.out.print("enter account number:");
				int delaccno = scan.nextInt();
				deluser(delaccno,base);
				System.out.println(base);
				break;
			case 4:
				System.out.println("display the data:");
				System.out.print("1.display based on Id\n2.diplay name\n3.non-zero balance\n"
						+ "4.sorted based on location\n5.sorted based on ID\n");
				System.out.println("enter option: ");
				int dopt=scan.nextInt();
				switch(dopt) {
				case 1:
					System.out.print("enter account number: ");
					int disaccno=scan.nextInt();
					displayAcc(disaccno,base);
					break;
				case 2:
					System.out.print("enter name: ");
					String disName=scan.next();
					displayName(disName,base);
					break;
				case 3:
					System.out.print("Non zero balance user: ");
					displayNonZero(base);
					break;
				case 4:
					System.out.println("sort based on Name");
					Collections.sort(base,new CompareByName());
					System.out.println(base);
					break;
				case 5:
					System.out.println("sort based on id");
					System.out.println(base);
					break;
				}
				break;
			case 5:
				System.out.println("existed");
			    
			}
		}
	  	
		scan.close();
	}
}
