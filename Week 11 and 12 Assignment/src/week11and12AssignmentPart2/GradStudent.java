package week11and12AssignmentPart2;

public class GradStudent extends Student {

	private int GREScore;

	public GradStudent(String studentID, String studentName, int GREScore) {
		super(studentID, studentName);
		this.GREScore = GREScore;
	}

	public int getGREScore() {
		return GREScore;
	}
	
}
