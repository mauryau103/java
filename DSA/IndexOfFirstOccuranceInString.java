package DSA;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class IndexOfFirstOccuranceInString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int indexOf = haystack.indexOf(needle);
        if (indexOf != -1)
            return indexOf;
        else
            return -1;
    }
}
