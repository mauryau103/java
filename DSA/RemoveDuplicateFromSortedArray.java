package DSA;

/**
 * RemoveDuplicateFromSortedArray
 */

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

/*
 * 1.In this problem, the key point to focus on is the input array being sorted.
 * As far as duplicate elements are concerned, what is their positioning in the
 * array when
 * the given array is sorted? Look at the image below for the answer. If we know
 * the position
 * of one of the elements, do we also know the positioning of all the duplicate
 * elements?
 * 
 * 2.We need to modify the array in-place and the size of the final array would
 * potentially
 * be smaller than the size of the input array. So, we ought to use a
 * two-pointer approach here.
 * One, that would keep track of the current element in the original array and
 * another one for
 * just the unique elements.
 * 
 * 3.Essentially, once an element is encountered, you simply need to bypass its
 * duplicates and move on to the next unique element.
 */
public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int[] uniqueArray = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            int curr = nums[i];
            int next = nums[i+1];
            if (curr != next) {
                uniqueArray[0] = curr;
            }
        }
        System.out.println(uniqueArray);
        return uniqueArray.length;
    }
}