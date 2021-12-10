/*
*/
import java.util.Scanner;

public class PaperRockScissors{
	String Player;
	int inputPlayer;
	String Computer;
	int inputComputer;
	
	PaperRockScissors(){
		Scanner inputName = new Scanner(System.in);
		System.out.println("Choose a Username: ");
		Player = inputName.nextLine();
		Computer = "Helios";
		inputName.close();
	};
	
	public String getPlayerName() {
		return Player;
	};
	
	public void setPlayerChoice() {
		Scanner inputP = new Scanner(System.in);
		System.out.println("Choose a ");
		inputPlayer = inputP.nextInt();
		inputP.close();
	};
	
	public int getPlayerInput() {
		return inputPlayer;
	};
	
	public void setComputerChoice() {
		inputComputer = (int)(Math.random() * 10);
	};
	
	public int getComputerInput() {
		return inputComputer;
	};
	
	public void comparePlayers(int player, int computer) {

		if(player == 0 && computer == 2) {
			//player winner
			System.out.println("Player Wins: Scissors Beats Paper");
		} else if(player == 0 && computer == 1) {
			//computer winner
			System.out.println("Computer Wins: Rock Beats Scissors");
		} else if(player  == 0  && computer == 0) {
			//tie
			System.out.println("Tied Game: Scissors For Everyone");
		} else if(player == 1 && computer == 0) {
			//player winner
			System.out.println("Player Wins: Rock Beats Scissors");
		} else if(player  == 1 && computer == 1) {
			//tie
			System.out.println("Tied Game: Its a Rock Slide");
		} else if(player == 1  && computer == 2) {
			//computer winner
			System.out.println("Computer Wins: Paper Covers Rock");
		} else if(player == 2 && computer == 2) {
			//tie
			System.out.println("Tied Game: Origami Anyone?");
		} else if(player == 2 && computer == 1) {
			//player winner
			System.out.println("Player Wins: Paper Covers Rock");
		} else if(player == 2 && computer == 0) {
			//computer winner
			System.out.println("Computer Wins: Scissors Beats Paper");
		} else {
			System.out.println("Game Error: Inevitable Failure");
		}; 
	};
	
	public static void main(String[] args) {
		int incoming;
		
		//Game Start - Welcome, explain rules
		System.out.println("Lets Play, Paper! Rock! Scissors! \n Paper beats Rock, Rock Beasts Scissors, and Scissors Cuts Paper, Samesys means its Tied");
		
		//Game loops - Player first, Then Computer, then comparison
		PaperRockScissors NewGame = new PaperRockScissors();
		NewGame.setPlayerChoice();
		NewGame.setComputerChoice();
		NewGame.comparePlayers(NewGame.getPlayerInput(), NewGame.getComputerInput());
		
		System.out.println("Hey " + NewGame.getPlayerName() + ", To Quit press 3");
		Scanner Play = new Scanner(System.in);
		incoming = Play.nextInt();
		Play.close();
		
		//Game Quit Option --> Option made if Loop were to be added.
		if(incoming == 3) {
			System.exit(0);
		};
		
		
		
	};
}