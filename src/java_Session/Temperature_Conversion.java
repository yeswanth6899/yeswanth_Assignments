package java_Session;
import java.util.Scanner;
public class Temperature_Conversion {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the temperature in degrees: ");
		
		double c = scr.nextDouble();
		
		double f = (c * 9/5) + 32;
		double k = c + 273.15;
		
		System.out.println(c + " degrees in fahrenheit is: " + f + 'f');
		System.out.println(c + " degrees in Kelvin is: " + k + 'k');
		
	}

}
