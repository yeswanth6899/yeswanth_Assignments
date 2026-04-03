import java.util.ArrayList;

public class ToDoListApp {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Read a book");
        tasks.add("Exercise");
        tasks.add("Call mom");
        tasks.add("Pay bills");

        
        int number = 1;
        for (String task : tasks) {
            System.out.println(number + ". " + task);
            number++;
        }

        
        tasks.remove("Exercise");
        tasks.remove(0);

        
        tasks.add(1, "Study Java");

        
        boolean isPresent = tasks.contains("Pay bills");

        
        System.out.println("After removals and additions:");
        int count = 1;
        for (String task : tasks) {
            System.out.println(count + ". " + task);
            count++;
        }

        System.out.println("Pay bills present: " + isPresent);
        System.out.println("List size: " + tasks.size());
    }
}