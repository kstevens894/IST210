import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		int maxSize = 100;
		Scanner input = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		DataArray arr;
		arr = new DataArray();
		int user;
		boolean TF = true;

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
		
		while(TF) 
		{
				System.out.println();
				System.out.print("    ---Person Directory---");
				System.out.println();
				System.out.print("1.    Find a person by lastName");
				System.out.println();
				System.out.print("2.    Display all persons");
				System.out.println();
				System.out.print("3.    Display count of persons in the directory");
				System.out.println();
				System.out.print("4.    Insert a person");
				System.out.println();
				System.out.print("5.    Delete a person");
				System.out.println();
				System.out.print("6.    Sort persons and update the person directory");
				System.out.println();
				System.out.print("7.    Delete all persons from the directory");
				System.out.println();
				System.out.print("8.    Re-populate the directory");
				System.out.println();
				System.out.print("9.    Quit");
				System.out.println();
				System.out.print("---------------------------------------------------");
				System.out.println();
				System.out.println("Enter you select [1-9]: ");
				user = input.nextInt();
				System.out.println();
				String lastName = null, firstName;
				int age;
				switch(user)
				{
				case 1: System.out.print("-----------Find----------");
						System.out.println();
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
						
						String searchKey2 ="Jill";
						personFound = arr.Find1(searchKey2);
						System.out.println();
						if (personFound != null)
						{
							System.out.print("Found ");
							personFound.displayPerson();
						}
						else
						{
							System.out.print("Can't find " + searchKey2);
						}
						System.out.println();
				break;
				case 2: arr.displayAll();
				break;
				
				case 3: System.out.print("There are 10 people in the array");
				System.out.println();
				break;
				
				case 4:
						System.out.println("Insert: Please enter firstName: ");
						firstName = name.nextLine();
						System.out.println();
						
						System.out.println("Insert: Please enter lastName: ");
						lastName = name.nextLine();
						
						System.out.println("Insert: Please enter age: ");
						age = name.nextInt();
						System.out.println();
						
						arr.insert(lastName, firstName, age);
						System.out.printf("Enter Successfully %s, %s, %d%n", firstName, lastName, age);
						
				break;
			
				case 5: 
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
							System.out.print("Successfully deleted \"Ming\"");
						}
						else {
							System.out.println();
							System.out.print("Not found. Could not delete \"Ming\"");
						}
						if (arr.delete("Dang")){
							System.out.println();
							System.out.print("Successfully deleted \"Dang\"");
						}
						else {
							System.out.println();
							System.out.print("Not found. Could not delete \"Dang\"");
						}
						System.out.println();
				break;
				
				case 6:
						arr.bubbleSort();
						arr.bubbleSort();
						arr.displayAll();
				break;
				
				case 7:
						arr.delete(lastName);
				break;
				
				case 8:
						arr.bubbleSort();
						arr.bubbleSort();
						arr.displayAll();
				break;
				
				case 9:
						TF = false;
				break;
			    }
		}	
	}
}
/* 
    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
1

-----------Find----------

Found Last Name: Williams, First Name: Kyle, Age: 10

Can't find Jill

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
2

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

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
3

There are 10 people in the array

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
4

Insert: Please enter firstName: 
Joe

Insert: Please enter lastName: 
Ball
Insert: Please enter age: 
43

Enter Successfully Joe, Ball, 43

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
5

Delete Steven, Ming, and Williams

Successfully deleted "Steven"
Successfully deleted "Ming"
Not found. Could not delete "Dang"

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
6

Last Name: Apple, First Name: Red, Age: 20
Last Name: Ball, First Name: Joe, Age: 43
Last Name: Coke, First Name: Pepsi, Age: 80
Last Name: Donovan, First Name: Michael, Age: 19
Last Name: Johns, First Name: Brett, Age: 49
Last Name: Kyles, First Name: Dan, Age: 31
Last Name: Nichols, First Name: Paul, Age: 29
Last Name: Quin, First Name: Adam, Age: 34
Last Name: Williams, First Name: Kyle, Age: 10

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
7


    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
8

Last Name: Apple, First Name: Red, Age: 20
Last Name: Ball, First Name: Joe, Age: 43
Last Name: Coke, First Name: Pepsi, Age: 80
Last Name: Donovan, First Name: Michael, Age: 19
Last Name: Johns, First Name: Brett, Age: 49
Last Name: Kyles, First Name: Dan, Age: 31
Last Name: Nichols, First Name: Paul, Age: 29
Last Name: Quin, First Name: Adam, Age: 34
Last Name: Williams, First Name: Kyle, Age: 10

    ---Person Directory---
1.    Find a person by lastName
2.    Display all persons
3.    Display count of persons in the directory
4.    Insert a person
5.    Delete a person
6.    Sort persons and update the person directory
7.    Delete all persons from the directory
8.    Re-populate the directory
9.    Quit
---------------------------------------------------
Enter you select [1-9]: 
9
 */

