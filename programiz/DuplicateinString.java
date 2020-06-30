package programiz;
import java.util.Scanner;

public class DuplicateinString {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter string:");
	  String str=scan.nextLine();
	  System.out.println(str);
	  scan.close();
	  char[] sq=str.toCharArray();
	  for(int i=0;i<sq.length;i++) {
		  for(int j=i+1;j<sq.length;j++) {
			  if(sq[i]>sq[j]) {
				  char temp;
				  temp=sq[i];
				  sq[i]=sq[j];
				  sq[j]=temp;
			  }
		  }
	  }
	  System.out.println(sq);
	  int [] arr=new int[128];
	  for(int i=0;i<sq.length;i++) {	
		  arr[(int)sq[i]]=++arr[(int)sq[i]];
	  }
	  for(int i=0;i<128;i++) {
		  if(arr[i]>=2)
		    System.out.println((char)i+": "+arr[i]);
	  }
	

	}

}
