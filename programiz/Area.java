package programiz;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("rectangle");
		System.out.println("_________");
		System.out.println("enter length:");
		double length=scan.nextDouble();
		System.out.println("enter width:");
		double width=scan.nextDouble();
		System.out.println("Area of rectangle:"+(length*width));
		
		System.out.println("\nsquares");
		System.out.println("_________");
		System.out.println("enter radius:");
		double radius=scan.nextDouble();
		System.out.println("Area of square:"+(radius*radius));
		
		System.out.println("\ntriangle");
		System.out.println("_________");
		System.out.println("enter base:");
		double base=scan.nextDouble();
		System.out.println("enter height:");
		double height=scan.nextDouble();
		System.out.println("Area of triangle:"+(base*height)/2);
		
		System.out.println("\ncircle");
		System.out.println("_________");
		System.out.println("enter radius:");
		final float PI=3.14f;
		double rad=scan.nextDouble();
		System.out.println("Area of triangle:"+2*PI*rad);
		scan.close();
		
	}

}
