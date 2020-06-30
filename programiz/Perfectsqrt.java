package programiz;

import java.util.Scanner;

public class Perfectsqrt {
    private static void checkPerfect(long no) {
	 for(long i=1;i*i<=no;i++) {
		 if(i*i==no) {
			 System.out.println(no+" is perfect square ->"+i);
			 return;
		 }
	 }
	 System.out.println(no+" is not perfect square");
	}
    private static void checkPerfectSquare(long no) {
    	System.out.println("calculation:");
    	System.out.println(Math.sqrt(no)+" "+Math.floor(Math.sqrt(no)));
    	System.out.println(Math.sqrt(no)*Math.sqrt(no));
    	System.out.println(Math.sqrt(no)-Math.floor(Math.sqrt(no)));
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("method 1:for loop i*i");
		System.out.println("enter no to find pefect square:");
		long no=scan.nextLong();
		checkPerfect(no);
        System.out.println("method 2:sqrt()");
        checkPerfectSquare(no);
	}

}
