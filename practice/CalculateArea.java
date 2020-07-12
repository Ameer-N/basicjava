package practice;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the figure type:(Triangle,Rectangle,Square,Circle):");
    String type=scan.next();
    switch(type) {
    case "Triangle":
    	double side,height;
    	System.out.print("enter side : ");
    	side=scan.nextDouble();
    	System.out.print("enter height : ");
    	height=scan.nextDouble();
    	System.out.printf("Area of triangle :%.2f square.units",(side*height)/2);
    	break;
    case "Square":
    	double sside;
    	System.out.print("enter side : ");
    	sside=scan.nextDouble();
    	System.out.printf("Area of square :%.2f square.units",(sside*sside));
    	break;
    case "Rectangle":
    	double width,rheight;
    	System.out.print("enter width : ");
    	width=scan.nextDouble();
    	System.out.print("enter height : ");
    	rheight=scan.nextDouble();
    	System.out.printf("Area of rectangle :%.2f square.units",(width*rheight));
    	break;
    case "Circle":
    	double radius;
    	System.out.print("enter radius : ");
    	radius=scan.nextDouble();
    	System.out.printf("Area of triangle :%.2f square.units",2*Math.PI*radius);
    	break;
    default:
    	System.out.println("entered type doesnot match!");
    }
    scan.close();

	}

}
