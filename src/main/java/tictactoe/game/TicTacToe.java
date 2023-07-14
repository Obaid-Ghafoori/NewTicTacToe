package src.main.java.tictactoe.game;

public class TicTacToe {
    static char[][] board;
    String space;

    public TicTacToe() {
        board = new char[3][3];
        space = "\t \t \t \t \t \t";
        generateBoard();
    }

    public void generateBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println(space + "-------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print(space + "| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println(space + "-------------");
        }
    }

    public static void drawMark(int row, int col, char symbol) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = symbol;
        } else {
            System.out.println("invalid rang, please draw within rang 0-3");
        }
    }

    public boolean checkWinnerCol() {
        for (int col = 0; col <= 2; col++) {
            if (board[0][col] != ' ' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinnerRow() {
        for (int row = 0; row <= 2; row++) {
            if (board[row][0] != ' ' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinnerDiagonal() {
        if (board[1][1] != ' ' && ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0]))) {
            return true;
        }
        return false;
    }
    public boolean isGameDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    // There is an empty position, game is not a draw
                    return false;
                }
            }
        }
        // All positions are filled, game is a draw
        return true;
    }

    public void printEndOfGamePattern() {
        System.out.println(space +"***************************");
        System.out.println(space +"*       GAME OVER!        *");
        System.out.println(space +"***************************");
    }

}
