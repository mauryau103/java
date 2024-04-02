public class MergeStringAlternately {
    // https://leetcode.com/problems/merge-strings-alternately/description/
    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        String merged = "";
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        while (m > 0 || n > 0) {
            if (m > 0) {
                merged = merged + word1.charAt(i);
            }
            if (n > 0) {
                merged = merged + word2.charAt(i);
            }
            i++;
            m--;
            n--;
        }
        return merged;
    }

    public String mergeAlternately2(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int j = 0;
        while (j < word1.length() || j < word2.length()) {
            if (j < word1.length()) {
                res.append(word1.charAt(j));
            }
            if (j < word2.length()) {
                res.append(word2.charAt(j));
            }
            j++;
        }
        return res.toString();
    }
}
