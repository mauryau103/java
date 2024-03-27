package DSA;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-highest-altitude/description/
public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude2(gain));
    }

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int[] res = new int[gain.length + 1];
        for (int i = 0; i <= gain.length; i++) {
            if (i == 0) {
                res[0] = 0;
            } else {
                sum = sum + (gain[i-1]);
                res[i] = sum;
            }
        }
        Arrays.sort(res);
        return res[res.length-1];
    }

    public static int largestAltitude2(int[] gain){
        int max=0;
        int res =0;
        for (int i=0;i<gain.length;i++){
            max = Math.max(max, res+gain[i]);
            res = res+gain[i];
        }
        return max;
    }
}
