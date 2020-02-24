import java.util.*;
public class Main{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       float mark1;
       char grade='\0';
       System.out.println("Enter your mark-(0-100):");
       mark1=scan.nextFloat();
       int mark=Math.round(mark1);
       if(mark>=0 && mark<=100){
            if(mark>=90 && mark<=100){
               grade='A';
               System.out.println("you scored " +grade+"grade");
            }
            else if(mark>=70 && mark<=89){
               grade='B';
               System.out.println("you scored " +grade+"grade");
            }
            else if(mark>=45 && mark<=69){
               grade='C';
               System.out.println("you scored " +grade+"grade");
            }
            else if(mark>=0 && mark<=44)
               System.out.println("you failed");
        }
        else
          System.out.println("Entered mark is not in range");
          

      
       
   }
   
}
