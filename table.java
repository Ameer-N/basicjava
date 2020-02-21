import java.util.*;
public class Table{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int no,i;
       System.out.println("Enter the multiplication Number:");
       no=scan.nextInt();
       System.out.println(no+" multiplication Table:");
       for(i=1;i<=10;i++){
           System.out.println(no+" X "+i+" = "+no*i);
       }
   }
   
}
