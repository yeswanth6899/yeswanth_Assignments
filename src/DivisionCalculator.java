public class DivisionCalculator {

    double divide(int a, int b) {
        double result = 0.0;

        try {
            int temp = a / b;
            result = (double) temp;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("--- Operation complete ---");
        }

        return result;
    }

    public static void main(String[] args) {

        DivisionCalculator calc = new DivisionCalculator();

        calc.divide(10, 2);

        double result2 = calc.divide(5, 0);
        System.out.println("Result: " + result2);

        try {
            int number = Integer.parseInt("abc");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}