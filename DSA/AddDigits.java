package DSA;
//https://leetcode.com/problems/add-digits/description/
public class AddDigits {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {

        if (num == 0)
            return 0;

        while (num >= 10) {
            int q = num / 10;
            int r = num % 10;
            num = q + r;
        }
        return num;
    }
}
