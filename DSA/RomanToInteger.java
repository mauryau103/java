package DSA;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/

class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("Z"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] romanChar = s.toCharArray();
        int result = 0;
        int currValue = 0;
        int nextValue = 0;

        for (int i = 0; i < romanChar.length; i++) {

            if (map.containsKey(romanChar[i])) {

                currValue = map.get(romanChar[i]);
                if (i + 1 != romanChar.length) {
                    nextValue = map.get(romanChar[i + 1]);
                }
                if (currValue < nextValue) {
                    result = result - map.get(romanChar[i]);
                } else
                    result = result + map.get(romanChar[i]);
            }
        }
        return result;
    }
}