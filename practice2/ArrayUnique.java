package practice2;

import java.util.Scanner;

public class ArrayUnique {
	public static int[] uniqElement(int[] arr1,int[] arr2) {
		int[] resultArray = new int[arr1.length+arr2.length];
		int flag=0,index=0;
		for(int inc=0;inc<arr1.length;inc++) {
			flag=0;
			for(int jnc=0;jnc<arr2.length;jnc++) {
				if(arr1[inc] == arr2[jnc]) {
					arr2[jnc] = -1;
					flag=1;
				}
			}
			if(flag==0)
				resultArray[index++]=arr1[inc];
		}
		for(int jnc=0;jnc<arr2.length;jnc++) {
			if(arr2[jnc] !=-1) {
				resultArray[index++]=arr2[jnc];
			}
		}
		return resultArray;
	}
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter limit of array1 : ");
	int limit1 = scan.nextInt();
	int[] arr1 = new int[limit1];
	for(int inc=0;inc<limit1;inc++) {
		System.out.print("Enter "+(inc+1)+" Element : ");
		arr1[inc]=scan.nextInt();
	}
	System.out.print("Enter limit of array2 : ");
	int limit2 = scan.nextInt();
	int[] arr2 = new int[limit2];
	for(int inc=0;inc<limit2;inc++) {
		System.out.print("Enter "+(inc+1)+" Element : ");
		arr2[inc]=scan.nextInt();
	}
	System.out.println("output array:");
	int [] resultArray = uniqElement(arr1,arr2);
	for(int val:resultArray)
		if(val!=0)
			System.out.print(val+" ");
	
	scan.close();
	}
}
