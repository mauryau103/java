package DSA;

/**
 * MaximumPopulationYear
 */
public class MaximumPopulationYear {

    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } }; // 1993
        // logs = {{1950,1961},{1960,1971},{1970,1981}}
        System.out.println(maximumPopulation2(logs));
    }

    public static int maximumPopulation(int[][] logs) {

        int[] arr = new int[101]; // by looking at constraint -> and contraint says both year are include so size
                                  // will be 101

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int maxYear = 1950;
        int maxValue = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

    public static int maximumPopulation2(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }
        int maxValue = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

}