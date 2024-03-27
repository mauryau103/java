package DSA;

/**
 * SentenceIsPangram
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 * pangram means the sentence contains every alphabet of english
 * Iterate over the string and mark each character as found (using a boolean
 * array, bitmask, or any other similar way).
 * Check if the number of found characters equals the alphabet length.
 */
public class SentenceIsPangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabets.length(); i++) {
            if (sentence.contains(String.valueOf(alphabets.charAt(i))))
                continue;
            else
                return false;
        }
        return true;
    }

    public boolean checkIfPangram2(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}