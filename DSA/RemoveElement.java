package DSA;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = { 2};
        int val = 3;

        System.out.println(removeElement(nums, val)); // output-> 2
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
            System.out.println(Arrays.toString(nums));
        }
        return index;
    }
}
