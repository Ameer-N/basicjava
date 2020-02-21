import java.util.Scanner;
public class Main{
    //global variable 
    static int no=1;
    public static void main(String [] args){
      Scanner scan=new Scanner(System.in);
      //primitive data types && local variable 
      System.out.println("Enter a byte value");
      byte no1=scan.nextByte();
     
      System.out.println("Enter a short  value");
      short no2=scan.nextShort();
     
      System.out.println("Enter a Integer  value");
      int no3=scan.nextInt();
     
      System.out.println("Enter a Long  value");
      Long no4=scan.nextLong();
      
      System.out.println("Enter a String");
      String name=scan.next();
      scan.nextLine();
      System.out.println("Enter a Multiple String");
      String name2=scan.nextLine();
      
       System.out.println("Enter a char");
       String flag=scan.next();
       char flag1=flag.charAt(0);
     
      System.out.println("Enter a float value");
      float no5=scan.nextFloat();
     
      System.out.println("Enter a double value");
      double  no6=scan.nextDouble();
      
      System.out.println(no1);
      System.out.println(no2);
      System.out.println(no3);
      System.out.println(no4);
      System.out.println(name);
      System.out.println(name2);
      System.out.println(flag1);
      System.out.println(no5);
      System.out.println(no6);
            
      
    }
}
