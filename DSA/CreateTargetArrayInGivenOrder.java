package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString((createTargetArray(nums, index)))); // Output: [0,4,1,3,2]
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
