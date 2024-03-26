package DSA;

import java.util.Arrays;

/**
 * ShuffleTheArray
 * https://leetcode.com/problems/shuffle-the-array/description/
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
 * [2,3,5,4,1,7].
 */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length;) {
            ans[i] = nums[i];
            i=i+2;
        }
        return ans;
    }
}