package DSA;

import java.util.Arrays;

/**
 * NUniqueIntegerSumUpToZero
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
 * Given an integer n, return any array containing n unique integers such that
 * they add up to 0.
 * 
 * 
 */
public class NUniqueIntegerSumUpToZero {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n % 2 == 0) {
            int j = 1;
            for (int i = 0; i < n;) {
                arr[i] = j;
                arr[i+1]=-j;
                j++;
                i=i+2;
            }
        } else {
            int j = 1;
           for (int i = 1; i < n;) {
                arr[i] = i;
                arr[i] = j;
                arr[i+1]=-j;
                j++;
                i=i+2;
            }
        }
        return arr;
    }
}