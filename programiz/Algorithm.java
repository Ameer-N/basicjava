package programiz;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
	int[] array;
	int arraySize;
	int index=0;
	public Algorithm(int size) {
		arraySize=size;
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
	public void bubblesort(int flag) {
		for(int i=arraySize-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(flag==1) {
					if(array[j]>array[j+1]) {
						swap(j,j+1);
					}
				}
				else {
					if(array[j]<array[j+1]) {
						swap(j,j+1);
					}
				}
			}
		}
	}
	public void linearSearch(int findNo) {
		for(int i=0;i<arraySize;i++) {
			if(array[i]==findNo) {
				System.out.println(findNo+" found at"+i+"position");
				return;
			}
		}
		System.out.println(findNo+" not found at array");
	}
	public void binarySearch(int findNo) {
		int start=0,high=arraySize,mid=0;
		while(start<high) {
			mid=(start+high)/2;
			if(findNo >array[mid]) {
				start=mid+1;
			}
			else if(findNo <array[mid]){
				high=mid-1;
			}
			//else if(array[mid]==findNo) {
			else {
				System.out.println(findNo+" found at"+mid+"position");
				return;
			}
		}
		System.out.println(findNo+" not found at array");

		
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int flag=0;
		String str="";
		while(flag!=1 && flag!=2) {
			System.out.println(str+"bubble sort\n enter 1 for ascending 2.for decending order");
			System.out.print("enter option:");
	        flag=scan.nextInt();
	        str+="reenter,";
		}
		System.out.print("enter array size:");
		int size=scan.nextInt();
		Algorithm alg=new Algorithm(size);
		for(int i=1;i<=size;i++) {
	     	System.out.print("Enter "+i+" element:");
	     	alg.insert(scan.nextInt());
		}
		alg.bubblesort(flag);
		System.out.println("sorted ist of integer:");
		System.out.println(Arrays.toString(alg.array));
		System.out.println();
		
		System.out.println("\nlinear search:");
		System.out.print("enter number to find in array:");
		int find=scan.nextInt();
		alg.linearSearch(find);
		
		System.out.println("\nbinary search needs sorted array:");
		alg.binarySearch(find);
        scan.close();
	}

}
