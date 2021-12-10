import java.util.Scanner;

public class Scores {
	private int ScoreListAvg;
	private int[] ScoreList;
	private int score;
	private boolean inRange = true;
	
	public Scores() {
		try {
			int hold;
			int length;
		
			//Gets the length of the array
			Scanner input = new Scanner(System.in);
			Scanner intwo = new Scanner(System.in);
			System.out.println("How many scores do you have?");
			length = input.nextInt();
			this.ScoreList = new int[length];
			input.close();
			
			//Iterates to enter the scores into the array
			for(int i = 0; i < this.ScoreList.length; i++) {
				System.out.println("Enter your scores");
				hold = intwo.nextInt();
				setScore(hold);
				this.ScoreList[i] = this.score;
				if(!this.inRange) {
					intwo.close();
					throw new IllegalArgumentException();
				}
				showScoreList();
				intwo.close();
			}
			average(ScoreList);
		}catch(IllegalArgumentException IAE) {
			IAE.getStackTrace();
			IAE.getMessage();
		}
	}
	
	
	public Scores(int[] scores) {
		try {
			this.ScoreList = new int[scores.length];
			//Iterates threw the array to check ranges
			for(int i = 0; i < this.ScoreList.length; i++) {
				this.inRange = isWithinRange(this.ScoreList[i]);
				if(this.inRange == false) {
					throw new IllegalArgumentException();
				}
				this.ScoreList[i] = scores[i];
			}
			average(ScoreList);
		}catch(IllegalArgumentException IAE) {
			IAE.getStackTrace();
			IAE.getMessage();
		}
	}

	
	
	public double getScoreListAvg() {
		return ScoreListAvg;
	}



	public void setScoreListAvg(int scoreListAvg) {
		ScoreListAvg = scoreListAvg;
	}



	public void showScoreList() {
		for(int i = 0; i < this.ScoreList.length; i++) {
			System.out.print("Element" + i + ": " + ScoreList[i] + "\n");
		}
	}

	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		if(isWithinRange(score)){
			this.score = score;
			this.inRange = true;
		}else {
			this.inRange = false;
			this.score = score;
		}
	}



	public void average(int[] Scs) {
		int scores = 0;
		int avg;
		
		for(int i = 0; i < Scs.length; i++) {
			scores += Scs[i];
		}
		avg = scores / Scs.length;
		this.setScoreListAvg(avg);
	}
	
	public boolean isWithinRange(int num) {
		if(num > 0 && num < 100){
			return true;
		}else {
			return false;
		}
	}
	
}
