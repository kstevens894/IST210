import java.security.SecureRandom;

public class RollDice {
	
	public static void main(String[] args)
	{
	// randomNumbers object will produce secure random numbers
	SecureRandom randomNumbers = new SecureRandom();
	
	int face1;
	int face2;
	int[] totals = new int[13];
	int rollCount = 36000000;
	
	for (int roll = 1; roll <= rollCount; roll++)
	{
		
		face1 = 1 + randomNumbers.nextInt(6); // number from 1 to 6
		face2 = 1 + randomNumbers.nextInt(6); // number from 1 to 6
		
		totals[face1+face2]++;

	}

	System.out.println("Sum\tFrequency\tPercentage\n");
	for(int i = 2; i < totals.length; i++) {
		float p = (float)totals[i]*100/(float)rollCount;
		System.out.printf("%d\t%d\t\t%.2f\n", i, totals[i], p);
	}
	
	}
}
/* OUTPUT ANSWER 
 * Sum	Frequency	Percentage

	2	1000893		2.78
	3	1999737		5.55
	4	3000912		8.34
	5	3999923		11.11
	6	4999053		13.89
	7	5996393		16.66
	8	5000593		13.89
	9	4000116		11.11
	10	3002723		8.34
	11	1999317		5.55
	12	1000340		2.78
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
