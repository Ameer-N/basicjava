package programiz;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
	public void swap(int i,int j,String[] str) {
		String temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
    public void check(String[] str) {
    	for(int i=str.length-1;i>1;i--) {
    		for(int j=0;j<i;j++) {
    			if(str[j].compareTo(str[j+1])>0) {
    				swap(j,j+1,str);
    			}
    		}
    	}
    	System.out.println();

    	
    }
	public static void main(String[] args) {
		Bubblesort sort=new Bubblesort();
		long start=System.currentTimeMillis();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of string:");
		int count=scan.nextInt();
		String[] str=new String[count];
		for(int i=0;i<count;i++) {
			str[i]=scan.next().toLowerCase();
		}
		System.out.println(Arrays.toString(str));
		sort.check(str);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(Arrays.toString(str));
        scan.close();
	}

}
