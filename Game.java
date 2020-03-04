import java.util.*;
public class Main
{	
    static int flag=0,stop=0;
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in); 
	Random random=new Random();
	StringBuffer string_buffer=new StringBuffer();
	StringBuffer return_string_buffer=new StringBuffer();
	String selected_str=null;
	String [] string_array={"JOSEPHVIJAY","AJITHKUMAR","VIRATKOHLI","ABDULKALAM","SHAHRUKHKHAN","SIVAKARTHIKEYAN"};
	ArrayList<ArrayList<String> > aaList =new ArrayList<ArrayList<String> >();
	ArrayList<String> a = new ArrayList<String>();
	
	int select_random_string=random.nextInt(string_array.length);
	selected_str=string_array[select_random_string];
    int selected_str_length=selected_str.length();
    for (int i=0;i<selected_str_length;i++){
        string_buffer.append("_");
    }
 
    for (int i=0;i<(Math.round(selected_str_length)/3);i++){
        int select_random_string_buffer=random.nextInt(string_buffer.length());
       
        if(string_buffer.charAt(select_random_string_buffer)=='_'){
        string_buffer.setCharAt(select_random_string_buffer,selected_str.charAt((select_random_string_buffer)));
        }
       
    }
       System.out.println("Guess Me!!");
          System.out.println("WORD:");
       for(int i=0;i<string_buffer.length();i++){
          System.out.print(string_buffer.charAt(i)+" ");
       }
       System.out.println();
       int chance=0,increment=1;
        int chance2=selected_str_length-(Math.round(selected_str_length)/3);
        do{
        System.out.println("_____________________________________________________________");
        System.out.println("you have "+(chance2--)+" chances to find the word");
         System.out.println();
        System.out.println("Enter the char that you guessed:(Used chance:"+" "+(chance++)+")");    
        String  user_str=scanner.next().toUpperCase();
        char user_char=user_str.charAt(0);
        findChar(string_buffer,selected_str,user_char);
        for(int i=0;i<string_buffer.length();i++){
          System.out.print(string_buffer.charAt(i)+" ");
       }
         System.out.println();
        increment++;
  
        if(selected_str.equals(string_buffer.toString()))
        {
             System.out.println("_____________________________________________________________");
            System.out.println("you win!!");
            stop=1;
            break;
        }
         }while(increment<=selected_str_length-(Math.round(selected_str_length)/3));
         if(stop==0){
             System.out.println("_____________________________________________________________");
             System.out.println("you loss!!");
         }
	}
	static String findChar(StringBuffer string_buffer,String selected_str,char user_char){
	    flag=0;
	   for (int i=0;i<selected_str.length();i++){
	        if(selected_str.charAt(i)==user_char && string_buffer.charAt(i)!=user_char){
	              flag=1;
	              string_buffer.setCharAt(i,user_char);
	        }
	        
	    }
	    if(flag==1){
	        System.out.println("correct guess,keep going!");
	       
	    }
	    else{
	        System.out.println("wrong guess,try again!!");
	        
	    }
	    return string_buffer.toString();
	}
	
}
