package EasyProblemsSolutions;

public class Challenge_04 {

    /**
     * This method reduces the given number to zero by applying the following rules:
     * - If the number is even, divide it by 2.
     * - If the number is odd, subtract 1 from it.
     * The method prints the number of steps taken to reduce the number to zero.
     *
     * @param num the number to be reduced to zero
     */
    public static void reduceNumberToZero(int num) {
        // Variable to track the number of steps taken to reduce the number to zero.
        int numberOfStep = 0;

        // Keep reducing the number until it becomes zero.
        while (num > 0) {
            // If the number is even, divide it by 2.
            if (num % 2 == 0) {
                num /= 2;
            } else {
                // If the number is odd, subtract 1 from it.
                num--;
            }

            // Increment the step count after each operation.
            numberOfStep++;
        }

        // Print the total number of steps taken.
        System.out.println(numberOfStep);
    }

    /**
     * Main method where the program starts execution.
     * It calls the reduceNumberToZero method with a sample input.
     *
     * @param args command line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Example test case: reducing 123 to zero.
        reduceNumberToZero(123);
    }
}
