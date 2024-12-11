package EasyProblemsSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge_03 {

    /**
     * This method generates a list of strings based on the FizzBuzz rules:
     * - If a number is divisible by 3, it adds "Fizz" to the list.
     * - If a number is divisible by 5, it adds "Buzz" to the list.
     * - If a number is divisible by both 3 and 5, it adds "FizzBuzz" to the list.
     * - Otherwise, it adds the number itself (as a string) to the list.
     *
     * @param n the upper limit of the range (inclusive) up to which FizzBuzz is calculated.
     * @return a list of strings representing the FizzBuzz sequence.
     */
    public static List<String> fizzBuzz(int n) {

        // Initialize an ArrayList to store the result.
        List<String> result = new ArrayList<>(n);

        // Loop through numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            // Check divisibility by 3 and 5.
            boolean dividedBy3 = i % 3 == 0;
            boolean dividedBy5 = i % 5 == 0;

            // If the number is divisible by both 3 and 5, add "FizzBuzz".
            if (dividedBy3 && dividedBy5) {
                result.add("FizzBuzz");
            }
            // If the number is divisible by 3 only, add "Fizz".
            else if (dividedBy3) {
                result.add("Fizz");
            }
            // If the number is divisible by 5 only, add "Buzz".
            else if (dividedBy5) {
                result.add("Buzz");
            }
            // If the number is divisible by neither 3 nor 5, add the number itself as a string.
            else {
                result.add(String.valueOf(i));
            }
        }

        // Return the list of results.
        return result;
    }

    /**
     * Main method where the program starts execution.
     * It takes user input for the number n, then calls the fizzBuzz method
     * and prints the result to the console.
     *
     * @param args command line arguments (not used in this case).
     */
    public static void main(String[] args) {

        // Create a scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number n.
        System.out.println("Enter the number:");

        // Read the integer input from the user.
        int n = scanner.nextInt();


        // Print the resulting FizzBuzz list.
        System.out.println(fizzBuzz(n));

        // Close the scanner to avoid resource leaks.
        scanner.close();
    }
}
