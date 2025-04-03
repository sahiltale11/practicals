import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {

    public static double divideNumbers(double num1, double num2) throws ArithmeticException, NegativeNumberException {
        if (num1 < 0 || num2 < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed for division.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        try {
            double result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e)
         {
            System.out.println("Error: Division by zero is not allowed.");
        }
         catch (NegativeNumberException e) 
         {
            System.out.println("Error: " + e.getMessage());
        } finally 
        {
            scanner.close();
        }
    }
}
