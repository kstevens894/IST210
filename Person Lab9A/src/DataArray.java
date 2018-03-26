
public class DataArray {
	private Person[] a;
	private int nElements;
	
	public DataArray(int max) {
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
	public boolean delete(String searchName) {
		int k;
		for (k = 0; k < nElements; k++) {
			if (a[k].getLast().equals(searchName))
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
	
}
