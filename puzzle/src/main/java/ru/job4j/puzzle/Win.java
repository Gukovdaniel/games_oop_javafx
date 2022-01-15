package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board[4].length; i++) {
            if (board[4][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board[4].length; i++) {
            if (board[i][4] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(4, i) || monoVertical(4, i))) {
                result = true;
                break;

            }
        }
        return result;
    }
}
