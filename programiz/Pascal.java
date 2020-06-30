package programiz;

import java.util.Scanner;

public class Pascal {
	 private static void print(int no) {
		 int count=1,len=no;
	 for(int i=1;i<=no;i++) {
		 for(int spaces=0;spaces<len-i;spaces++) {
			 System.out.print(" ");
		 }
		 for(int indent=0;indent<i;indent++) {
			 System.out.print();
		 }
		 System.out.println();
	 }
	 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter  no of rows:");
		int no=scan.nextInt();
		print(no);
		scan.close();
	}

}

//____1 //4
//___1_1_//3
//__1_2_1//2
//_1_3_3_1_//1
//1_4_6_4_1