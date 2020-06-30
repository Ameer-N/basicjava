package programiz;

import java.util.Scanner;

public class CalculateArea {
	static void calculate(double radius){
		System.out.printf("area of Square:%.2f",radius*radius);
	}
    static void calculate(double length,double width){
    	System.out.printf("area of rectangle:%.2f",length*width);
	}
    static void calculate(float radius){
   	System.out.printf("area of rectangle:%.2f",(2*3.14*radius));
	}
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter radius:");
	double radius=scan.nextDouble();
	float rad=(float)radius;
    calculate(radius);
    System.out.println();
	System.out.print("Enter length:");
	double length=scan.nextDouble();
	System.out.print("Enter width:");
	double width=scan.nextDouble();
	calculate(length,width);
	System.out.println();
	calculate(rad);
    scan.close();
	}

}
