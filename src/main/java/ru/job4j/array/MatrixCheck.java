package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board[row].length - 1; column++) {
            if (board[row][column] == 'X' && board[row][column + 1] != 'X'
            || board[row][column] == ' ' && board[row][column + 1] != ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length - 1; row++) {
            if (board[row][column] == 'X' && board[row + 1][column] != 'X'
            || board[row][column] == ' ' && board[row + 1][column] != ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

}
