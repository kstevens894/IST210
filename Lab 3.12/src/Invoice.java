
public class Invoice {
	//--Instance Variables--//
	private String partnumber;
	private String partdesc;
	private int quantity;
	private double priceper;
	double amount;
	public Invoice(String num, String partDescription, int quantity, double price)
	{
		this.partnumber = num;
		this.partdesc = partDescription;
		this.quantity = quantity;
		this.priceper = price;
		
		if(price < 0.0)
			priceper = 0.0;
		if(quantity < 0)
			this.quantity = (int) 0.0;
	}
	public void setPartNumber(String num)
	{
		partnumber = num;
	}
	public String getPartNumber()
	{
		return partnumber;
	}
	public void setPartdesc (String description)
	{
		partdesc = description;
	}
	public String getPartdesc()
	{
		return partdesc;
	}
	public void setQuantity(int countq)
	{
		if(countq > 0)
			quantity = 0;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice (double price)
	{
		if(price > 0.0)
			priceper = price;
		if(price < 0.0)
			priceper = 0.0;
	}
	public double getPrice()
	{
		return priceper;
	}
	public double getInvoiceAmount() {
		amount = getQuantity() * getPrice();
		return amount;
	}
	
}
