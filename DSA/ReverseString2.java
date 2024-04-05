package DSA;

/**
 * ReverseString2
 * https://leetcode.com/problems/reverse-string-ii/description/
 */
public class ReverseString2 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        String subString = s.substring(0, k);
        System.out.println(subString);
        return "";
    }
}