public class AssertionsDemo {
// This example demonstrates the use of assertions in Java to enforce preconditions and postconditions in a method. The `average` method calculates the average of an array of doubles, with assertions checking that the input array is not null and not empty (preconditions), and that the result is non-negative (postcondition). To run this code with assertions enabled, compile with `javac AssertionsDemo.java` and run with `java -ea AssertionsDemo`.

    public static void main(String[] args) {
        // Remember: assertions are DISABLED by default. Run with `java -ea AssertionsDemo`,
        // otherwise every case below runs silently (e.g. the postcondition case prints -63.33).

        double[] values = {2.0, 4.0, 6.0}; // valid case: prints Average: 4.0
        double avg = average(values);

        // Comment out the valid case above and uncomment ONE case below at a time:

        // 1. Pre1 (null array):
        // double[] values = null;
        // double avg = average(values);

        // 2. Pre2 (empty array):
        // double avg = average(new double[]{});

        // 3. Post (negative average):
        // double[] values = {-200.0, 4.0, 6.0};
        // double avg = average(values);

        System.out.println("Average: " + avg);

    }

    // This method has preconditions and postconditions
    public static double average(double[] nums) {

        // ---------- Preconditions ----------
        assert nums != null : "Precondition: array must not be null";
        assert nums.length > 0 : "Precondition: array must not be empty";

        // ---------- Body of the method ----------
        double sum = 0;
        for (double n : nums) sum += n;
        double result = sum / nums.length;

        // ---------- Postconditions ----------
        // This demo's contract promises a non-negative average (as for grades or prices),
        // so a negative input makes the method break its promise and the assertion fires.
        assert result >= 0 : "Postcondition failed: result is negative";

        return result;
    }
}
