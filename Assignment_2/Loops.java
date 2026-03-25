package default_package;
public class Loops {

	public static void main(String[] args) {
		
		// FOR LOOP
		
		for(int i=7; i<=7; i++) {
			for(int j=1; j<=10; j++) {
				
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
		
		// WHILE LOOP
		
		int i=2;
		
		while(true) {
			if(i*i > 500) {
				System.out.println("First number greater than 1 whose square is strictly greater than 500: " + i);
				break;
			}
			i++;
		}
		
		// NESTED LOOP
		
		System.out.println("right-angled triangle pattern made of stars (*) with exactly 5 rows: ");
		
		int a, b, row=5;
		
		for(a=0; a< row; a++) {
			
			for(b = 2*(row-a); b>=0; b--) {
				System.out.print(" ");
			}
			
			for(b=0; b<=a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
