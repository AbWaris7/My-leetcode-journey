package EasyProblemsSolutions;

public class Challenge_02 {
/**
 * Given a 2D array `accounts` where each inner array represents a customer's bank account balances,
 * this function returns the wealth of the richest customer. A customer's wealth is the sum of the balances
 * in all their bank accounts.
 * The richest customer is the one with the maximum wealth.
 *
 * @param accounts A 2D integer array where each inner array represents a customer's bank account balances.
 * @return The maximum wealth found among all customers. This is the sum of the largest account balances
 *         across all bank accounts for the richest customer.
 * Example:
 * -----------
 * Input:
 * int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
 * Output:
 * 6
 *
**/

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for(int[] customer: accounts) {
            int currentCustomerWealthSoFar = 0;
            for(int bank: customer) {
                currentCustomerWealthSoFar += bank;
            }
            maxWealth = Math.max(maxWealth, currentCustomerWealthSoFar);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int richCustomer[][] = {{1,2,20},{44,33,22},{98,65,22}};
        System.out.println(maximumWealth(richCustomer));
    }
}
