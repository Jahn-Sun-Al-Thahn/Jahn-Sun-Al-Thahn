public abstract class Student {
	private int ID;
	private String Name;
	private int midtermScore;
	private double Score;


	private int finalExam;
	
	public Student() {
		
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMidtermScore() {
		return midtermScore;
	}

	public void setMidtermScore(int midtermScore) {
		this.midtermScore = midtermScore;
	}

	public int getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}
	
	public double getScore() {
		return Score;
	}

	public void setScore(double score) {
		Score = score;
	}

	public double ScoreCalc() {		
		this.Score = (0.5 * this.midtermScore) + (0.5 * this.finalExam);
		return Score;
	}
	
	public abstract double ScoreCalc(int capstone);

}