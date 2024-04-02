package DSA;

import java.util.Hashtable;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aaa";
        String s = "aa aa aa aa";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        Hashtable<Character, String> ht = new Hashtable<>();
        String[] splittedArray = s.split(" ");

        if (pattern.length() != splittedArray.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (ht.get(pattern.charAt(i)) != null) {
                if (!ht.get(pattern.charAt(i)).equals(splittedArray[i]))
                    return false;
            } else if (ht.containsValue(splittedArray[i]) && !ht.containsKey(pattern.charAt(i))) {
                return false;
            } else {
                ht.put(pattern.charAt(i), splittedArray[i]);
            }
        }
        return true;
    }
}
