package DSA;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        if (s.length() <= 1)
            return false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
                return false;

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else {
                if (stk.isEmpty())
                    return false;

                char top = stk.peek();

                if (top == '(' && s.charAt(i) == ')') {
                    stk.pop();
                } else if (top == '{' && s.charAt(i) == '}') {
                    stk.pop();
                } else if (top == '[' && s.charAt(i) == ']') {
                    stk.pop();
                } else
                    return false;
            }
        }
        if (stk.empty()) {
            return true;
        } else
            return false;
    }
}
