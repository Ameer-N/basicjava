package practice;

import java.util.Scanner;

public class SearchKey {
	private boolean findKey(int[] array,int key) {
		for(int val:array) {
			if(val==key) 
				return true;		
		}
		return false;
	}
	public static void main(String[] args) {
		SearchKey sk=new SearchKey();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter array limit:");
		int limit=scan.nextInt();
		int []array = new int[limit];
		for(int inc=0;inc<limit;inc++) {
			System.out.print("Enter "+(inc+1)+" element:");
            array[inc]=scan.nextInt();			
		}
		System.out.println("enter key to find");
		int key=scan.nextInt();
		System.out.println("the key found :"+sk.findKey(array,key));
		scan.close();
	}
}
