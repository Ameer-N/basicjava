package programiz;

import java.util.Scanner;

public class AltPrime {
	private static void printAltPrime(int range) {
		if(range>=2) {
			System.out.println("2 prime number");
		}
		int count=0;
        for(int i=3;i<=range;i++) {
        	int flag=0;
        	if(i%2!=0){
        		for(int j=3;j*j<=i;j+=2) {
        			if(i%j==0) {
        				flag=1;
        				break;
        			}
        		}
        		if(flag==0) {
        			count++;
        			if(count==2) {
        				System.out.println(i+" prime number");
        				count=0;
        			}
        		}
        
        	}
        }
		
	}
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter range to print the prime number:");
		int  range=scan.nextInt();
		printAltPrime(range);
		scan.close(); 
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}
}
