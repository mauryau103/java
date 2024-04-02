package DSA;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 >= 1) {
                count++;
            }
            n = n / 2;

        }
        return count;
    }
}
