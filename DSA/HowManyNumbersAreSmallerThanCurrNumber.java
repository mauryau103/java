package DSA;

/**
 * HowManyNumbersAreSmallerThanCurrNumber
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * 
 */
public class HowManyNumbersAreSmallerThanCurrNumber {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                  
            }
            res[i]= count;
        }
        return nums;
    }
}