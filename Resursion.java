import java.util.*;
public class Main{
      
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int no,i=1;
      System.out.println("Enter the multiplication Number:");
      no=scan.nextInt();
      System.out.println(no+" multiplication Table:");
      if(no>0)
          generatemul(no,i);
      else
         System.out.println("negative number found");
    
    }
    public static void generatemul(int no,int i){ 
        if(i<=10){
            System.out.println(no+" X "+i+" = "+no*i);
            generatemul(no,++i);
        }
        
    }
         
   
}
