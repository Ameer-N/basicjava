package practice2;

import java.util.Scanner;

class Student{
	private int studentId;
	private String studentName;
	private float marks=0;
	boolean secondChance=false;
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public float getMarks() {
		return marks;
	}
	public boolean getsecondChance() {
		return secondChance;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setSecondChance(boolean secondChance) {
		this.secondChance = secondChance;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void identifyMark(float marks) {
		setMarks(marks);
	}
	public void identifyMark(float marks,float marks2) {
		setMarks(Math.max(marks,marks2));
	}
	public Student(int studentId,String studentName,boolean secondChance) {
		setStudentId(studentId);
		setStudentName(studentName);
		setSecondChance(secondChance);
	}
}
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentId=0;
		char option = 'y';
		float marks,marks2;
		String studentName;
		boolean secondChance=false;
		while(option == 'y') {
			System.out.println("Enter below student details:");
			System.out.print("Enter student Id: ");
			studentId = scan.nextInt();
			System.out.print("Enter student name: ");
			studentName = scan.next();
			System.out.print("is this second chance(true or false)?: ");
			secondChance = scan.nextBoolean();
			Student st = new Student(studentId, studentName, secondChance);
			if(!secondChance) {
				System.out.print("enter student mark: ");
		        marks=scan.nextFloat();
		        st.identifyMark(marks);
			}
			else {
				System.out.print("enter old student mark in firstchance: ");
		        marks=scan.nextFloat();
				System.out.print("enter new student mark in second chance: ");
		        marks2=scan.nextFloat();
		        st.identifyMark(marks,marks2);
			}
			System.out.print("the student details are :\nstudentId"+st.getStudentId()+"\nstudentname="+st.getStudentName()
			+"\nstudentMark  ="+st.getMarks()+"\nsecond chance = "+st.getsecondChance()+"\n");
			System.out.print("do you want to enter details againn:(y/n):");
		    option =scan.next().charAt(0);	
		}
		System.out.println("thank u!");
		scan.close();
    }
}
