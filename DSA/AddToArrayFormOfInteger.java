package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> sol = new ArrayList<>();
        int n = num.length;
        int i = n - 1;
        while (i >= 0 || k>0) {
            if(i>=0){
                sol.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }else{
                sol.add(k%10);
                k = k/10;
            }
           i--; 
        }
        Collections.reverse(sol);
        return sol;
    }

}
