import java.util.Scanner;

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
