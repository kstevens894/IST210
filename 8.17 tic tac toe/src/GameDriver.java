
import java.util.Scanner;

public class GameDriver {
	
	private static final int HUMAN = 1;
	private static final int COMP = 2;
	
	private Scanner input = new Scanner(System.in);
	private boolean moveSuccess = false;
	private Game myGame = new Game();
	
	public static void main(String[] args) {
		GameDriver driver = new GameDriver();
		driver.playGame();
	}//end of main
	
	public void playGame()
	{
		myGame.displayGame();
		
		while(myGame.getState() == Game.GAME_CONTINUE) {
			
			System.out.printf("%n%s enter square #: ", myGame.getPlayerName());
			playerHuman();
						
		}//while game loop
		
		if(myGame.getState() == Game.GAME_DRAW){
			System.out.println("The game is a draw");
		} else {
			System.out.printf("%n%s won!%n%n", myGame.getPlayerName());
//			System.out.printf("Final score: %d%n", myGame.getScore());
		}
	}//playGame
	
	//run a human turn
	private void playerHuman()
	{
		do 
		{
			int readSquare = input.nextInt();
			
			moveSuccess = myGame.makeMove(readSquare);
		} while(!moveSuccess);
	}
}// end of GameDriver
