package programiz;

import java.util.Scanner;

public class Gcd {
    private static int  isMin(int no1,int no2) {
		return no1>no2?no2:no1;
	}
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter two Number to find gcd:");
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    int min=isMin(num1,num2);
    System.out.println("method 1:(min and find modulo)");
    int gcd=1;
    for(int i=1;i<=min;i++) {
    	if(num1%i==0 && num2%i==0) {
    		gcd=i;
    	}
    }
    System.out.println("gcd of two number is:"+num2);
    System.out.println();
    System.out.println("method:2 (sub mini vaue)");
    while (num1 != num2) {
    	if(num1 > num2)
            num1 = num1 - num2;
        else
            num2 = num2 - num1;
    }
    System.out.println("gcd of two number is:"+num2);
    scan.close();
	}

}
