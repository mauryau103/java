package DSA;

import java.util.Arrays;

/**
 * ShuffleTheArray
 * https://leetcode.com/problems/shuffle-the-array/description/
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
 * [2,3,5,4,1,7].
 * Use two pointers to create the new array of 2n elements.
 * The first starting at the beginning and the other starting at (n+1)th
 * position.
 * Alternate between them and create the new array.
 */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ans[count] = nums[i];
            ans[count + 1] = nums[i + n];
            count += 2;
        }
        return ans;
    }
}