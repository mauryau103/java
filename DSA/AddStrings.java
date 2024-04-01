package DSA;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "129";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + num1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum = sum + num2.charAt(j) - '0';
            }
            if (sum >= 10) {
                sb.append(String.valueOf(sum).charAt(1));
                carry = 1;
            } else {
                sb.append(sum);
                carry = 0;
            }
            i--;
            j--;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
