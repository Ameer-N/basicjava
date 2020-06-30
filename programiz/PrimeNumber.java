package programiz;

import java.util.Scanner;

public class PrimeNumber {
	public void checkPrime() {
		int flag=0,count=0,no=2;
		while(count!=100) {
			flag=0;
			for(int j=2;j<no/2;j++) {
				if(no%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(" is prime number!---------->"+no);
				count++;
			}
			else {
				System.out.println(no+" is not prime number!");
			}
			no++;
		}
	}
	public void recur() {
		int count=1,no=3,flag=0;
		while(count!=100) {
			if(no%2==0) {
				System.out.println(no+" is not a prime number");
				flag=1;
			}
			else {
				for(int i=3;i*i<=no;i+=2) {
					if(no%i==0) {
						System.out.println(no+" is not a prime number");
						flag=1;
						break;
					}
				}
				if(flag!=1) {
					System.out.println("prime number------------->"+no);
					count++;
				}
			}
			no++;
			flag=0;
			}
	}
	public void withinRange(int range) {
		int no=2,flag=0;
		if(range>=2) {
			System.out.println("prime number------------->"+no++);
		}
		while(no<=range) {
			if(no%2==0) {
				System.out.println(no+" is not a prime number");
				flag=1;
			}
			else {
				for(int i=3;i*i<=no;i+=2) {
					if(no%i==0) {
						System.out.println(no+" is not a prime number");
						flag=1;
						break;
					}
				}
				if(flag!=1) {
					System.out.println("prime number------------->"+no);
				}
			}
			no++;
			flag=0;
			}
	}
	public static void main(String[] args) {
	PrimeNumber prime=new PrimeNumber();
	System.out.println("method 1:normal");
	prime.checkPrime();
	System.out.println("------------------------------");
	System.out.println("method 2:skipping");
	prime.recur();
    Scanner scan=new Scanner(System.in);
    System.out.println("------------------------------");
    System.out.println("enter range:");
    int range=scan.nextInt();
    prime.withinRange(range);
    scan.close();
	}

}
