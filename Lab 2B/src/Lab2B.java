import java.util.Scanner;

public class Lab2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		int pennyamount;
		int dollars = 100;
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;
		System.out.print("Please enter an amount of pennies: ");
		pennyamount = Input.nextInt();
		System.out.printf("Original amount: %d\n", pennyamount);
//		System.out.println("Amount1: " + pennyamount);
		int Dollars = pennyamount / dollars;
		System.out.printf("Number of Dollars: %d\n", Dollars);
		int Newpennyamount = pennyamount % dollars;
//		System.out.println("Amount1: " + Newpennyamount);
		int Quarters = Newpennyamount / quarters;
		System.out.printf("Number of Quarters: %d\n", Quarters);
		int Newpennyamount2 = Newpennyamount % quarters;
//		System.out.println("Amount2:" + Newpennyamount2);
		int Dimes = Newpennyamount2 / dimes;
		System.out.printf("Number of Dimes: %d\n", Dimes);
		int Newpennyamount3 = Newpennyamount2 % dimes;
//		System.out.println("Amount3: " + Newpennyamount3);
		int Nickels = Newpennyamount3 / nickels;
		System.out.printf("Number of Nickels: %d\n", Nickels);
		int Newpennyamount4 = Newpennyamount3 % nickels;
//		System.out.println("Amount4: " + Newpennyamount4);
		int Pennies = Newpennyamount4 / pennies;
		System.out.printf("Number of pennies: %d\n", Pennies);
		int Newpennyamount5 = Newpennyamount4 % pennies;
//		System.out.println("Amount5: " + Newpennyamount5);
	}//end of main
}//end of class
			//-------OUTPUT ANSWER--------//
	/*  Please enter an amount of pennies: 777
		Original amount: 777
		Number of Dollars: 7
		Number of Quarters: 3
		Number of Dimes: 0
		Number of Nickels: 0
		Number of pennies: 2           */
