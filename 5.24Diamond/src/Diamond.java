
public class Diamond {

	public static void main(String[] args) {
		int spaces = 4, a = 1;
		for(int lines = 1; lines <= 5; lines++)
		{
			for( int w = 1; w <= spaces; w++)
			{
				System.out.print(" ");
			}
			for( int w = 1; w <= a; w++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces--;
			a +=2;
		}
		a = 7;
		spaces = 1;
		for(int lines = 1; lines <= 4; lines++)
		{
			for( int w = 1; w <= spaces; w++)
			{
				System.out.print(" ");
			}
			for( int w = 1; w <= a; w++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces++;
			a -=2;
		}  
	}
	//OUTPUT ANSWER
	/*
			*
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
	 */
	
}
