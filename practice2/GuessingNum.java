package practice2;

import java.util.Scanner;
public class GuessingNum {
	int randomNo;
	public void generateRandomNo() {
		randomNo=(int)(Math.random()*(1001-1+1)+1);
		System.out.println("random no generated !"+randomNo);
	}
	public void checkEqual(int guessedNo) {
		if(guessedNo > randomNo) { System.out.println("Too high");}
		else if(guessedNo < randomNo) { System.out.println("Too low");}
		else { System.out.println("found!");}
	}
	public static void main(String[] args) {
		GuessingNum guess = new GuessingNum();
		Scanner scan = new Scanner(System.in);
		guess.generateRandomNo();
		int guessedNo=0;
		while(guessedNo != guess.randomNo) {
			System.out.print("enter guessed no:");
			guessedNo=scan.nextInt();
			guess.checkEqual(guessedNo);			
		}
		scan.close();
	}
}
