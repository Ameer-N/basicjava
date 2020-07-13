package practice2;

import java.util.Scanner;

public class MatrixMagic {
	int index=0;
	Scanner scan = new Scanner(System.in);
	public int[][] enterData(int[][] arr,int size) {
		for(int inc=0;inc<size;inc++) {
	    	for(int jnc=0;jnc<size;jnc++) {
	    		System.out.print("Enter ["+inc+"]"+"["+jnc+"] element:");
	    		arr[inc][jnc] = scan.nextInt();
	    	}
	    }
		return arr;
	}
	public boolean  isRowMagic(int[][] arr){
		boolean isrowMagic = false;
		int sum=0,count=0;
		for(int inc=0;inc<arr.length;inc++) {
	    	for(int jnc=0;jnc<arr[0].length;jnc++) {
	    		sum += arr[inc][jnc];
	    		if(count == 0) {
	    			index = sum;
	    		}
	    	}
	    	if(index == sum)
	    		count++;
	    	sum=0;
	    }
		System.out.println("sum of each row is "+index);	    			
		if(count == arr.length)
			return !isrowMagic;
		return isrowMagic;
	}
	public boolean  iscolMagic(int[][] arr){
		boolean iscolMagic = false;
		int sum=0,count=0;
		for(int inc=0;inc<arr[0].length;inc++) {
	    	for(int jnc=0;jnc<arr.length;jnc++) {
	    		sum += arr[inc][jnc];
	    	}
	    	if(index == sum)
	    		count++;
	    	sum=0;
	    }	    			
		if(count == arr[0].length)
			return !iscolMagic;
		return iscolMagic;
	}
	public boolean  ispdiagMagic(int[][] arr){
		boolean ispdiagMagic = false;
		int sum=0;
		for(int inc=0;inc<arr.length;inc++) {
			sum+=arr[inc][inc];
		}
		if(sum == index)
			return !ispdiagMagic;
		return ispdiagMagic;
	}
	public boolean  issdiagMagic(int[][] arr){
		boolean issdiagMagic = false;
		int sum=0,jnc=0;
		for(int inc=arr.length-1;inc>=0;inc--) {
			sum+=arr[jnc++][inc];
		}
		if(sum == index)
			return !issdiagMagic;
		return issdiagMagic;
	}
	public boolean isMagic(int[][] arr) {
		boolean isMagic = false;
		if(isRowMagic(arr) && iscolMagic(arr) && ispdiagMagic(arr) && issdiagMagic(arr)) {
				return !isMagic;
		}
		return isMagic; 
	}
	public static void main(String[] args) {
	MatrixMagic magic = new MatrixMagic();
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter array element to check row Magic :");
    System.out.print("Enter row size: ");
    int row =  scan.nextInt();
    int col=row;
    int[][] arr = new int[row][col];
    System.out.println("Enter array element:");
    arr = magic.enterData(arr,row);
    boolean isMagic = magic.isMagic(arr);
    System.out.println("check for Matrix magic  =" +isMagic);    
    scan.close();
	}
}
