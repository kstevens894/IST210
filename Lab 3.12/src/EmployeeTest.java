
public class EmployeeTest {
public static void main(String[] args) {
	Employee employee1 = new Employee("Bob","Jones", 2875);
	Employee employee2 = new Employee("Susan", "Baker", 3150.75);
	System.out.printf("Employee 1: %s %s; Yearly Salary: $%,.2f\n", employee1.getFirstName() , employee1.getLastName() , employee1.getYearlySalary());
	System.out.printf("Employee 2: %s %s; Yearly Salary: $%,.2f\n", employee2.getFirstName() , employee2.getLastName() , employee2.getYearlySalary());
	System.out.println();
	System.out.println("Increasing employee salaries by 10%");
	System.out.printf("Employee 1: %s %s; Yearly Salary: $%,.2f\n", employee1.getFirstName() , employee1.getLastName() , employee1.getPercentSal());
	System.out.printf("Employee 2: %s %s; Yearly Salary: $%,.2f\n", employee2.getFirstName() , employee2.getLastName() , employee2.getPercentSal());
}
	//------OUTPUT ANSWER------//
/*
 * Employee 1: Bob Jones; Yearly Salary: $34,500.00
Employee 2: Susan Baker; Yearly Salary: $37,809.00

Increasing employee salaries by 10%
Employee 1: Bob Jones; Yearly Salary: $37,950.00
Employee 2: Susan Baker; Yearly Salary: $41,589.90
*/
}
