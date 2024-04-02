package DSA;

//https://leetcode.com/problems/multiply-strings/description/
public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "999";
        String num2 = "999";
        System.out.println(multiply2(num1, num2));
    }

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        if (num2.length() > num1.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int index = 0;

        for (int i = num2.length() - 1; i >= 0; i--) {

            int mulKey = num2.charAt(i) - '0';
            StringBuilder sb2 = new StringBuilder();

            for (int j = num1.length() - 1; j >= 0; j--) {

                int sum = carry;
                int mulValue = sum + mulKey * (num1.charAt(j) - '0');

                if (mulValue >= 10) {
                    sb2.append(String.valueOf(mulValue).charAt(1));
                    carry = String.valueOf(mulValue).charAt(0) - '0';
                } else {
                    sb2.append(mulValue);
                    carry = 0;
                }
            }
            if (carry != 0) {
                sb2.append(carry);
                carry = 0;
            }
            if (index > 0) {
                String sb3 = sb2.reverse() + "0".repeat(index);
                sb = new StringBuilder(add(sb, sb3, index));
            } else {
                sb = sb2.reverse();
            }
            index++;
        }
        return sb.toString();
    }

    public static String add(StringBuilder sb, String sb3, int index) {
        System.out.println("sb :-" + sb);
        System.out.println("sb3 :-" + sb3);
        StringBuilder str = new StringBuilder();
        int k = sb.length() - 1;
        int l = sb3.length() - 1;
        int carry2 = 0;
        while (k >= 0 || l >= 0) {
            int sum = carry2;
            if (k >= 0) {
                sum = sum + sb.charAt(k) - '0';
            }
            if (l >= 0) {
                sum = sum + sb3.charAt(l) - '0';
            }
            if (sum >= 10) {
                str.append(String.valueOf(sum).charAt(1));
                carry2 = 1;
            } else {
                str.append(sum);
                carry2 = 0;
            }
            k--;
            l--;
        }
        if (carry2 != 0) {
            str.append(carry2);
        }
        return str.reverse().toString();
    }

    public static String multiply2(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] vals = new int[m + n];

        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = vals[i + j + 1] + mul;
                vals[i + j] += sum / 10;
                vals[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int val : vals) {
            if (sb.length() != 0 || val != 0) {
                sb.append(val);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();

    }

}
