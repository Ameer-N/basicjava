package programiz;

import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] matA= {{1, 1, 1, 1}, {2, 3, 5, 2}};
		int[][] matB= {{2, 3, 4, 5}, {2, 2, 4, -4}};
		int row=matA.length;
		int column=matA[0].length;
		int[][] sum=new int[row][column];
		System.out.println("sum of two matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sum[i][j]=matA[i][j]+matB[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

	}

}
