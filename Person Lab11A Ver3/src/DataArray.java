
public class DataArray {
	int max = 100;
	private Person[] a;
	private int nElements;
	
	public DataArray() {
		a = new Person[max];
		nElements = 0;
		
	}
	
	public void insert(String last, String first, int age) 
	{
		a[nElements] = new Person(last, first, age);
		nElements++;
	}
	
	public void displayAll()
	{
		for(int m = 0; m < nElements; m++) {
			a[m].displayPerson();
		}
	}
	public Person Find(String searchName)
	{
		int k;
		for (k = 0; k < nElements; k++) {
			if (a[k].getLast().equals(searchName))
				break;
		}
		
		if (k == nElements) {
			return null;
		}
		else {
			return a[k];
		}
	}
	public Person Find1(String otherPerson)
	{
		int j;
		for  (j = 0; j < nElements; j++)
		{
			if (a[j].equals(otherPerson))
				break;
		}
		
		if (j == nElements)
		{
			return null;
		}
		else
		{
			return a[j];
		}
		
	}
	
	public void bubbleSort()
	{
		int outter, inner;
		Person temp;
		
		for (outter = nElements - 1; outter > 0; outter--)
		{
			for (inner = 0; inner < outter; inner++)
			{
				if(a[inner].compareTo(a[inner + 1]) > 0)
				{
					temp = a[inner];
					a[inner] = a[inner + 1];
					a[inner + 1] = temp; 
				}
			}
		}
	}
	public boolean delete(String searchName) {
		int k;
		for (k = 0; k < nElements; k++) {
			if (a[k].getLast().equalsIgnoreCase(searchName))
				break;
		}
		if (k == nElements) {
			return false;
		}
		else {
			for(int w = k; w < nElements; w++)
			{
				a[w] = a[w + 1];
			}
			
			nElements--;
			return true;
		}
	}
	
	public void populateArray()
	{
		
	}
	
}
