import java.util.Scanner;
public class Lab230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		int digitInput;
		Scanner input = new Scanner(System.in);
		//PROMPT user for 4 digit number//
		System.out.print("Enter a 5 digit number: ");
		//Store Users input
	    digitInput = input.nextInt();
	    digit1 = digitInput / 10000;
	    digit2 = digitInput % 10000 / 1000;
	    digit3 = digitInput % 1000 / 100;
	    digit4 = digitInput % 100 / 10;
	    digit5 = digitInput % 10;
	    System.out.printf("Digits in %d are %d %d %d %d %d", digitInput, digit1, digit2, digit3, digit4, digit5);
		//Calculations to pull each digit seperately//
		
	}

}
