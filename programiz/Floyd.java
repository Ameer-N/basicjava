package programiz;

import java.util.Scanner;

public class Floyd {
   private static void print(int no) {
	int count=1;
	for(int i=0;i<no;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print((count++)+" ");
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
