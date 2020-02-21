import java.util.*;
public class IfElse{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int mark;
       char grade='\0';
       System.out.println("Enter your mark-(0-100):");
       mark=scan.nextInt();
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
