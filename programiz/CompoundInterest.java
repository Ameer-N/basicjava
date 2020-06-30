package programiz;


import java.util.Scanner;



public class CompoundInterest {
    public static void checkCompoundinterest(String str) {
    	String[] arr=str.split(" ");
        int p=Integer.parseInt(arr[0]);
        double r=(double)Integer.parseInt(arr[1])/100;
        int n=Integer.parseInt(arr[2]);
        int t=Integer.parseInt(arr[3]);
        System.out.printf("%.2f",p*(Math.pow((1+(r/12f)),(double)(n*t)))-p);
    	
    	
    }
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter principle,rate of interest,no of year,time (in order along with spaces in between!)");
	String str=scan.nextLine();
	checkCompoundinterest(str);
	scan.close();

	}

}
