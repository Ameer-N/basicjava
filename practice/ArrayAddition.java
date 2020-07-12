package practice;

import java.util.Arrays;

public class ArrayAddition {
	public void printArray(double[] dInputArray1,double[] dInputArray2) {
		int len1=dInputArray1.length,len2=dInputArray2.length;
		int size=len1>len2?len1:len2;
		int[] iSumArray=new int[size];
		int inc=0;
		for(;inc<len1;inc++) {
			iSumArray[inc]=(int)dInputArray1[inc]+(int)dInputArray2[inc];
		}
		for(;inc<len2;inc++) {
			iSumArray[inc]=(int)dInputArray2[inc];
		}
		System.out.println("Array1 : "+Arrays.toString(dInputArray1));
		System.out.println("Array2 : "+Arrays.toString(dInputArray2));
		System.out.println("sumArray : "+Arrays.toString(iSumArray));
	}
	public static void main(String[] args) {
		ArrayAddition arr = new ArrayAddition();
		double dInputArray1[]= {10.0,20.0,30.0};
		double dInputArray2[]= {20.0,50.0,30.0,70.0,80.0};
		arr.printArray(dInputArray1,dInputArray2);
		
	}
}
