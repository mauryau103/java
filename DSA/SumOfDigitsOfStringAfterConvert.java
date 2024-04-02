package DSA;

import java.util.HashMap;
import java.util.Map;

/**
 * SumOfDigitsOfStringAfterConvert
 * https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/
 */
public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s = "iaozzbyqzwbpurzze";
        int k = 2;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int ascii = 97;
        for (int i = 1; i <= 26; i++)
            hashMap.put((char) ascii++, i);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            sb.append(hashMap.get(s.charAt(i)));

        int sum = 0;
        for (int i = 0; i < sb.length(); i++)
            sum = sum + sb.charAt(i) - '0';
        k--;
        System.out.println(sum);
        while (k > 0) {
            int q = sum / 10;
            int r = sum % 10;
            while (q >= 10) {
                int i = q / 10;
                int j = q % 10;
                q = (int) (Math.pow(i, 2) + Math.pow(j, 2));
            }
            sum = q + r;
            k--;
        }

        return sum;
    }

    public int getLucky2(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        s = sb.toString();
        while (k-- > 0) {
            int t = 0;
            for (char c : s.toCharArray()) {
                t += c - '0';
            }
            s = String.valueOf(t);
        }
        return Integer.parseInt(s);
    }
}