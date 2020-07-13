package practice2;

import java.util.Scanner;

public class CoffeeShop {
	private String name;
	private String mobileNo;
	private double feedbackRating;
	public CoffeeShop(String name,String mobileNo,double feedbackRating) {
	 setName(name);
	 setMobileNo(mobileNo);
	 setFeedbackRating(feedbackRating);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	@Override
	public String toString() {
		return name+":"+feedbackRating+" out of 5";
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("enter n of customer :");
	int limit = scan.nextInt();
	String name,mobileno;
	double feedback;
	CoffeeShop arr[] = new CoffeeShop[limit];
	for(int inc=0;inc<limit;inc++) {
		 System.out.print("Enter name: ");
		 name = scan.next();
		 System.out.print("Enter mobile number: ");
		 mobileno = scan.next();
		 System.out.print("Enter feedback(out of five): ");
		 feedback = scan.nextInt();
	     arr[inc]=new CoffeeShop(name,mobileno,feedback);
	}
	for(CoffeeShop val:arr)
	   System.out.println(val);
	scan.close();
	}
}
