import java.util.Scanner;
// This example demonstrates how Java provides a stack trace when an exception occurs. Based on its structure, you can trace back the sequence of method calls that led to the exception. You can run this code and intentionally cause an exception (like dividing by zero) to see the stack trace in action. Compile with `javac StackTrace.java` and run with `java StackTrace`.
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