package week11and12AssignmentPart2;

public class UndergradStudent extends Student {

	private int SATScore;
	private int ACTScore;
	
	public UndergradStudent(String studentID, String studentName, int SATScore, int ACTScore) {
		super(studentID, studentName);
		this.ACTScore = ACTScore;
		this.SATScore = SATScore;
	}

	public int getSATScore() {
		return SATScore;
	}

	public int getACTScore() {
		return ACTScore;
	}
	
}
