import java.util.Scanner;

public class GamTester {
	private enum Status {CONTINUE, WON, LOST};
	public static void main (String[] args)
	{
		String decision;
		String userinput;
		String temp = "";
		String yes = "y";
		Scanner input = new Scanner(System.in);
		Game gametest = new Game();
		do {
			System.out.println("Would you like to play a game of Craps? [y|n]: ");
			userinput = input.nextLine();
			
			if (userinput.equalsIgnoreCase("y"))
			{
				gametest.Main();
			}
			else
			{	
				System.out.println("GoodBye..You said no so you cant wager unless you want to play");
				break;
			}
			
		}while(true);
		
		
	}
}
/*
 *  Would you like to play a game of Craps? [y|n]: 
	y
	Enter a wager less than your balance. Your Balance is $20000:
	5000
	Player rolled: 3: 1, 2
 	Player Loses
 	New Wager Amount: $15000
    
    Would you like to play a game of Craps? [y|n]: 
	y
	Enter a wager less than your balance. Your Balance is $20000:
	2900
	Player rolled: 5: 2, 3
	 Point is 5
	Player rolled: 5: 2, 3
	 Player Wins
	 New Wager Amount: $22900
	 
	 Would you like to play a game of Craps? [y|n]: 
	y
	Enter a wager less than your balance. Your Balance is $20000:
	4000
	Player rolled: 10: 3, 7
	 Point is 10
	Player rolled: 8: 6, 2
	 Player rolled: 7: 1, 6
	 Player Loses
	 New Wager Amount: $16000
	Would you like to play a game of Craps? [y|n]: 
	y
	Enter a wager less than your balance. Your Balance is $20000:
	2900
	Player rolled: 5: 2, 3
	 Point is 5
	Player rolled: 5: 2, 3
	 Player Wins
	 New Wager Amount: $22900
	Would you like to play a game of Craps? [y|n]: 
	  n
GoodBye..You said no so you cant wager unless you want to play
 
  
  
  
  
  
  
  
  
  
  
  
  
  
 * */
 