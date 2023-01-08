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

}
