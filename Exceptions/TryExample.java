import java.util.Scanner;
// This example demonstrates the use of try-catch-finally blocks in Java. The program prompts the user to enter a number and attempts to read it as an integer. If the input is not a valid integer, an InputMismatchException is caught, and an error message is displayed. The finally block ensures that the scanner is closed regardless of whether an exception occurred. Compile with `javac TryExample.java` and run with `java TryExample`.
public class TryExample {
    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            System.out.print("Enter a number: ");

            int value = sc.nextInt();  // may throw InputMismatchException
            System.out.println("You typed: " + value);

        } catch (java.util.InputMismatchException e) { // we can import java.util.* to avoid full package name --> } catch (InputMismatchException e) { ...
            System.out.println("That was not a number!");
        } finally {
            System.out.println("Closing scanner.");
            if (sc != null) sc.close();
        }

        System.out.println("Program finished.");
    }
}
