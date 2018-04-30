
public class Person implements Comparable<Person> {
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
	
	public int compareTo(Person other) 
	{
		int result;
		if (lastName.equals(((Person)other).lastName))
		{
			result = firstName.compareTo(((Person)other).firstName);
		}
		else
		{
			result = lastName.compareTo(((Person)other).lastName);
		}
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null || getClass() != obj.getClass())
		{
			return false;
		}
		Person other = (Person)obj;
		if(this.getClass() == other.getClass())
		{
			return true;
		}
		if (age != other.age)
		{
			return false;
		}
		if (this.firstName == null && other.firstName != null)
		{
			return false;
		}
		else if (!firstName.equals(other.firstName))
		{
			return false;
		}
		if (this.lastName == null && other.lastName != null)
		{
			return false;
		}
		else if (!lastName.equals(other.lastName))
		{
			return false;
		}
		return true;
	}
	
	public int getHashCode()
	{
		int prime = 31;
		int result = 1;
		result = result * prime + age;
		result = result * prime + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public String toString()
	{
		return "Person(" + firstName + " , " + lastName + " , " + age + ")";
	}
}
