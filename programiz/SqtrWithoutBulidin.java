package programiz;

import java.util.Scanner;

public class SqtrWithoutBulidin {
    private static double  checkSqrt(int number){
    	double temp;

    	double sr = number / 2;

    	do {
    		temp = sr;
    		sr = (temp + (number / temp)) / 2;
    		System.out.println(temp+"  " +sr);
    	} while ((temp - sr) != 0);

    	return sr;
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any number(sqrt):");
    int no=scan.nextInt();
    System.out.println(checkSqrt(no));
    scan.close();

	}

}
