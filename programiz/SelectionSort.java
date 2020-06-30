package programiz;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    int[] array;
    int arrSize;
    int index=0;
    public SelectionSort(int size) {
		arrSize=size;
		array=new int[size];
	}
    public void insert(int no) {
		array[index++]=no;
	}
    public void swap(int no1,int no2) {
		int temp=array[no1];
		array[no1]=array[no2];
		array[no2]=temp;
	}
    public void sort() {
    	int minimum=0;
		for(int i=0;i<arrSize-1;i++) {
			minimum=i;
			for(int j=i+1;j<arrSize;j++) {
				if(array[minimum]>array[j]) {
				   minimum=j;
				}
			}
			swap(minimum,i);
		}
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter size:");
		int size=scan.nextInt();
		SelectionSort sort=new SelectionSort(size);
		for(int i=1;i<=size;i++) {
	     	System.out.print("Enter "+i+" element:");
	     	sort.insert(scan.nextInt());
		}
		sort.sort();
		System.out.println(Arrays.toString(sort.array));
		scan.close();

	}

}
