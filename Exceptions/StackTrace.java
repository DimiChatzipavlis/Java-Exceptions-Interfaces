import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator, denominator;
        System.out.print("Enter int numerator: ");
        numerator = sc.nextInt();
        System.out.print("Enter int denominator: ");
        denominator = sc.nextInt();
        int result;
        result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
// Run this example with denominator as 0 to see the exception stack trace.
//Also, try entering a non-integer value to see how it handles input mismatch exceptions.