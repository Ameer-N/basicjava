package practice2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CompareByStudentName implements Comparator<StudentRecord>{
	@Override
	public int compare(StudentRecord s1, StudentRecord s2) {
		return (s1.studentName).compareTo(s2.studentName);
	}
}
class CompareById implements Comparator<StudentRecord>{
	@Override
	public int compare(StudentRecord s1, StudentRecord s2) {
		return (s1.studentId) - (s2.studentId);
	}
}

public class StudentRecord{
    int studentId;
    String studentName;
    public StudentRecord(int studentId,String studentName) {
    	this.studentId = studentId;
    	this.studentName = studentName;
    }
    @Override
    public String toString() {
       return studentId+","+studentName;
    }
	public static void main(String[] args) {
		List<StudentRecord> list = new ArrayList<StudentRecord>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu option:");
		int option = 1;
		while(option !=4) {
			System.out.println("1.create a student Record\n2.Display based on student name\n3.display based on student Id\n 4.exit");
			System.out.print("enter option : ");
			option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("create a student details:");
				System.out.print("Enter studentId : ");
				int studentId=scan.nextInt();
				System.out.print("Enter student Name : ");
				String studentName=scan.next();
				list.add(new StudentRecord(studentId, studentName));
				System.out.println(list);
				break;
			case 2:
				System.out.println("display based on student name : ");
				Collections.sort(list,new CompareByStudentName());
				System.out.println(list);
				break;
			case 3:
				System.out.println("display based on student Id : ");
				Collections.sort(list,new CompareById());
				System.out.println(list);
				break;
			case 4:
				System.out.println("exit");
				break;
			}
		}
        scan.close();
	}

}
