import java.util.Arrays;

public class Game {
	public static final int PLAYER_ONE = 1;
	public static final int PLAYER_TWO = 2;
	public static final int GAME_DRAW = -1;
	public static final int GAME_CONTINUE = 0;
	int[] PlayerOne = new int[5];
	int[] PlayerTwo = new int[5];
	int playerOneCount = 0;
	int playerTwoCount = 0;
	

	private Mark[][] gameBoard = 
	{
		{Mark.E, Mark.E, Mark.E},
		{Mark.E, Mark.E, Mark.E},
		{Mark.E, Mark.E, Mark.E}
	};
	
	private int turnCounter = 0;
	private int gameState = GAME_CONTINUE;
	
	public Game()
	{}
	
	public boolean makeMove(int move)
	{
		boolean updateStateStatus = false;
		int rowindex = (move - 1)/3;
		int columnindex = (move - 1)%3;
		int currentplayer = getPlayer(); 
		if (gameBoard[rowindex][columnindex] == Mark.E) 
		{
			if(currentplayer == 1) {
				gameBoard[rowindex][columnindex] = Mark.X;
				PlayerOne[playerOneCount] = move;
				Arrays.sort(PlayerOne);
				playerOneCount++;
			}
			else
			{
				gameBoard[rowindex][columnindex] = Mark.O;
				PlayerTwo[playerTwoCount] = move;
				Arrays.sort(PlayerTwo);
				playerTwoCount++;
			}
			turnCounter++;
			if(turnCounter >= 5) {
				updateStateStatus = updateState(move);
			}
		}
		else 
		{
			System.out.print("Square is already taken. Please input a new square #.");
		}
		displayGame();
		return true;
	}//makeMove
	
	public void displayGame() 
	{
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(gameBoard[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private boolean updateState(int move) 
	{
		int tempArray[] = new int[5];
		int playercnt = 0;
		int currentplayer = getPlayer();
		if(currentplayer == 1) {
			tempArray = PlayerOne;
			playercnt = playerOneCount; 
		}
		else {
			tempArray = PlayerTwo;
			playercnt = playerTwoCount;
		}
		

		
		boolean winner = false;
		switch (move) {
		case 1:
			//check horizontal first
			for(int i = 2; i <=3; i++) {
				for(int j = 0; j < playercnt; j++) {
					if(tempArray[j] == i) {
						winner = true;
						break;
					}
					else {
						winner = false;
					}
				}
			}
			if(winner) {
				gameState = currentplayer;
				return true;
			}
			else {
				//check vertical
				for(int i = 4; i <=7; i+=3) {
					for(int j = 0; j < playercnt; j++) {
						if(tempArray[j] == i) {
							winner = true;
							break;
						}
						else {
							winner = false;
						}
					}
				}
				if(winner) {
					gameState = currentplayer;
					return true;
				}
				else {
					//check diagonal
					for(int i = 5; i <=9; i+=4) {
						for(int j = 0; j < playercnt; j++) {
							if(tempArray[j] == i) {
								winner = true;
								break;
							}
							else {
								winner = false;
							}
						}
					}
					if(winner) {
						gameState = currentplayer;
						return true;
					}
				}
			}			
			break;
		case 2:
			System.out.println("Hi 2");
			break;
		case 3:
			System.out.println("Hi 3");
			break;
		case 4:
			System.out.println("Hi 4");
			break;
		case 5:
			System.out.println("Hi 5");
			break;
		case 6: 
			System.out.println("Hi 6");
			break;
		case 7:
			System.out.println("Hi 7");
			break;
		case 8:
			System.out.println("Hi 8");
			break;
		case 9:
			//check horizontal first
			for(int i = 2; i <=3; i++) {
				for(int j = 0; j < playercnt; j++) {
					if(tempArray[j] == i) {
						winner = true;
						break;
					}
					else {
						winner = false;
					}
				}
			}
			if(winner) {
				gameState = currentplayer;
				return true;
			}
			else {
				//check vertical
				for(int i = 4; i <=7; i+=3) {
					for(int j = 0; j < playercnt; j++) {
						if(tempArray[j] == i) {
							winner = true;
							break;
						}
						else {
							winner = false;
						}
					}
				}
				if(winner) {
					gameState = currentplayer;
					return true;
				}
				else {
					//check diagonal
					for(int i = 5; i <=9; i+=4) {
						for(int j = 0; j < playercnt; j++) {
							if(tempArray[j] == i) {
								winner = true;
								break;
							}
							else {
								winner = false;
							}
						}
					}
					if(winner) {
						gameState = currentplayer;
						return true;
					}
				}
			}			
			break;
		}
		
		//My code
		
//		if(++turnCounter > 0) {
//			gameState = GAME_DRAW;
//			return true;
//		}
		
		return false;
	}//updateStatus
	
	public int currentTurn() {
		return turnCounter;
	}//currentTurn
	
	public int getState() {
		return gameState;
	}//getState
	
	public int getPlayer() {
		
		if ((turnCounter % 2) == 0)
			return PLAYER_ONE;
		else
			return PLAYER_TWO;
	}//getPlayer
	
	public String getPlayerName() {
		if(getPlayer() == PLAYER_ONE)
			return "Player 1";
		else
			return "Player 2";
	}//getPlayerName
}
