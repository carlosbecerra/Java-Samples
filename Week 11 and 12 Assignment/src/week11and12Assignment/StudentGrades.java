package week11and12Assignment;
import java.util.ArrayList;

public class StudentGrades {
	
	private int studentID;
	private double[] studentGrades = new double[5];
	
	public StudentGrades() {
		this.studentID = 1;
		studentGrades = new double[5];
		
		for(int i = 0 ; i< studentGrades.length; i++ ) {
			studentGrades[i] = 0.15+i; 
			}
	}
	
	public StudentGrades(int studentID,double[] studentGrades) {
		this.studentID = studentID;
		for(int i = 0 ; i< studentGrades.length; i++ ) {
			this.studentGrades[i] = studentGrades[i]; 
			}
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double[] getStudentGrades() {
		return studentGrades;
	}

	public void setStudentGrades(double[] studentGrades) {
		for(int i = 0 ; i< studentGrades.length; i++ ) {
			this.studentGrades[i] = studentGrades[i]; 
			}
	}

	public void printStudentGrades() {
		
		double [] myArray = getStudentGrades();
		
		for(int i = 0 ; i< studentGrades.length; i++ ) {
			System.out.println(myArray[i]); 
			}
	}
	
	public void updateStudentGrade(int indexN, double grade) {
		studentGrades[indexN] = grade;
	}
}
