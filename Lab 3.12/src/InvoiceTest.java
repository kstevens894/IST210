import java.text.DecimalFormat;
import java.util.Scanner;
public class InvoiceTest {
public static final DecimalFormat df1 = new DecimalFormat("##.###");
public static void main(String[] args) {
	Invoice invoice1 = new Invoice("1234","Hammer",2,14.95);
	Invoice invoice2 = new Invoice("001234", "Yellow Hammer",3,19.49);
	Invoice invoice3 = new Invoice("001234", "Yellow Hammer",-3,-19.49);
	System.out.println("Original Invoice");
	System.out.printf("Part number: %s\n", invoice1.getPartNumber());
	System.out.printf("Part Description: %s\n", invoice1.getPartdesc());
	System.out.printf("Quantity: %s\n", invoice1.getQuantity());
	System.out.printf("Price: %s\n", invoice1.getPrice());
	System.out.printf("Invoice Amount: %.2f\n", invoice1.getInvoiceAmount());
	System.out.println();
	//Updated Invoice//
	System.out.println("Updated Invoice Information");
	System.out.printf("Part number: %s\n", invoice2.getPartNumber());
	System.out.printf("Part Description: %s\n", invoice2.getPartdesc());
	System.out.printf("Quantity: %s\n", invoice2.getQuantity());
	System.out.printf("Price: %s\n", invoice2.getPrice());
	System.out.printf("Invoice Amount: %.2f\n", invoice2.getInvoiceAmount());
	System.out.println();
	//Negative invoice//
	System.out.println("With negative quantity and negative price");
	System.out.println("Updated Invoice Information");
	System.out.printf("Part number: %s\n", invoice3.getPartNumber());
	System.out.printf("Part Description: %s\n", invoice3.getPartdesc());
	System.out.printf("Quantity: %s\n", invoice3.getQuantity());
	System.out.printf("Price: %s\n", invoice3.getPrice());
	System.out.printf("Invoice Amount: %.2f\n", invoice3.getInvoiceAmount());
	System.out.println();
}
	//-------OUTPUT ANSWER-------//
		/*Original Invoice
		Part number: 1234
		Part Description: Hammer
		Quantity: 2
		Price: 14.95
		Invoice Amount: 29.90
		
		Updated Invoice Information
		Part number: 001234
		Part Description: Yellow Hammer
		Quantity: 3
		Price: 19.49
		Invoice Amount: 58.47
		
		With negative quantity and negative price
		Updated Invoice Information
		Part number: 001234
		Part Description: Yellow Hammer
		Quantity: 0
		Price: 0.0
		Invoice Amount: 0.00*/
}
