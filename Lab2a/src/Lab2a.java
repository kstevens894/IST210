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
		Scanner s = new Scanner(System.in);
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
			System.out.printf("Boolean = %b\n", bool);	
		//----------------PART 2-------------------//
			System.out.format("**** Part2: ****\n");
			Scanner Input = new Scanner(System.in);
			//Byte User Input Field//
			System.out.print("Enter a byte: ");
			byt = Input.nextByte();
			System.out.printf("Byte = %d\n", byt);
			//Short User Input Field//
			System.out.print("Enter a short: ");
			shrt = Input.nextShort();
			System.out.printf("Short = %d\n", shrt);
			//Int User Input Field//
			System.out.print("Enter a int: ");
			nt = Input.nextInt();
			System.out.printf("Int = %d\n", nt);
			//Long User Input Field//
			System.out.print("Enter a long: ");
			lng = Input.nextLong();
			System.out.printf("Long = %d\n", lng);
			//Float User Input Field//
			System.out.print("Enter a float: ");
			flt = Input.nextFloat();
			System.out.printf("Float = %f\n", flt);
			//Double User Input Field//
			System.out.print("Enter a double: ");
			dbl = Input.nextDouble();
			System.out.printf("Double = %G\n", dbl);
			//Char User Input Field//
			System.out.print("Enter a char: ");
			chr = s.next().charAt(0);
			System.out.printf("Char = %c\n", chr);
			//String User Input Field//
			System.out.print("Enter a string: ");
			str = Input.next();
			System.out.printf("String = %s\n", str);			
			//Boolean User Input Field//
			System.out.print("Enter a boolean: ");
			bool = Input.nextBoolean();
			System.out.printf("Boolean = %b\n", bool);
			//------------OUTPUT Answer-------------//
			/*
			 ***** Part1: ****
			Byte = 74
			Short = 16
			Int = 4
			Long Int = 64
			Float = 4.700000
			Double = 3.30000
			Char = l
			String = Im happy
			Boolean = false
			**** Part2: ****
			Enter a byte: 5
			Byte = 5
			Enter a short: 	2
			Short = 2
			Enter a int: 	14
			Int = 14
			Enter a long: 33333
			Long = 33333
			Enter a float: 	3.2
			Float = 3.200000
			Enter a double: 2.67
			Double = 2.67000
			Enter a char: k
			Char = k
			Enter a string: Hi
			String = Hi
			Enter a boolean: True
			Boolean = true
			*/
	}

}
