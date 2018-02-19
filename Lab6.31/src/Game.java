import java.util.Scanner;
import java.util.Random;
import java.lang.System;
public class Game {

	public void NumberGame ()
	{
		Random randomNumber = new Random();
		Scanner input = new Scanner(System.in);

		int values;
		int tries = 0;
		int success = 0;
		int guess;
		boolean Again;
		do {
			values = randomNumber.nextInt(1000);
			guess = 0;
			Again = false;
			while (guess != values)
			{
				System.out.println("Enter an integer between 1 & 1000: ");
				guess = input.nextInt();
				tries++;
				if (guess < 1 || guess > 1000) {
					System.out.println("Invalid input");
				}
				else if (guess < values) {
					System.out.println("Your guess is too low.....");
				}
				else if (guess > values) {
					System.out.println("Your guess is too high.....");
				}
			}
			success++;
			System.out.println("Congrats you won the guessing game!!! It took you "+ tries + " tries and the number was: " + values);
			System.out.println("Do you want to play again?");
			switch (input.next()) {
			case "yes":
				Again = true;
				break;
			default:
				break;
			}
		}while(Again);
		System.out.println("GoodBye");
		return;
		
	}
}

