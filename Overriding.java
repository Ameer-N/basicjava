import java.util.*;
class Area{
void show(int no1,int no2){
    System.out.println(no1*no2);
}
    
}
class Triangle{
void show(int no1,int no2){
    System.out.println((no1*no2)/2);
}
    
}
class Rectangle{
void show(int no1,int no2){
    System.out.println(no1*no2);
}
    
}
public class Main
{
	public static void main(String[] args) {
	int no1,no2,no;
	System.out.println("1.Area of square\t2.Area of triangle \t 3.Area of rectangle");
	System.out.println("Enter the number:");
	Scanner scan=new Scanner(System.in);
	no=scan.nextInt();
	switch(no){
	    case 1:
	        System.out.println("Enter the sides to find Area of square");
	        no1=scan.nextInt();
	        no2=no1;
	        Area obj=new Area();
	        obj.show(no1,no2);
	        break;
	        
	    case 2:
	        System.out.println("Enter the height and base to find Area of triangle");
	        no1=scan.nextInt();
	        no2=no1;
	        Triangle obj2=new Triangle();
	        obj2.show(no1,no2);
	        break;
	  
	    case 3:
	        System.out.println("Enter the length and breadth to find Area of rectangle");
	        no1=scan.nextInt();
	        no2=no1;
	        Rectangle obj3=new Rectangle();
	        obj3.show(no1,no2);
	        break;
	}
	
	}
}
