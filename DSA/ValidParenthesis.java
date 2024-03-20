package DSA;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (stk.empty()){
                stk.push(chars[i]);
                continue;
            }
            
            char par = stk.peek();
            if (par == chars[i] || par == chars[i] || par == chars[i]) {
                return false;
            } else {
                stk.push(chars[i]);
            }
        }
        return true;
    }
}
