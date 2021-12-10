public class CourseGrades {
	int[] grades;
	
	public void setLab(GradedActivity studentScore) {
		grades[0] = studentScore.getGrade();
	}
	
	public void setFailExam(PassFailExam studentScore) {
		grades[1] = (int)studentScore.getScore();
	}
	
	public void setEssay(Essay studentScore) {
		grades[2] = (int)studentScore.getEssayGrade();
	}
	
	public void setFinalExam(FinalExam studentScore) {
		grades[3] = studentScore.getGrade();
	}
	
	public String toString() {
		String send;
		send = grades[0] + " " + grades[1] + " " + grades[2] + " " + grades[3] + " ";
		return send;
	}
}