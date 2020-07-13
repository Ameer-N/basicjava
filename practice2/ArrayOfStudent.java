package practice2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class  CompareByArrayScore implements Comparator<ArrayOfStudent>{
	@Override
	public int compare(ArrayOfStudent s1, ArrayOfStudent s2) {
		return s2.score-s1.score;
	}
	
}
class  CompareByArrayName implements Comparator<ArrayOfStudent>{
	@Override
	public int compare(ArrayOfStudent s1, ArrayOfStudent s2) {
		return s1.name.compareTo(s2.name);
	}
	
}

public class ArrayOfStudent {
	int studentId;
	String name;
	String branch;
	int score;
	public ArrayOfStudent(int studentId,String name,String branch,int score) {
     this.studentId =studentId;
     this.name = name;
     this.branch= branch;
     this.score = score;
	}
	@Override
	public String toString() {
	   return "studentId="+studentId+",name="+name+",Branch="+branch+",score="+score;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of Student:");
		int limit =scan.nextInt();
		ArrayOfStudent[] arr = new ArrayOfStudent[limit];
		scan.close();
		for(int lim=0;lim<limit;lim++) {
			int studentId = lim+limit;
			String name="";
			int size=(int)(Math.random()*(10-5+1))+5;
			for(int inc=0;inc<size;inc++) {
				int no= (int)(Math.random()*(122-97-1))+97;
				name+=(char)no;
			}
			String[] strArr= {"CSE","MECH","ECE","EEE","CIVIL"};
			int branchChoice=(int)(Math.random()*(4-0+1))+0;
			String branch = strArr[branchChoice];
			int score=(int)(Math.random()*(100-10+1))+10;
			arr[lim]=new ArrayOfStudent(studentId,name,branch,score);
		}
		for(ArrayOfStudent val:arr) {
			System.out.println(val);
		}
		System.out.println("\nsorted array:\n");
		Arrays.sort(arr,new CompareByArrayScore().thenComparing(new CompareByArrayName()));
		for(ArrayOfStudent val:arr)
			System.out.println(val);
		System.out.println("higest score student:"+arr[0]);
	}
	
}
