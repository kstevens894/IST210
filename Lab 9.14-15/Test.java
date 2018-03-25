
public class Test {
	public static void main( String[] args )
	{
		//BaseCommision
		BasePlusCommissionEmployee employee = 
		         new BasePlusCommissionEmployee(
		            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		System.out.println(
		         "Employee information obtained by get methods:");
		      System.out.printf("%n%s %s%n", "First name is",
		         employee.getFirstName());
		      System.out.printf("%s %s%n", "Last name is", 
		         employee.getLastName());
		      System.out.printf("%s %s%n", "Social security number is", 
		         employee.getSocialSecurityNumber());
		      System.out.printf("%s %.2f%n", "Gross sales is", 
		         employee.getGrossSales());
		      System.out.printf("%s %.2f%n", "Commission rate is",
		         employee.getCommissionRate());
		      System.out.printf("%s %.2f%n", "Base salary is",
		         employee.getBaseSalary());
		System.out.println();
		
		//CommissionEmployee
		CommissionEmployee comEmployee = new CommissionEmployee(
				"Jill", "Sanders", "222-22-2222", 2000, .08);
		System.out.println(
				"CommisionEmployee Information");
		System.out.printf("%n%s %s%n", "First name is",
		          comEmployee.getFirstName());
		      System.out.printf("%s %s%n", "Last name is", 
		         comEmployee.getLastName());
		      System.out.printf("%s %s%n", "Social security number is", 
		         comEmployee.getSocialSecurityNumber());
		      System.out.printf("%s %.2f%n", "Gross sales is", 
		         comEmployee.getGrossSales());
		      System.out.printf("%s %.2f%n", "Commission rate is",
		         comEmployee.getCommissionRate());
		System.out.println();
		
		//HourlyEmployee
		HourlyEmployee hourEmployee = new HourlyEmployee("Dillion", "Jacobs",
				"1111-11-1111", 12, 30);
		System.out.println(
				"HourlyEmployee");
		System.out.printf("%n%s %s%n", "First name is",
		          hourEmployee.getFirstName());
		      System.out.printf("%s %s%n", "Last name is", 
		         hourEmployee.getLastName());
		      System.out.printf("%s %s%n", "Social security number is", 
		         hourEmployee.getSocialSecurityNumber());
		      System.out.printf("%s %.2f%n", "Wage is", 
		         hourEmployee.getWage());
		      System.out.printf("%s %.2f%n", "Hours are",
		         hourEmployee.getHours());
		System.out.println();
	}
	/*Employee information obtained by get methods:

First name is Bob
Last name is Lewis
Social security number is 333-33-3333
Gross sales is 5000.00
Commission rate is 0.04
Base salary is 300.00

CommisionEmployee Information

First name is Jill
Last name is Sanders
Social security number is 222-22-2222
Gross sales is 2000.00
Commission rate is 0.08

HourlyEmployee

First name is Dillion
Last name is Jacobs
Social security number is 1111-11-1111
Wage is 0.00
Hours are 0.00*/
}
