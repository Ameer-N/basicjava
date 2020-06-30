package programiz;
import java.util.Scanner;

public class InttoDigit {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter number(convert to digit):");
		 long no=scan.nextLong();
		 long temp=no,count=0;
		 while(no>0) {
			 count++;
			 no/=10;
		 }
		 no=temp;
		 while(no>0) {
			 System.out.println("Digit at place "+(count--)+" is: "+no%10);
		     no/=10;
		 }
		 scan.close();

	}

}
