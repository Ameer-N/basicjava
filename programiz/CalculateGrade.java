package programiz;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double no=0,sum=0,avg=0;
	for(int i=1;i<=6;i++) {
		System.out.print("Enter "+i+" subject mark:");
		no=scan.nextDouble();
		sum+=no;
	}
	avg=sum/6;
	System.out.printf("average: %f",avg);
	if(avg>=0 && avg<=100)
	{
		if(avg>=80) {
			System.out.println("A grade");
		}
		else if(avg>=60 && avg<=79) {
			System.out.println("B grade");
		}
		else if(avg>=40 && avg<59) {
			System.out.println("c grade");
		}
		else{
		   System.out.println("D grade");	
		}
	}
	scan.close();
	}

}
