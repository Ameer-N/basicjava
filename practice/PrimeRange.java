package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeRange {
	List<Long> list = new ArrayList<Long>();
	public void isPrime(long start,long end){
		for(long inc=start;inc<=end;inc++) {
			int flag=0;
			if(inc%2==0 && inc !=2 || inc==1) {
				flag=1;
			}
			for(long inc1=3;inc1*inc1<=inc;inc1+=2) {
				if(inc%inc1==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				list.add(inc);
		}
	}
	private void printList() {
		for(int inc=0;inc<list.size()-1;inc++) {
			System.out.print(list.get(inc)+",");
		}
		System.out.println(list.get(list.size()-1));
	}
	public static void main(String[] args) {
    PrimeRange prime = new PrimeRange();
	Scanner scan=new Scanner(System.in); 
	long start,end;
	System.out.print("Enter starting range : ");
	start=scan.nextLong();
	System.out.print("Enter ending range : ");
	end=scan.nextLong();
	if(start<end) {
		prime.isPrime(start,end);
		prime.printList();
	}
	else {
		System.out.println("empty list(start is greater than end)");
	}
	scan.close();

	}

}
