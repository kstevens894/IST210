
public class Employee {
	//--Instance Variables--//
	private String firstname;
	private String lastname;
	private double monthlysalary;
	double year;
	double percent;
	public Employee(String first, String last, double month)
	{
		this.firstname = first;
		this.lastname = last;
		this.monthlysalary = month;
	}
	public void setFirstName(String first)
	{
		firstname = first;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public void setLastName(String last)
	{
		lastname = last;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setMonthlySalary(double month)
	{
		if (month > 0.0)
			monthlysalary = month;
		if (month < 0.0)
			monthlysalary = 0.0;
	}
	public double getMonth()
	{
		return monthlysalary;
	}
	public double getYearlySalary() {
		year = getMonth() * 12;
		return year;
	}
	public double getPercentSal() {
		percent = getYearlySalary() * .1 + getYearlySalary();
		return percent;
	}

}
