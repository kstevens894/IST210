import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		int maxSize = 100;
		Scanner input = new Scanner(System.in);
		DataArray arr;
		arr = new DataArray(maxSize);
		
		arr.insert("Nichols","Paul", 29);
		arr.insert("Steven", "Bob", 50);
		arr.insert("Ming", "Dave", 44);
		arr.insert("Williams", "Kyle", 10);
		arr.insert("Donovan","Michael", 19);
		arr.insert("Quin", "Adam", 34);
		arr.insert("Coke", "Pepsi", 80);
		arr.insert("Apple", "Red", 20);
		arr.insert("Kyles", "Dan", 31);
		arr.insert("Johns", "Brett", 49);
		
		System.out.println();
		System.out.print("-----------------Display All-----------------");
		System.out.println();
		arr.displayAll();
		System.out.println();
		
		//-----------FIND--------------------------//
		System.out.print("-----------------FIND-----------------\n");
		System.out.print("Find a person: ");
		
		String searchKey = "Williams";
		Person personFound;
		personFound = arr.Find(searchKey);
		System.out.println();
		if (personFound != null)
		{
			System.out.print("Found ");
			personFound.displayPerson();
		}
		else
		{
			System.out.print("Can't find " + searchKey);
		}
		System.out.println();
		//-------------Delete---------------------------//
		
		System.out.print("Delete Steven, Ming, and Williams\n");
		if (arr.delete("Steven")){
			System.out.println();
			System.out.print("Successfully deleted \"Steven\"");
		}
		
		else {
			System.out.println();
			System.out.print("Not found. Could not delete \"Steven\"");
		}
		if (arr.delete("Ming")){
			System.out.println();
			System.out.print("Successfully deleted \"Min\"");
		}
		else {
			System.out.println();
			System.out.print("Not found. Could not delete \"Ming\"");
		}
		if (arr.delete("Dang")){
			System.out.println();
			System.out.print("Successfully deleted \"Williams\"");
		}
		else {
			System.out.println();
			System.out.print("Not found. Could not delete \"Williams\"");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("Display all after deleting, Smith, Yee, and Williams.\n\n");
		arr.displayAll();
		System.out.println();
		System.out.println();
		
		//-------------------------INSERT---------------------------//
		
		String lastName, firstName;
		int age;
		
		System.out.println("Insert: Please enter firstName: ");
		firstName = input.nextLine();
		
		System.out.println("Insert: Please enter lastName: ");
		lastName = input.nextLine();
		
		System.out.println("Insert: Please enter age: ");
		age = input.nextInt();
		System.out.println();
		
		arr.insert(lastName, firstName, age);
		System.out.printf("Enter Successfully %s, %s, %d%n", firstName, lastName, age);
		
		System.out.print("---------Display all persons---------\n");
		arr.displayAll();
}
}
/*
-----------------Display All-----------------
Last Name: Nichols, First Name: Paul, Age: 29
Last Name: Steven, First Name: Bob, Age: 50
Last Name: Ming, First Name: Dave, Age: 44
Last Name: Williams, First Name: Kyle, Age: 10
Last Name: Donovan, First Name: Michael, Age: 19
Last Name: Quin, First Name: Adam, Age: 34
Last Name: Coke, First Name: Pepsi, Age: 80
Last Name: Apple, First Name: Red, Age: 20
Last Name: Kyles, First Name: Dan, Age: 31
Last Name: Johns, First Name: Brett, Age: 49

-----------------FIND-----------------
Find a person: 
Found Last Name: Williams, First Name: Kyle, Age: 10

Delete Steven, Ming, and Williams

Successfully deleted "Steven"
Successfully deleted "Min"
Not found. Could not delete "Williams"

Display all after deleting, Smith, Yee, and Williams.

Last Name: Nichols, First Name: Paul, Age: 29
Last Name: Williams, First Name: Kyle, Age: 10
Last Name: Donovan, First Name: Michael, Age: 19
Last Name: Quin, First Name: Adam, Age: 34
Last Name: Coke, First Name: Pepsi, Age: 80
Last Name: Apple, First Name: Red, Age: 20
Last Name: Kyles, First Name: Dan, Age: 31
Last Name: Johns, First Name: Brett, Age: 49


Insert: Please enter firstName: 
Will
Insert: Please enter lastName: 
Jackson
Insert: Please enter age: 
10

Enter Successfully Will, Jackson, 10
---------Display all persons---------
Last Name: Nichols, First Name: Paul, Age: 29
Last Name: Williams, First Name: Kyle, Age: 10
Last Name: Donovan, First Name: Michael, Age: 19
Last Name: Quin, First Name: Adam, Age: 34
Last Name: Coke, First Name: Pepsi, Age: 80
Last Name: Apple, First Name: Red, Age: 20
Last Name: Kyles, First Name: Dan, Age: 31
Last Name: Johns, First Name: Brett, Age: 49
Last Name: Jackson, First Name: Will, Age: 10*/
