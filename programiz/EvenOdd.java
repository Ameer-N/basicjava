package programiz;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter limit prime odd number");
		int range=scan.nextInt();
		int even[]=new int[range/2];
		int odd[]=new int[range/2];
		int l=0,k=0;
		for(int i=1;i<=range;i++) {
			if(i%2==0)
				even[l++]=i;
			else
				odd[k++]=i;
				
		}
		System.out.println("even number:");
		for(int i=0;i<even.length;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println("\nodd number:");
		for(int i=0;i<odd.length;i++) {
			System.out.print(odd[i]+" ");
		}
		scan.close();

	}

}
