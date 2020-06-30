package programiz;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 3 number");
		long no1,no2,no3;
		no1=no2=no3=0;
		System.out.print("1 num: ");
		no1=scan.nextLong();
		System.out.print("2 num: ");
		no2=scan.nextLong();
		System.out.print("3 num: ");
		no3=scan.nextLong();
		System.out.printf("largest no %d\n",(no1>no2 && no1>no3)?no1:(no2>no3)?no2:no3);
		System.out.format("smallest no %d",(no1<no2 && no1<no3)?no1:(no2<no3)?no2:no3);
		scan.close();
	}

}
