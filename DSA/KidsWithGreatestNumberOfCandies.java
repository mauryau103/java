package DSA;

import java.util.ArrayList;
import java.util.List;

/**
 * KidsWithGreatestNumberOfCandies
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 * 
 */
public class KidsWithGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies)); // [true,true,true,false,true]
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> booleans = new ArrayList<>();

        int max = candies[0];  
        for (int i = 0; i < candies.length; i++) {  
           if(candies[i] > max)  
               max = candies[i];  
        } 
        for(int i =0;i<candies.length;i++){
            if (candies[i]+extraCandies>=max) {
                booleans.add(true);
            }else
                booleans.add(false);
        }
        return booleans;

    }
}