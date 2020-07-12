package practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	private void sort(int[] array) {
		int minimum,jnc,inc;
		for(inc=1;inc<array.length;inc++) {
			minimum=array[inc];
			jnc=inc-1;
			while(jnc>=0 && minimum < array[jnc]) {
				array[jnc+1]=array[jnc];
				jnc--;
			}
			array[jnc+1]=minimum;
		}
	}
	public static void main(String[] args) {
	InsertionSort is=new InsertionSort(); 
	Scanner scan=new Scanner(System.in);
	int size;
	int [] theArray;
	System.out.print("Enter array size:");
	size=scan.nextInt();
	theArray = new int[size];
	for(int inc = 0;inc < size ; inc++ ) {
		System.out.print("Enter "+(inc+1)+" element:");
		theArray[inc]=scan.nextInt();
	}
	is.sort(theArray);
	System.out.println("array is:"+Arrays.toString(theArray));
	scan.close();
	}
}
