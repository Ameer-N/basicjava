package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySOrt {
	private void swap(int[] array,int no1,int no2){
		int temp=array[no1];
		array[no1]=array[no2];
		array[no2]=temp;
	}
	private  void bubbleSort(int[] array) {
		int notswap,nswap;
		for(int inc=array.length-1;inc>=1;inc--) {
			notswap=inc;
			nswap=0;
			for(int jnc=0;jnc<inc;jnc++) {
				if(array[jnc]>array[jnc+1]) {
					swap(array,jnc,jnc+1);
				}
				else {
					nswap++;
				}
			}
			if(nswap == notswap) {
				return;
			}
		}
		
	}
	private void insertionSort(int[] array){
		int jnc,min;
		for(int inc=1;inc<array.length;inc++) {
			jnc=inc-1;
			min=array[inc];
			while(jnc>=0 && min < array[jnc]) {
				array[jnc+1]=array[jnc];
				jnc--;
			}
			array[jnc+1]=min;
		}
	}
	public static void main(String[] args) {
    ArraySOrt sort=new  ArraySOrt();
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter array limit:");
    int limit=scan.nextInt();
    int [] array=new int[limit];
    for(int inc=0;inc<limit ;inc++) {
    	System.out.print("Enter "+(inc+1)+" element:");
    	array[inc]=scan.nextInt();
    }
    int[] array1=array;
    sort.bubbleSort(array);
    System.out.println("bubble sort : "+Arrays.toString(array));
    sort.insertionSort(array);
    System.out.println("insertion sort : "+Arrays.toString(array1));
    scan.close();
	}
}
