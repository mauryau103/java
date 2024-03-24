package DSA;

/**
 * LengthOfLastWord
 * https://leetcode.com/problems/length-of-last-word/description/
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World     ";
        // "   fly me   to   the moon  "  -->4
        //"luffy is still joyboy"  -->6
        //"Hello World"  -->5
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] stringArray = s.split(" ");
        return stringArray[stringArray.length-1].length();
    }
}