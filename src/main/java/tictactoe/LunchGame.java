package src.main.java.tictactoe;

import src.main.java.tictactoe.game.TicTacToe;

public class LunchGame {
    public static void main(String[] args) {
     System.out.println("####################### Game started ...! ###################");

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.generateBoard();
        ticTacToe.displayBoard();
        System.out.println();
        System.out.println();
        ticTacToe.drawMark(0,0,'X');
        ticTacToe.drawMark(0,1,'O');
        ticTacToe.drawMark(0,2,'X');
        ticTacToe.drawMark(2,2,'X');
        ticTacToe.drawMark(2,0,'X');
        ticTacToe.drawMark(1,1,'X');


        ticTacToe.displayBoard();
        ticTacToe.declareWinner();
        System.out.println( ticTacToe.checkWinnerDiagonal());

    }
}
