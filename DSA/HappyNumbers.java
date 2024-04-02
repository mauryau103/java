package DSA;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/description/

/*
 * 1. there are two approach to do this problem
 * a. using set 
 * b. using floyd's cycle detection algorithm
 */
public class HappyNumbers {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        while (true) {
            if (n == 1) {
                return true;
            }
            n = sumOfSquares(n);

            if (hs.contains(n))
                return false;
            hs.add(n);
        }
    }

    public static boolean isHappy2(int n) {
        int slow = n;
        int fast = n;

        slow = sumOfSquares(slow);
        fast = sumOfSquares(fast);
        fast = sumOfSquares(fast);

        while (slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(fast);
            fast = sumOfSquares(fast);

            if (fast == 1) {
                return true;
            }
        }

        return slow == 1;
    }

    public static int sumOfSquares(int n) {
        int s = 0;
        while (n > 0) {
            int x = n % 10;
            s += x * x;
            n /= 10;
        }
        return s;
    }
}
