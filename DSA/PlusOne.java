package DSA;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/description/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 9 };
        // digits = {4,3,2,1}; --> [4,3,2,2]
        // digits = { 1, 2, 3 }; --> [1,2,4]
        // digits = {9}; --> [1,0]
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // when value is 9
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}
