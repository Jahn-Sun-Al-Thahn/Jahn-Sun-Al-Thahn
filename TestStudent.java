import java.util.Scanner;

public class TestStudent{
	public int[] studentIdList;
	
	public int GradOrStudent(int[] studlist) {
		int Scount = 0;
		
		for(int i = 0; studlist != null; i++) {
			Scount++;
		}
		return Scount;
	}
	
	public void displayStudent(Student student) {
		System.out.println("Student[" + student.getID() + ", Name: " + student.getName() + ", Test Score: " + student.getScore());
		
	}
	
	public void displayGraduate(Graduate grad) {
		System.out.println("Student[" + grad.getID() + ", Name: " + grad.getName() + ", Test Score: " + grad.getScore() + ", Capstone Score: " + grad.getCapstoneProject() + ", Major: " + grad.getMajor());
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Graduate g1 = new Graduate();
		Student s2 = new Student();
		
		TestStudent t1 = new TestStudent();
		
		s1.setID(133330);
		s1.setFinalExam(50);
		s1.setMidtermScore(80);
		s1.setName(null);
		
		s2.setID(14250);
		s2.setFinalExam(50);
		s2.setMidtermScore(80);
		s2.setName(null);
		
		g1.setID(1268740);
		g1.setFinalExam(80);
		g1.setMidtermScore(80);
		g1.setCapstoneProject(98);
		g1.setMajor(Engineering);
		g1.setName(null);
		
		t1.GradOrStudent(null);
		t1.displayGraduate(g1);
		t1.displayStudent(s2);
		t1.displayStudent(s1);
		

		
	}
}