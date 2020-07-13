package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicate {
	int[] array;
	public ArrayDuplicate(int[] array) {
		this.array = array;
	}
	public void sort() {
		int jnc=0,minimum;
		for(int inc=0;inc<array.length-1;inc++) {
			jnc = inc+1;
			minimum =array[jnc];
			while(jnc > 0 && (minimum< array[jnc-1])) {
				array[jnc]=array[jnc-1];
				jnc--;
			}
			array[jnc]=minimum;
		}
	}
	public void findDup() {
		int jnc=0;
		int[] temp = new int[array.length/2];
		Arrays.fill(temp, -1);
		for(int inc =0;inc<array.length-1;inc++) {
			if(array[inc]== array[inc+1]) {
				temp[jnc++]=array[inc];
				while(array[inc]== array[inc+1]) {
					inc++;
				}
			}
		}
		if(jnc==0) 
			System.out.println("-1");
		else
			System.out.print("duplicate array:");
			for(int inc=0;inc<jnc;inc++)
				System.out.print(temp[inc]+" ");
	}
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter limit of array:");
	int limit = scan.nextInt();
	int[] arr = new int[limit];
	for(int inc=0;inc<limit;inc++) {
		System.out.print("Enter "+(inc+1)+" Element:");
		arr[inc]=scan.nextInt();
	}
	ArrayDuplicate arraydup = new ArrayDuplicate(arr);
	System.out.println("original arr"+Arrays.toString(arr));
	arraydup.sort();
	arraydup.findDup();
	scan.close();
	}
}
