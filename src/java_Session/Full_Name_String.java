package java_Session;

public class Full_Name_String {
	
	public static void main(String[] args) {
		
		String fullName =  "  alice marie johnson  ";
		
		String trimmed = fullName.trim();
		
		int firstSpace = trimmed.indexOf(" ");
        int secondSpace = trimmed.indexOf(" ", firstSpace + 1);

        String first = trimmed.substring(0, firstSpace);
        String middle = trimmed.substring(firstSpace + 1, secondSpace);
        String last = trimmed.substring(secondSpace + 1);
        
        first = trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1,5);
		middle = trimmed.substring(6,7).toUpperCase() + trimmed.substring(7,11);
	    last = trimmed.substring(12,13).toUpperCase() + trimmed.substring(13);
        
        String cleaned = first + " " + middle + " " + last;
        System.out.println("Cleaned: " + cleaned);
		
        System.out.println("First Name: " + first);
		System.out.println("Middle Name: " + middle);
		System.out.println("Last Name: " + last);
		
		int count = 0;
		String lower = cleaned.toLowerCase();
		
		for(int i=0; i< lower.length(); i++) {
			
			char c = lower.charAt(i);
			
			if( c== 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
			}
		}
		System.out.println("Vowels count: " + count);
		
		String reverse = "";
		
		for(int i=cleaned.length()-1; i>=0; i--) {
			reverse = reverse + cleaned.charAt(i);
		}
		
		System.out.println("Reversed String: " + reverse);
	}

}
