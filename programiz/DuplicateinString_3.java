package programiz;
import java.util.Scanner;

public class DuplicateinString_3 {
	int [] array=new int[128];
	String nonDuplSt="";
    public void checkOccurence(String str) {
    	for(int i=0;i<str.length();i++) {
    		char ch=str.charAt(i);
    		if(nonDuplSt.indexOf(ch)<0)
    			nonDuplSt+=ch;
    		array[ch]++;
    	}
    }
    public void display(String str) {
    	for(int i=0;i<str.length();i++) {
    		System.out.println(str.charAt(i)+" "+array[str.charAt(i)]);
    	}
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DuplicateinString_3 dup =new DuplicateinString_3();
		System.out.println("enter the string");
		String str=scan.next();
		dup.checkOccurence(str);
		dup.display(dup.nonDuplSt);
		scan.close();

	}

}
