import java.util.Scanner;

public class TestScores {
	private int[] Score;
	private int fullLength;
	private int hold;
	
	public TestScores() {
		//Gets the length of the array
		Scanner input = new Scanner(System.in);
		System.out.println("How many scores do you have?");
		fullLength = input.nextInt();
		this.Score = new int[fullLength];
		
		//Checks array length is correct
		showArray(this.Score);
			
		//Iterates to enter the scores into the array
		for(int i = 0; i < this.Score.length; i++) {
			System.out.println("Enter your " + i + " score: ");
			this.hold = input.nextInt();
			try {
				if(!isWithinRange(this.hold)) {
					throw new IllegalArgumentException();
				}
			}catch(IllegalArgumentException IAE) {
				System.out.print("The Entered Value is not within Range");
			}
			this.Score[i] = this.hold;
		}
		showArray(this.Score);
		input.close();
	}
		
	
	
	public int[] getScore() {
		return Score;
	}



	public void setScore(int[] score) {
		Score = score;
	}



	public static boolean isWithinRange(int num) {
		if(num > 0 && num < 100){
			return true;
		}else {
			return false;
		}
	}
	
	public void showArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("Element " + i + ": " + a[i] + "\n");
		}
	}
	
	public static void main(String[] args) {
		TestScores test = new TestScores();
		
		
		
		Scores test1 = new Scores(test.getScore());
		System.out.println("Test 1 Score Average: " + test1.getScoreListAvg());
		System.out.println("Your Scores were "); 
		test1.showScoreList();
		
		/*Scores test2 = new Scores();
		System.out.println("Test 2 Score Average: " + test2.getScoreListAvg());
		System.out.println("Your Scores were "); 
		test2.showScoreList();*/
		
	}
}
