
public class CheckerBoard {

	public static void main(String[] args) {
	int r = 1;
	int c = 0;
	while(c <= 3) {
		for ( r = 1;r <= 8; r++) {
			System.out.print("* ");
		}
		
		System.out.println();
		System.out.print(" ");
		
		for ( r = 1; r <=8; r++) {
			System.out.print("* ");	
		}
		System.out.println();
		c++;
	}
	}
	//OUTPUT ANSWER//
/*	
    * * * * * * * * 
	 * * * * * * * * 
	* * * * * * * * 
	 * * * * * * * * 
	* * * * * * * * 
	 * * * * * * * * 
	* * * * * * * * 
	 * * * * * * * * 
*/
}
