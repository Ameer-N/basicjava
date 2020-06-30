package programiz;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
	Random ran=new Random();
	System.out.println("the random generated no is:"+Math.random());
	System.out.println("random number between 200:(0-199 both inclusive)");
	for(int i=0;i<5;i++)
		System.out.println("random no "+(i+1)+":"+ran.nextInt(200));
	}

}
