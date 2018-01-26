import java.util.Scanner;

public class Lab2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring Variables & Assigning Values
		byte byt = 'J';
		short shrt = 16;
		int nt = 4;
		long lng = 64;
		float flt = (float) 4.7;
		double dbl = 3.3;
		char chr = 'l';
		String str = new String("Im happy");
		boolean bool = false;
		//---Printing each variable to the screen
			System.out.format("**** Part1: ****\n");
			System.out.printf("Byte = %d\n", byt);
			System.out.printf("Short = %d\n", shrt);
			System.out.printf("Int = %d\n", nt);
			System.out.printf("Long Int = %d\n", lng);
			System.out.printf("Float = %f\n", flt);
			System.out.printf("Double = %G\n", dbl);
			System.out.printf("Char = %c\n", chr);
			System.out.printf("String = %s\n", str);
			System.out.printf("Boolen = %b\n", bool);	
		//----------------PART 2-------------------//
			System.out.format("**** Part2: ****\n");
			Scanner Input = new Scanner(System.in);
			//Byte User Input Field//
			System.out.print("Enter a byte: ");
			byt = Input.nextByte();
			System.out.printf("Byte = %d\n", byt);
			//Short User Input Field//
			//Int User Input Field//
			//Long User Input Field//
			//Float User Input Field//
			//Double User Input Field//
			//Char User Input Field//
			//String User Input Field//
			//Boolean User Input Field//
			
	}

}
