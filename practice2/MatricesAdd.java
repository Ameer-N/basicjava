package practice2;

import java.util.Scanner;

public class MatricesAdd {
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
	public int[][] sumMatrice(int[][] arr1,int[][] arr2,int row,int col) {
		int[][] sum = new int[row][col];
		for(int inc=0;inc<row;inc++) {
	    	for(int jnc=0;jnc<col;jnc++) {
	    		sum[inc][jnc] = arr1[inc][jnc]+arr2[inc][jnc];
	    	}
	    }
		return sum;
	}
	public void displayMatrix(int[][] sum,int row,int col ){
		for(int inc=0;inc<row;inc++) {
	    	for(int jnc=0;jnc<col;jnc++) {
	    		System.out.print("Element ["+inc+"]"+"["+jnc+"] : "+sum[inc][jnc]+" ");
	    	}
	    	System.out.println("\n");
	    }
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	MatricesAdd mat = new MatricesAdd(); 
    System.out.print("Enter no of row:");
    int row = scan.nextInt();
    System.out.print("Enter no of column:");
    int col = scan.nextInt();
    int[][] arr1 = new int[row][col];
    int[][] arr2 = new int[row][col];
    int[][] sum = new int[row][col];
    System.out.println("Enter array1 element:");
    arr1 = mat.enterData(arr1,row,col);
    System.out.println("Enter array2 element:");
    arr2 = mat.enterData(arr2,row,col);
    sum = mat.sumMatrice(arr1,arr2,row,col);
    System.out.println("sum of array element:");
    mat.displayMatrix(sum,row,col);
    scan.close();
	}
}
