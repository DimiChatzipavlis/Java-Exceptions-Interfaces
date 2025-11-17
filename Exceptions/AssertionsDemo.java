public class AssertionsDemo {

    public static void main(String[] args) {
        //double[] values = {2.0, 4.0, 6.0};
        //double avg = average(values);
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
