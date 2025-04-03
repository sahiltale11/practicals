import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        
        // ArithmeticException Example
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator; // May throw ArithmeticException if denominator is zero
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Please provide a non-zero denominator.");
        }

        // ArrayIndexOutOfBoundsException Example
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.print("Enter an index to access in the array: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            
            // Attempting to access an invalid index
            System.out.println("Element at index " + index + ": " + numbers[index]); // May throw ArrayIndexOutOfBoundsException
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please provide a valid index.");
        }

        // NullPointerException Example
        try {
            String str = null;
            System.out.println("Length of the string: " + str.length()); // May throw NullPointerException
            
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operation on a null object.");
        }

    }
}
