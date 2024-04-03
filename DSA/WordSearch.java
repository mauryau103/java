package DSA;

/**
 * WordSearch
 * https://leetcode.com/problems/word-search/description/?envType=daily-question&envId=2024-04-03
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int totalRows = board.length;
        int totalcols = board[0].length;
        for (int currRow = 0; currRow < totalRows; currRow++) {
            for (int currCol = 0; currCol < totalcols; currCol++) {
                if (board[currRow][currCol] == word.charAt(0)) {
                    if (isWordPresent(currRow, currCol, 0, board, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isWordPresent(int currRow, int currCol, int currIndex, char[][] board, String word) {
        // got the Word
        if (currIndex == word.length()) {
            return true;
        }

        // invalid cell
        if (currRow < 0 || currCol < 0 || currRow >= board.length || currCol >= board[0].length
                || board[currRow][currCol] != word.charAt(currIndex)) {
            return false;
        }

        // mark it as visited
        board[currRow][currCol] = '.';

        // explore all the possibility:- L,R,U,D

        boolean ans = isWordPresent(currRow, currCol - 1, currIndex + 1, board, word) ||
                isWordPresent(currRow, currCol + 1, currIndex + 1, board, word) ||
                isWordPresent(currRow - 1, currCol, currIndex + 1, board, word) ||
                isWordPresent(currRow + 1, currCol, currIndex + 1, board, word);

        // undo the changes
        board[currRow][currCol] = word.charAt(currIndex);
        return ans;
    }

}