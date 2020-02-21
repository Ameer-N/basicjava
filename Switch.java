import java.util.*;
public class Main{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       char grade='\0';
       System.out.println("Enter your grade:(A-C or F)");
       String str=scan.next();
       grade=str.toUpperCase().charAt(0);
       
       switch(grade){
            case 'A':
               System.out.println(grade+" grade- mark>=90");
               break;
            case 'B':
               System.out.println(grade+" grade- mark>=70");
               break;
            case 'C':
               System.out.println(grade+" grade- mark>=45");
               break;
            case 'F':
               System.out.println(grade+" grade- mark<=44");
               break;
            default:
               System.out.println("Invalid grade");
               break;
       }

      
    }
   
}
