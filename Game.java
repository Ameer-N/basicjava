import java.util.*;
public class Main
{	
    static int flag=0,stop=0;
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in); 
	Random random=new Random();
	StringBuffer String_Buffer=new StringBuffer();
	StringBuffer Return_String_Buffer=new StringBuffer();
	String Selected_Str=null;
	String [] String_Array={"AMEER","AJITHKUMAR","VIRATKOHLI"};
	int Select_Random_String=random.nextInt(String_Array.length);
	Selected_Str=String_Array[Select_Random_String];
    int Selected_Str_Length=Selected_Str.length();
    for (int i=0;i<Selected_Str_Length;i++){
        String_Buffer.append("_");
    }
 
    for (int i=0;i<(Selected_Str_Length)/3;i++){
        int Select_Random_String_Buffer=random.nextInt(String_Buffer.length());
       
        if(String_Buffer.charAt(Select_Random_String_Buffer)=='_'){
        String_Buffer.setCharAt(Select_Random_String_Buffer,Selected_Str.charAt((Select_Random_String_Buffer)));
        }
       
    }
       System.out.println("Guess Me!!");
          System.out.println("WORD:");
       for(int i=0;i<String_Buffer.length();i++){
          System.out.print(String_Buffer.charAt(i)+" ");
       }
       System.out.println();
       System.out.println("you have "+(Selected_Str_Length-(Selected_Str_Length)/3)+" chances to find the word");
       int chance=0,increment=0;
        do{
        System.out.println("_____________________________________________________________");
        System.out.println("Enter the char that you guessed:(chance:"+" "+(chance++)+")");    
        String  User_Str=scanner.next().toUpperCase();
        char user_char=User_Str.charAt(0);
        findChar(String_Buffer,Selected_Str,user_char);
        for(int i=0;i<String_Buffer.length();i++){
          System.out.print(String_Buffer.charAt(i)+" ");
       }
         System.out.println();
        increment++;
  
        if(Selected_Str.equals(String_Buffer.toString()))
        {
            System.out.println("you win!!");
            stop=1;
            break;
        }
         }while(increment<=Selected_Str_Length-(Selected_Str_Length)/3);
         if(stop==0){
             System.out.println("you loss!!");
         }
	}
	static String findChar(StringBuffer String_Buffer,String Selected_Str,char user_char){
	    flag=0;
	   for (int i=0;i<Selected_Str.length();i++){
	        if(Selected_Str.charAt(i)==user_char && String_Buffer.charAt(i)!=user_char){
	              flag=1;
	              String_Buffer.setCharAt(i,user_char);
	        }
	        
	    }
	    if(flag==1){
	        System.out.println("correct guess");
	    }
	    else{
	        System.out.println("wrong guess");
	    }
	    return String_Buffer.toString();
	}
	
}
