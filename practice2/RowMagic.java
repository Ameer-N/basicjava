package practice2;

import java.util.Scanner;

public class RowMagic {
	Scanner scan = new Scanner(System.in);
	public int[][] enterData(int[][] arr,int row,int col) {
		for(int inc=0;inc<row;inc++) {
	    	for(int jnc=0;jnc<col;jnc++) {
	    		System.out.print("Enter ["+inc+"]"+"["+jnc+"] element:");
	    		arr[inc][jnc] = scan.nextInt();
	    	}
	    }
		return arr;
	}
	public boolean  isRowMagic(int[][] arr){
		boolean isMagic = false;
		int sum=0,index=0,count=0;
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
			return !isMagic;
		return isMagic;
	}
	public static void main(String[] args) {
	RowMagic magic = new RowMagic();
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter array element to check row Magic :");
    System.out.print("Enter row size: ");
    int row =  scan.nextInt();
    System.out.print("Enter col size: ");
    int col =  scan.nextInt();
    int[][] arr = new int[row][col];
    System.out.println("Enter array element:");
    arr = magic.enterData(arr,row,col);
    boolean isrowMagic = magic.isRowMagic(arr);
    System.out.println("check for row magic  =" +isrowMagic);    
    scan.close();
	}
}
