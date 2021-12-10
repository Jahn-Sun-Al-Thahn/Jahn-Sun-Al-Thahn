public class Graduate extends Student{
	private String major;
	private int CapstoneProject;
	private final boolean Graduate = true;
	
	
	public Graduate() {
		super();
	}


	public boolean isGraduate() {
		return Graduate;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public int getCapstoneProject() {
		return CapstoneProject;
	}


	public void setCapstoneProject(int capstoneProject) {
		CapstoneProject = capstoneProject;
	}


	public double ScoreCalc(int capstone) {
		double scoreCalc;
		scoreCalc = (0.3 * this.getMidtermScore()) + (0.3 * this.getFinalExam()) + (0.4 * CapstoneProject);
		this.setScore(scoreCalc);
		return this.getScore();
	};
}