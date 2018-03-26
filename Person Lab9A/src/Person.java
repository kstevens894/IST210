
public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String last, String first, int agee)
	{
		lastName = last;
		firstName = first;
		age = agee;
	}
	
	public String getLast()
	{
		return lastName;
	}
	public String getFirst()
	{
		return firstName;
	}
	public int getAge()
	{
		return age;
	}
	
	public void displayPerson()
	{
		System.out.print("Last Name: " + lastName);
		System.out.print(", First Name: " + firstName);
		System.out.println(", Age: " + age);
	}
	
}
