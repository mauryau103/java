package DSA;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && Math.abs(s.charAt(i) - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        int n = stack.size();
        StringBuilder ans = new StringBuilder("_".repeat(n));
        int i = n - 1;
        while (!stack.empty()) {
            char currentChar = stack.peek();
            ans.setCharAt(i, currentChar); 
            stack.pop();
            i--;
        }
        return ans.toString();
    }
}
