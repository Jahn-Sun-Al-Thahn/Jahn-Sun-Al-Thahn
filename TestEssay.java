import java.util.Scanner;

public class TestEssay {

	public static void main(String[] arg) {
		Essay test = new Essay();
		test.setContent(20);
		test.setCorrLength(20);
		test.setGrammar(10);
		test.setSpelling(20);
		System.out.print(test.getEssayGrade());
	}
}