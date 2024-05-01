package DSA;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index >= 1) {
            StringBuilder sb = new StringBuilder(word.substring(0, index + 1)).reverse();
            if (index + 1 < word.length()) {
                sb.append(word.substring(index + 1));
            }
            return sb.toString();
        } else return word;
    }
}
