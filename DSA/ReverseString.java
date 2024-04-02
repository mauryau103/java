package DSA;

//https://leetcode.com/problems/reverse-string/description/
//in place algorithm
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(Arrays.toString(reverseString(s)));
    }

    public static char[] reverseString(char[] s) {
        for (int i = 0; i <= Math.ceil((s.length - 2f) / 2); i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }

    public void reverseString2(char[] ch) {
        int a = 0, b = ch.length - 1;
        while (a <= b) {
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;
            a++;
            b--;
        }
    }
}
