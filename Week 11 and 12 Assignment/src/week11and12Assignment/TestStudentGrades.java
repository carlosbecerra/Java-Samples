package week11and12Assignment;

public class TestStudentGrades {

	public static void main(String[] args) {
		//1 Test the default constructor by create a new StudentGrades object stGr1. 
		StudentGrades stGr1 = new StudentGrades();
		
		//2 Test the default overloaded constructor by create a new StudentGrades object stGr2.
		double[] studentGrades = new double[5];
		for(int i = 0; i < studentGrades.length; i++) {
			studentGrades[i] = i+.25;
		}
		//2 Test the default overloaded constructor by create a new StudentGrades object stGr2.
		StudentGrades stGr2 = new StudentGrades(5,studentGrades);
		
		//3 For the stGr1 object, Test the getStudentGrades() by calling the getter and printing out the elements of the array
		System.out.println("Elements of array stGr1 using getStudentGrades(): ");
		double[] testGetter = stGr1.getStudentGrades();
		for(int i = 0; i < testGetter.length; i++) {
			System.out.println(testGetter[i]);
		}
		
		//4 For the stGr1 object, Test the setStudentGrades by calling the getter and printing out the elements of the array
		
		stGr1.setStudentGrades(studentGrades);
		
		System.out.println("Elements of array stGr1 using getStudentGrades(): ");
		double[] testGetter2 = stGr1.getStudentGrades();
		for(int i = 0; i < testGetter2.length; i++) {
			System.out.println(testGetter2[i]);
		}
		
		//Call the printStudentGrades() to print the elements of stGr1. It should show the new value
		System.out.println("Elements of array stGr1 using printStudentGrades(): ");
		stGr1.printStudentGrades();
		
		//Call the updateStudentGrade method for the strGr2 object and update the grades at index 2 to 40.5. 
		System.out.println("Elements of array stGr2 using printStudentGrades() and overloaded constructor and changing index 2: ");
		stGr2.updateStudentGrade(2,40.5);
		stGr2.printStudentGrades();
	}
}
