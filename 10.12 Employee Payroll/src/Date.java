
public class Date {
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth =
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
public Date() 
{
//	super (first, last, ssn, birthDate);
	month = 1;
	year = 1900;
	day = 1;
	//Object constructor
}
public Date(int theMonth, int theDay, int theYear) {
	month = checkMonth(theMonth);
	year = theYear;
	day= checkDay(theDay);
}

	private int checkMonth (int testMonth)
	{
		if (testMonth > 0 && testMonth <= 12)
			return testMonth;
		else
		{
			throw new IllegalArgumentException("month must be 1-12");
		}
	}//end of checkMonth method
	
	private int checkDay(int testDay)
	{
		
		if ( testDay > 0 && testDay <= daysPerMonth [ month ] )
			return testDay;
		
		if (month == 2 && testDay == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0) ) )
			return testDay;
		
		else
		{
			throw new IllegalArgumentException("day out-of-range for the specified month and year");
		}
	}
	
	public int getMonth()
	{
		return month;
	}

	public String toString()
	{
		return String.format("%d/%d/%d", month, day, year );
	}
}
