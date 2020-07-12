package practice;

import java.util.Scanner;

public class BinarySearch {
    private boolean search(int [] array,int key) {
		int start=0,end=array.length;
		while(start<=end) {
			int mid=(start+end)/2;
			if(key > array[mid])
				start=mid+1;
			else if(key < array[mid])
				end=mid-1;
			else
				return true;	
		}
		return false;
    	
	}
    private boolean search(String [] array,String key) {
		int start=0,end=array.length;
		while(start<=end) {
			int mid=(start+end)/2;
			System.out.println(start+" "+mid+" "+end);
			if(key.compareTo(array[mid])>0)
				start=mid+1;
			else if(key.compareTo(array[mid])<0)
				end=mid-1;
			else
				return true;	
		}
		return false;
    	
	}
	public static void main(String[] args) {
	BinarySearch bs=new BinarySearch();
	Scanner scan = new Scanner(System.in);
	int option=-1;
	String str="";
	while(!(option>0 && option <4)) {
		System.out.print(str+"1.Binary search for integer Element \t 2.Binary search for integer Element \t 3.Exit\n");
		System.out.print("Enter option(int):");
		option=scan.nextInt();
		str="reenter";
	}
	switch(option) {
	case 1:
		System.out.print("enter array limit:");
		int limit=scan.nextInt();
		int []iarray = new int[limit];
		for(int inc=0;inc<limit;inc++) {
			System.out.print("Enter "+(inc+1)+" Int element:");
            iarray[inc]=scan.nextInt();			
		}
		System.out.print("enter key to find(int):");
		int ikey=scan.nextInt();
		System.out.println(bs.search(iarray,ikey));
		break;
	case 2:
		System.out.print("enter array limit:");
		int slimit=scan.nextInt();
		String []sarray = new String[slimit];
		for(int inc=0;inc<slimit;inc++) {
			System.out.print("Enter "+(inc+1)+" String element:");
            sarray[inc]=scan.next();			
		}
		System.out.print("enter key to find(string):");
		String skey=scan.next();
		System.out.println(bs.search(sarray,skey));
		break;
	case 3:
		System.out.println("operation exists");
		break;
	}

	
	
	scan.close();

	}

}
