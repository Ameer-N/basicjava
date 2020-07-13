package practice2;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class  sortByName implements Comparator<TicketBooking>{
	@Override
	public int compare(TicketBooking t1, TicketBooking t2) {
		return t1.name.compareTo(t2.name);
	}
}

public class TicketBooking {
	static int no =100;
	int custId;
	String name;
	int age;
	long mobileNumber;
	String dateOfBirth;
	String address;
	public void generateAccountNumber() {
		this.custId=no++;
	}
	public TicketBooking(String name,int age,long mob,String dob,String address) {
		generateAccountNumber();
		this.name=name;
		this.age=age;
		this.mobileNumber=mob;
		this.dateOfBirth=dob;
		this.address=address;
	}
	@Override
	public String toString() {
		return "custId ="+custId+",name ="+name+",age ="+age+",mobile Number ="+mobileNumber+",DOB ="+dateOfBirth+",address="+address;
	}
	
	public static boolean  checkValidUser(int id,long mobileno,String source,String dest,String userDate,String time ,List<TicketBooking> list) {
		boolean isValid=false;
		for(TicketBooking val:list) {
			if(val.custId== id && val.mobileNumber == mobileno) {
				if(!source.equals(dest)) {
					 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					 SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
					 LocalDate presentDate = LocalDate.now();  
					 LocalDate FutureDate =  LocalDate.now().plusDays(30);
					 try{
						  String sd1 =  dtf.format(presentDate);
						  Date d1 = sdformat.parse(sd1);
						  Date d2 = sdformat.parse(userDate);
						  String sd3 = dtf.format(FutureDate);
						  Date d3 = sdformat.parse(sd3);
						  if(d1.compareTo(d2)<0 && d2.compareTo(d3)<0){
						      return !isValid;
						  }
						  return isValid;
					   }
					  catch(Exception e){
					    System.out.println("error in date format!");
					  }
				}
			}
		}
		return isValid;
	}
	public static void displayByCityName(String dcity,List<TicketBooking> list) {
		for(TicketBooking val:list) {
			if(val.address.contains(dcity)) {
				System.out.println(val);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<TicketBooking> list= new ArrayList<TicketBooking>();
		String name;
		int age;
		long mobileNumber;
		String dateOfBirth;
		String address;
		int option=1;
		System.out.println("Welcome to bus ticket booking:");
		while(option !=4 ) {
			System.out.println("1.create new account\n2.Book a ticket\n3.display\n4.Exit");		
			System.out.print("enter your option: ");
			option= scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("create your account by filing below details :");
				System.out.print("Enter your name :");
				name=scan.next();
				System.out.print("Enter your age: ");
				age=scan.nextInt();
				System.out.print("Enter mobile number: ");
				mobileNumber=scan.nextLong();
				System.out.print("Enter your dateofbirth(dd/MM/yyyy):");
				dateOfBirth = scan.next();
			    System.out.print("Enter address:");
			    scan.nextLine();
				address = scan.nextLine();
				TicketBooking user= new TicketBooking(name,age,mobileNumber,dateOfBirth,address);
				list.add(user);
				System.out.println("List of cutomer:");
				for(TicketBooking val:list)
					System.out.println(val);
		        break;	
			case 2:
				System.out.println("Book a ticket by giving below information:");
				System.out.print("Enter your customerId :");
				int bookcusId=scan.nextInt();
				System.out.print("Enter mobile number: ");
				long bookmobileNumber = scan.nextLong();
				System.out.print("Enter source:");
				String source = scan.next();
			    System.out.print("Enter destination:");
				String destination = scan.next();
				System.out.print("Enter travel date (dd/MM/yyyy):");
				scan.nextLine();
				String bookdate = scan.nextLine(); 
				System.out.print("Enter time(HH:MM:SS):");
				String booktime = scan.next();
			    boolean isValid = checkValidUser(bookcusId,bookmobileNumber,source,destination,bookdate,booktime,list);
				if(isValid) {
					System.out.println("booked successfully!");
				}
				else {
					System.out.println("travel date is not satisfied");
				}
				break;
			case 3:
				System.out.println("1.display customer based on city name\n 2.display based on Id\n 3.display customer name in sorted order");
				System.out.println("enter option :");
				int doption = scan.nextInt();
				switch(doption) {
				case 1:
					System.out.println("Display customer based on city name: ");
					System.out.print("enter city name:");
					String dcity = scan.next();
					displayByCityName(dcity,list);
					break;
				case 2:
					System.out.println("Display based on Id:");
					for(TicketBooking val:list)
						System.out.println(val);
					break;
				case 3:
					System.out.println("Display based on name in ascending order:");
					Collections.sort(list,new sortByName());
					for(TicketBooking val:list)
						System.out.println(val);
					break;
				}
				break;
			case 4:
				System.out.println("existed");
			    break;
			}
		}
	  	
		scan.close();
	}

}
