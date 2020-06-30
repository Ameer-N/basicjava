package programiz;

import java.util.Scanner;

public class CountvowNcons {
   public String changeToLower(String str){
	   String newStr="";
	   for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			   newStr+=(char)(str.charAt(i)+32);
		   }
		   else {
			   newStr+=(str.charAt(i));
		   }
	   }
	   return newStr;
   }
   public void checkVowelnConst(String lowerStr) {
	   int vCount=0,cCount=0;
	   for(int i=0;i<lowerStr.length();i++) {
		   char ch=lowerStr.charAt(i);
			   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				   vCount++;
			   }
			   else if(ch>='a' && ch<='z') {
				   cCount++;
			   }
	   }
	   System.out.println("vowel count:"+vCount+",consonont count:"+cCount);
    }
	public static void main(String[] args) {
		CountvowNcons count=new  CountvowNcons();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string to calculate occurance of vowel and consonents:");
		String str=scan.next();
		String lowerStr=count.changeToLower(str);
		count.checkVowelnConst(lowerStr);
        scan.close();
	}

}
