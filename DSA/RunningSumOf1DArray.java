package DSA;

import java.util.Arrays;

/* https://leetcode.com/problems/running-sum-of-1d-array/description/
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
