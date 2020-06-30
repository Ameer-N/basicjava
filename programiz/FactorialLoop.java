package programiz;

import java.util.Scanner;

public class FactorialLoop {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int res=1;
		System.out.print("enter number(factorial):");
		int no=scan.nextInt();
		for(int i=no;i>1;i--) {
			res=res*no;
			no--;
		}
		System.out.println("result:"+res);
        scan.close();
	}

}
