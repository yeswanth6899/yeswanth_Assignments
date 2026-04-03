import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
	public static void main(String[] args) {
		HashMap<String, Integer> markSheet = new HashMap<>();
		markSheet.put("Alice", 88);
		markSheet.put("Bob", 74);
		markSheet.put("Carol", 95);
		markSheet.put("David", 60);
		markSheet.put("Eva", 82);
		
		System.out.println("Bob's Marks: " + markSheet.get("Bob"));
		System.out.println("Frank's Marks: " + markSheet.getOrDefault("Frank", 0));
		
		markSheet.put("David", 75);
		
		System.out.println("Carol Present: " + markSheet.containsKey("Carol"));
		
		for (Map.Entry<String, Integer> entry : markSheet.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " Marks: " + entry.getValue());
        }
		
		System.out.println("Total Entries: " + markSheet.size());
	}

}
