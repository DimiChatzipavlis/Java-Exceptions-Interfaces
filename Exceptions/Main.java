import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String line = sc.nextLine();

        try {
            int n = Integer.parseInt(line.trim());
            // business rule: must be positive
            if (n <= 0) {
                throw new MyException("Number must be positive, but was: " + n);
            }
            System.out.println("You entered a valid positive integer: " + n);
        } catch (MyException e) {
            // custom checked exception handling
            System.err.println("Custom exception caught: " + e.getMessage());
            // print stack trace for diagnostic (in real apps, consider logging instead)
            e.printStackTrace(System.err);
        } catch (NumberFormatException e) {
            // invalid integer format
            System.err.println("Invalid input: not an integer (" + e.getMessage() + ")");
        } finally {
            sc.close();
            System.out.println("Program finished (finally block executed).");
        }
    }
}
