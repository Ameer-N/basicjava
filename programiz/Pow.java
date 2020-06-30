package programiz;

import java.util.Scanner;

public class Pow {
  private static long power(long base,int exp) {
	if(exp<=0) {
		return 1;
	}
	long res=base*power(base,--exp);
	return res;
	
	
  }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no,base:");
		long base=scan.nextLong();
		int exp=scan.nextInt();
		System.out.println(power(base,exp));
		System.out.println(Math.pow(2,100));

	}

}
