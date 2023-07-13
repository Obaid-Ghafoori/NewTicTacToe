package src.main.java.tictactoe.game;

public class TicTacToe {
    private char[][] board;

    public TicTacToe() {
        board = new char[3][3];
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
        System.out.println("\t \t \t \t \t \t-------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("\t \t \t \t \t \t| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("\t \t \t \t \t \t-------------");
        }
    }

    public void drawMark(int row, int col, char symbol) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = symbol;
        } else {
            System.out.println("invalid rang, please draw within rang 0-3");
        }

        //  Object draw = (row >= 0 && row < 4 && col >= 0 && col < 4) ? board[row][col] = symbol : System.out.println("invalid rang, please draw within rang 0-3");
    }

    public void declareWinner() {
        checkWinnerCol();
        checkWinnerRow();
        checkWinnerDiagonal();
    }

    public boolean checkWinnerCol() {
        for (int col = 0; col <= 2; col++) {
            if (board[0][col] != ' ' && board[0][col] == board[0][col] && board[0][col] == board[0][col]) {
                return true;
            }
        }
        return false;

    }

    public boolean checkWinnerRow() {
        for (int row = 0; row <= 2; row++) {
            if (board[row][0] != ' ' && board[row][0] == board[row][0] && board[row][0] == board[row][0]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinnerDiagonal() {

        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
}
