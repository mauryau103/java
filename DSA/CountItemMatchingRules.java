package DSA;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/count-items-matching-a-rule/description/

public class CountItemMatchingRules {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type") ) {
            for (List<String> item : items) {
                if (item.size() > 1 && ruleValue.equals(item.get(0))) {
                    count++;
                }
            }
        }
        if (ruleKey.equals("color")) {
            for (List<String> item : items) {
                if (item.size() > 1 && ruleValue.equals(item.get(1))) {
                    count++;
                }
            }
        }
        if (ruleKey.equals("name")) {
            for (List<String> item : items) {
                if (item.size() > 1 && ruleValue.equals(item.get(2))) {
                    count++;
                }
            }
        }

        return count;
    }
}
