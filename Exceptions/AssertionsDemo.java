public class AssertionsDemo {
// This example demonstrates the use of assertions in Java to enforce preconditions and postconditions in a method. The `average` method calculates the average of an array of doubles, with assertions checking that the input array is not null and not empty (preconditions), and that the result is non-negative (postcondition). To run this code with assertions enabled, compile with `javac AssertionsDemo.java` and run with `java -ea AssertionsDemo`.

    public static void main(String[] args) {
        //double[] values = {2.0, 4.0, 6.0}; 
        //double avg = average(values); // valid case
        
        // Uncomment to see each precondition violation separately:

        // double[] values = null; //1. Pre1
        //double avg = average(values);


        //average(new double[]{}); //2. Pre2

        // Uncomment to see postcondition violation:

        double[] valuesminus = {-200.0, 4.0, 6.0}; //3. Post
        double avg = average(valuesminus);

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
    
        assert result >= 0 : "Postcondition failed: result is negative";

        return result;
    }
}
