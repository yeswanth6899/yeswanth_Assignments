import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeData {
	public static void main(String[] args) {
		
		List<Integer> salaries = Arrays.asList(25000, 42000, 15000, 68000, 31000, 72000, 19000, 55000);
		
		System.out.println("Ascending Order: ");
		salaries.stream()
		.sorted()
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println("\nDescending Order: ");
		salaries.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.print(s + " "));
		
		int total = salaries.stream()
							.reduce(0, Integer::sum);
		System.out.println("Total Salary: " + total);
		
		long count = salaries.stream()
							.filter(s -> s > 40000)
							.count();
		System.out.println("Salary above 40000: " + count);
		
		int firstHighest = salaries.stream()
								   .filter(s -> s > 60000)
								   .findFirst()
								   .orElse(-1);
		System.out.println("First Salary > 60000: " + firstHighest);
		
		double average = salaries.stream()
								 .mapToInt(Integer :: intValue)
								 .average()
								 .orElse(0);
		System.out.println("Average Salary: " + average);
	}

}
