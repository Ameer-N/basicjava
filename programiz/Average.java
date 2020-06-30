package programiz;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter How many array do you want to insert?");
	    int count=scan.nextInt();
	    double []arr=new double[count];
	    double sum=0;
	    for(int i=0;i<count;i++) {
	    	arr[i]=scan.nextDouble();
	    	sum+=arr[i];
	    }
	    System.out.format("Average:%.2f",sum/count);
	    scan.close();
	}

}
