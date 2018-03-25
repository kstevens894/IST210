
public class HourlyEmployee extends Employee 
{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}
	
	public void setWage(double wage)
	{
		wage = (wage < 0.0) ? 0.0 : wage;
	}
	
	public double getWage()
	{
		return wage;
	}
	
	public void setHours(double hours)
	{
		hours = ((hours >= 0.0) && (hours <= 168.0))? hours :0.0;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public double earnings()
	{
		if ( getHours() <= 40)
		{
			return getWage() * getHours();
		}
		else
		{
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	@Override
	public String toString()
	{
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", getWage(), "hours worked",
				getHours());
	}
}
