package java_Session;
import java.util.Scanner;
public class Traffic_lights {
	public static void main(String[] args) {
	
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the color of light: ");
		String light = scr.nextLine();
		
		System.out.println("Light: " + light);
		
		switch(light) {
		
		case "Red":
			System.out.println("Instriction: STOP — Do not proceed.");
			break;
			
		case "Yellow":
			System.out.println("Instruction: CAUTION — Prepare to stop.");
			break;
		case "Green":
			System.out.println("Instruction: GO — Proceed safely.");
			break;
		default:
			System.out.println("Instruction: UNKNOWN signal — treat as Red.");
		}
		
		boolean safe = (light.equals("Green")) ? true : false;
		
		System.out.println("Safe to go: " + safe);
	}
}
