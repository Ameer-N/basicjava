package programiz;

import java.util.Scanner;

public class ReverseWord {
    public String getReversed(String str) {
		String[] arr=str.split(" ");
		String reversedStr="";
		for(String st:arr) {
			int i=st.length()-1;
			while(i>=0) {
				reversedStr+=st.charAt(i);
				i--;
			}
			reversedStr+=" ";
		}
		return reversedStr;
	}
	public static void main(String[] args) {
		ReverseWord rev=new ReverseWord();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string(line) to reverse :");
		String str=scan.nextLine();
		System.out.println(rev.getReversed(str));
		scan.close();

	}

}
