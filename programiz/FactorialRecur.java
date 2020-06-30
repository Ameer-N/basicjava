package programiz;

import java.util.Scanner;

public class FactorialRecur {
	public long  checkFact(long no) {
		if(no<=1) {
			return 1;
		}
		return no*checkFact(--no);
	}
	public static void main(String[] args) {
		FactorialRecur fact=new FactorialRecur();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no to check factorial:");
		long no=scan.nextLong();
		System.out.println("factorial no:"+fact.checkFact(no));
		scan.close();
	}

}
