package DSA;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/

public class LongetCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "", "" };
        // "dog","racecar","car" //""
        // "flower", "flow", "flight" //fl
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);
        char[] firstString = strs[0].toCharArray();
        char[] lastString = strs[strs.length - 1].toCharArray();

        String resuString = "";

        int i = 0;
        while (i < firstString.length) {
            if (firstString[i] == lastString[i]) {
                resuString = resuString + firstString[i];
            } else
                break;
         i++;
        }
        return resuString;
    }

    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
