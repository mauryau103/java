package DSA;

import java.util.Hashtable;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> ht = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            if (ht.get(s.charAt(i)) != null) {
                if (ht.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else if (ht.containsValue(t.charAt(i)) && !ht.containsKey(s.charAt(i))) {
                return false;
            } else {
                ht.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
