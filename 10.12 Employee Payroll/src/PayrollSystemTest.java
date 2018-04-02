import java.util.Scanner;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest 
{
   public static void main( String[] args ) 
   {
	  double bonus;
      // create subclass objects
	   Date johnBirthDay = new Date (7,20,2002);
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee( "John", "Smith", "111-11-1111", johnBirthDay, 800.00 );
      
      Date karenBirthDay = new Date (3,15,1995);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee( "Karen", "Price", "222-22-2222", karenBirthDay, 16.75, 40 );
      Date sueBirthDay = new Date (9, 22, 1985);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee( 
         "Sue", "Jones", "333-33-3333", sueBirthDay, 10000, .06 );
      
      Date bobBirthDay = new Date (3,30, 1980);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee( 
         "Bob", "Lewis", "444-44-4444", bobBirthDay, 5000, .04, 300 );
      
      

      System.out.println( "Employees processed individually:\n" );
   
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings() );
      
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings() );
      
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings() );

      // create four-element Employee array
      Employee[] employees = new Employee[ 4 ]; 

      // initialize array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee; 
      employees[ 3 ] = basePlusCommissionEmployee;

      System.out.println( "Employees processed polymorphically:\n" );
      Scanner input = new Scanner(System.in);
      int currentMonth;
      System.out.print("Enter the current month (1 - 12): ");
      currentMonth = input.nextInt();
      System.out.println();   
      
      // generically process each element in array employees
      for ( Employee currentEmployee : employees ) 
      {
         System.out.println( currentEmployee ); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               ( BasePlusCommissionEmployee ) currentEmployee;
            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

            System.out.printf( 
               "new base salary with 10%% increase is: $%,.2f\n\n",
               employee.getBaseSalary() );
         } // end if
         
      } // end for

      // get type name of each object in employees array
      for ( int j = 0; j < employees.length; j++ )
         System.out.printf( "Employee %d is a %s\n", j, 
            employees[ j ].getClass().getName() ); 
      
   } // end main
} // end class PayrollSystemTest

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
/*
 * Employees processed individually:

salaried employee: John Smith
social security number: 111-11-1111
birth date: 7/20/2002
weekly salary: $800.00

earned: $800.00

hourly employee: Karen Price
social security number: 222-22-2222
birth date: 3/15/1995
hourly wage: $16.75; hours worked: 40.00

earned: $670.00

commission employee: Sue Jones
social security number: 333-33-3333
birth date: 9/22/1985
gross sales: $10,000.00; commission rate: 0.06

earned: $600.00

base-salaried commission employee: Bob Lewis
social security number: 444-44-4444
birth date: 3/30/1980
gross sales: $5,000.00; commission rate: 0.04
; base salary: $300.00
earned: $500.00

Employees processed polymorphically:

Enter the current month (1 - 12): 3

salaried employee: John Smith
social security number: 111-11-1111
birth date: 7/20/2002
weekly salary: $800.00

hourly employee: Karen Price
social security number: 222-22-2222
birth date: 3/15/1995
hourly wage: $16.75; hours worked: 40.00

commission employee: Sue Jones
social security number: 333-33-3333
birth date: 9/22/1985
gross sales: $10,000.00; commission rate: 0.06

base-salaried commission employee: Bob Lewis
social security number: 444-44-4444
birth date: 3/30/1980
gross sales: $5,000.00; commission rate: 0.04
; base salary: $300.00
new base salary with 10% increase is: $330.00

Employee 0 is a SalariedEmployee
Employee 1 is a HourlyEmployee
Employee 2 is a CommissionEmployee
Employee 3 is a BasePlusCommissionEmployee
 */