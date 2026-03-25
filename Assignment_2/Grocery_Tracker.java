<<<<<<< HEAD
package default_package;

import java.util.ArrayList;

public class Grocery_Tracker {
	public static void main(String[] args) {
		
		ArrayList<String> groceryList = new ArrayList<>();
		
		groceryList.add("Apples");
		groceryList.add("Bread");
		groceryList.add("Milk");
		groceryList.add("Eggs");
		groceryList.add("Coffee");
		
		System.out.println("Grocery list is: " + groceryList);
		
		groceryList.remove(0);
		System.out.println("Updated Grocery list After removing items: " + groceryList);
		
		if(groceryList.contains("Milk")) {
			System.out.println("Milk is present in the list");
		}
		else {
			System.out.println("Milk is not present in the list");
		}
		
		System.out.println("Total no of items in the list is: " + groceryList.size());
		
		for(String item: groceryList) {
			System.out.println(item);
		}
		
	}

}
=======
package default_package;

import java.util.ArrayList;

public class Grocery_Tracker {
	public static void main(String[] args) {
		
		ArrayList<String> groceryList = new ArrayList<>();
		
		groceryList.add("Apples");
		groceryList.add("Bread");
		groceryList.add("Milk");
		groceryList.add("Eggs");
		groceryList.add("Coffee");
		
		System.out.println("Grocery list is: " + groceryList);
		
		groceryList.remove(0);
		System.out.println("Updated Grocery list After removing items: " + groceryList);
		
		if(groceryList.contains("Milk")) {
			System.out.println("Milk is present in the list");
		}
		else {
			System.out.println("Milk is not present in the list");
		}
		
		System.out.println("Total no of items in the list is: " + groceryList.size());
		
		for(String item: groceryList) {
			System.out.println(item);
		}
		
	}

}
>>>>>>> 7ea7e141b6440b42900aaa9ff550f5905408bd3d
