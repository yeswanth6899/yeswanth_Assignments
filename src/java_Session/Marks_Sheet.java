package java_Session;
import java.util.Scanner;
public class Marks_Sheet {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the marks for Maths: ");
		int maths = scr.nextInt();
		
		System.out.println("Enter the marks for Science: ");
		int science = scr.nextInt();
		
		System.out.println("Enter the marks for English: ");
		int english = scr.nextInt();
		
		System.out.println("Enter the marks for History: ");
		int history = scr.nextInt();
		
		System.out.println("Enter the marks for Java Programming: ");
		int javaProgramming = scr.nextInt();
		
		int total = maths + science + english + history + javaProgramming;
		
		double percentage = total/5;
		
		String Grade;
		
		if(percentage >= 90) {
			Grade = "A+";
		}
		else if(percentage >= 80) {
			Grade = "A";
		}
		else if(percentage >= 70) {
			Grade = "B";
		}
		else if(percentage >=60) {
			Grade = "C";
		}
		else if(percentage >=50) {
			Grade = "D";
		}
		else {
			Grade = "F";
		}
		
		boolean passed = (maths>=40 && science>=40 && english>=40 && history>=40 && javaProgramming>=40) ? true : false;
		
		int max = maths;
        String highest = "Maths";

        if (science > max) { max = science; highest = "Science"; }
        if (english > max) { max = english; highest = "English"; }
        if (history > max) { max = history; highest = "History"; }
        if (javaProgramming > max) { max = javaProgramming; highest = "Java Programming"; }

        int min = maths;
        String lowest = "Maths";

        if (science < min) { min = science; lowest = "Science"; }
        if (english < min) { min = english; lowest = "English"; }
        if (history < min) { min = history; lowest = "History"; }
        if (javaProgramming < min) { min = javaProgramming; lowest = "Java Programming"; }
        
        String Scholarship = (percentage >=85 && passed) ? "Eligible for Merit Scholarship." : "Not Eligible";

		
		
		System.out.println("--------Marks Sheet--------");
		System.out.println("Maths:" + maths);
		System.out.println("Science:" + science);
		System.out.println("English:" + english);
		System.out.println("English:" + english);
		System.out.println("Java Programming:" + javaProgramming);
		
		System.out.println("\nTotal: " + total);
        System.out.println("Percentage: " + percentage + "%");

        System.out.println("Grade: " + Grade);
        System.out.println("Status: " + (passed ? "PASS" : "FAIL"));

        System.out.println("Highest Subject: " + highest + " (" + max + ")");
        System.out.println("Lowest Subject: " + lowest + " (" + min + ")");

        System.out.println("Scholarship: " + Scholarship);
	}
}
