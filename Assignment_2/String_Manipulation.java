package default_package;

public class String_Manipulation {
	
	int countVowels(String s) {
		int vowels = 0;
		for(int i=0; i< s.length(); i++) {
			
			char c = Character.toLowerCase(s.charAt(i));
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
		}
	}
		return vowels;
}
	
	String reverseString(String s) {
		
		String rev = " ";
		
		for(int i= s.length()-1; i>=0; i--) {
			
			rev += s.charAt(i);
		}
		return rev;
	}
	
	boolean isPalindrome(String s) {
		
		String ignore = s.replace(" ", "").toLowerCase();
		String reverse = reverseString(ignore);
		
		return ignore.equals(reverse);
	}
	
	int countOccurrences(String text, String word) {
		
		int count = 0;
		
		text = text.toLowerCase();
		word = word.toLowerCase();
		
		int index = text.indexOf(word);
		
		while(index != -1) {
			count ++;
			
			index = text.indexOf(word, index + word.length());
		}
		return count;
	}


public static void main(String[] args) {
    String_Manipulation obj = new String_Manipulation();
    
    String str = "Madam In Eden Im Adam";
    String text = "Java is easy Java";

    System.out.println("Vowels: " + obj.countVowels(str));
    System.out.println("Reversed: " + obj.reverseString(str));
    System.out.println("Palindrome: " + obj.isPalindrome(str));
    System.out.println("Occurrences: " + obj.countOccurrences(text, "Java"));
}
}
	
