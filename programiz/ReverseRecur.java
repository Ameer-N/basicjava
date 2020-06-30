package programiz;
import java.util.Scanner;

public class ReverseRecur {
    public void reverse(long no) {
    	if(no<=0) {
    		return;
    	}
       System.out.print(no%10);
       reverse(no/10);
      
    }
	public static void main(String[] args) {
		ReverseRecur recur=new ReverseRecur();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no(reverse):");
		long no=scan.nextLong();
		scan.close();
		long temp=no;
		System.out.println("method 0:recursion");
		recur.reverse(no);
		System.out.println();
	    long reversedNo=0;
	    System.out.println("method 1:while loop:");
		while(no>0) {
			reversedNo=reversedNo*10+no%10;
			no/=10;
		}
		System.out.println(reversedNo);
		reversedNo=0;
		no=temp;
	    System.out.println("method 2:for loop:");
		for(;no>0;) {
			reversedNo=reversedNo*10+no%10;
			no/=10;
		}
		System.out.println(reversedNo);
	}

}
