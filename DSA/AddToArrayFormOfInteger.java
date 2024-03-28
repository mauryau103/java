package DSA;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder myBuilder = new StringBuilder();
        List<Integer> lIntegers = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            myBuilder.append(num[i]);
        }
        Integer myNum = Integer.parseInt(myBuilder.toString());
        String ans = String.valueOf(myNum + k);
        for (int i = 0; i < ans.length(); i++) {
            lIntegers.add(Integer.parseInt(String.valueOf(ans.charAt(i))));
        }
        return lIntegers;
    }
}
