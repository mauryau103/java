package DSA;

//https://leetcode.com/problems/find-the-difference/
public class FindTheDiffrence {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray())
            result ^= c;
        
        for (char c : t.toCharArray())
            result ^= c;
        
        return (char) result;
    }
}
