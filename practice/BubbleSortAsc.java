package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAsc {
	private void swap(int[] array,int no1,int no2) {
		int temp=array[no1];
		array[no1]=array[no2];
		array[no2]=temp;
	}
	private void sortAscending(int[] theArray) {
		for(int inc=theArray.length-1;inc>=1;inc--) {
			int temp=inc,swap=0;
			for(int inc1=0;inc1<inc;inc1++) {
				if(theArray[inc1]>theArray[inc1+1]) {
					swap(theArray,inc1,inc1+1);
				}
				else 
				    swap++;
			}
			if(swap==temp) {
				return;
			}
		}
	}
	private void printArray(int [] theArray) {
		System.out.println(Arrays.toString(theArray));
	}
	public static void main(String[] args) {
		BubbleSortAsc sort=new  BubbleSortAsc();
		Scanner scan = new Scanner(System.in);
		int size;
		int [] theArray;
		System.out.print("Enter array size:");
		size=scan.nextInt();
		theArray = new int[size];
		for(int inc = 0;inc < size ; inc++ ) {
			System.out.print("Enter "+(inc+1)+" element:");
			theArray[inc]=scan.nextInt();
		}
		sort.sortAscending(theArray);
		sort.printArray(theArray);
		scan.close();
	}
}
