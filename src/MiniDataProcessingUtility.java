import java.util.*;
import java.util.function.*;
public class MiniDataProcessingUtility {

	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n%2 == 0;
		Predicate<Integer> isGraterThan50 = n -> n>50;
		
		int num1 = 48;
		int num2 = 72;
		System.out.println(num1 + " is Even: " + isEven.test(num1));
		System.out.println(num1 + " is Grater than 50: " + isGraterThan50.test(num1));
		
		System.out.println(num2 + " is Even: " + isEven.test(num2));
		System.out.println(num2 + " is Grater than 50: " + isGraterThan50.test(num2));
		
		Predicate<Integer> combined = isEven.and(isGraterThan50);
		System.out.println(num2 + " is both even and Grater than 50: " + combined.test(num2));
		
		Function<String, String> addGreeting = name -> "Hello " + name + " !";
		System.out.println(addGreeting.apply("Alice"));
		System.out.println(addGreeting.apply("Bob"));
		
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		
		List<String> words = Arrays.asList("java", "streams", "lambda");
		words.forEach(printUpperCase);
		
		Supplier<Double> randomScore = () -> Math.random() * 100;
		
		System.out.println("Random Score-1: " + randomScore.get());
		System.out.println("Random Score-2: " + randomScore.get());
		System.out.println("Random Score-3: " + randomScore.get());
		
		

	}

}
