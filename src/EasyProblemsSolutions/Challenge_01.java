package EasyProblemsSolutions;

import java.util.Arrays;

public class Challenge_01 {

    /**
     * Running Sum of 1d Array
     * Given an array of numbers, this function returns a new array where each element
     * at index `i` is the sum of all the elements in the input array from index `0` to `i`.
     * Example:
     * Input: nums = [1,2,3,4]
     * Output: [1, 3, 6, 10]
     * Explanation:
     * The running sum is computed as follows:
     * [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public static  int[] runningSum(int[] nums) {

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];

        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
