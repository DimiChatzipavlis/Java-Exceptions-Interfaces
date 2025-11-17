import java.util.Scanner;

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
