
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab228 {
	public static final DecimalFormat df1 = new DecimalFormat("#.##");	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int radius = 1;
		System.out.print("Enter radius: ");
		radius = Input.nextInt();
		System.out.printf("Radius: %d\n", radius);
		double diameter = 2 * radius;
		System.out.println("Diameter: " + df1.format(diameter));
		double circumference = Math.PI * 2*radius;
		System.out.println("Circumference: " + df1.format(circumference));
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area: " + df1.format(area));
		//--------------OUTPUT ANSWER---------------//
		/*Enter radius: 8
		Radius: 8
		Diameter: 16
		Circumference: 50.27
		Area: 201.06 */
	}

}
