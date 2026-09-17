import java.util.Scanner;
public class Temperature {
	
	public static void main (String[] args) {
		
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a temperature in Celsius: ");
	Double C= in.nextDouble();
	
	double F;
	F = (C*9/5)+32;
	
	
	System.out.println(C + "C = " + F + "F");

	}
}
