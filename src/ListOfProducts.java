import java.util.ArrayList;

public class ListOfProducts {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Phone");
		products.add("Tablet");
		products.add("Monitor");
		products.add("Keyboard");
		products.add("Mouse");
		products.add("Headphones");
		
		products.sort((a,b) -> a.compareTo(b));
		System.out.println("Alphabetical: " + products);
		
		products.sort((a,b) -> a.length() - b.length());
		System.out.println("By Length: " + products);
		
		Runnable printTask = () -> System.out.println("Processing product list..");
		new Thread(printTask).start();
		
		products.removeIf(p -> p.length() < 6);
		System.out.println("After removeIf (length < 6): " + products);
	}

}
