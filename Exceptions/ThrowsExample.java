import java.util.Scanner;
//This example demonstrates how to declare and use a custom checked exception in Java. The `InvalidAgeException` is thrown when the user inputs an invalid age (negative or non-integer). The `readAge` method declares that it throws this exception, and the `main` method handles it appropriately. Compile with `javac ThrowsExample.java` and run with `java ThrowsExample`.
public class ThrowsExample {

    public static void main(String[] args) {
        try {
            int age = readAge();   // must handle InvalidAgeException
            System.out.println("Age accepted: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause());
            }
        }

        System.out.println("Program finished.");
    }

    public static int readAge() throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");

        try {
            int age = sc.nextInt();    // may throw InputMismatchException

            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative.");
            }

            return age;

        } catch (java.util.InputMismatchException e) {
            // Wrap the original exception as the cause
            throw new InvalidAgeException("Input must be a whole number.", e);
        }
    }
}
