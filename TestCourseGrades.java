import java.util.Scanner;

public class TestCourseGrades {
	public static void main(String[] arg) {
		CourseGrades testCG = new CourseGrades();
		Essay testE = new Essay();
		GradedActivity testGA = new GradedActivity();
		PassFailExam testPF = new PassFailExam(10,0,70);
		FinalExam testFE = new FinalExam(12,3);
		
		testE.setScore(70);
		testGA.setScore(89);
		testPF.setScore(100);
		
		testCG.setEssay(testE);
		testCG.setLab(testGA);
		testCG.setFailExam(testPF);
		testCG.setFinalExam(testFE);
		
	}
}