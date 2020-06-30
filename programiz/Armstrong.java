package programiz;

import java.util.Scanner;

public class Armstrong {
	private static void  findArmstrong(long srange,long lrange) {
	for(long i=srange;i<=lrange;i++) {
		long temp=i,reversedNo=0,count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
//		System.out.println(count);
		temp=i;
		while(temp>0) {
			reversedNo+=(Math.pow(temp%10,count));
			temp/=10;
		}
		if(reversedNo==i) {
			System.out.println("armstrong number: "+i);
		}
	}
   }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the range to find armstrong number");
		System.out.println("start range:");
		long srange=scan.nextLong();
		System.out.println("end range:");
		long lrange=scan.nextLong();
	    findArmstrong(srange,lrange);
		scan.close();
		

	}

}
