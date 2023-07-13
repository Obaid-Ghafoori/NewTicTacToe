package src.main.java.tictactoe;

import src.main.java.tictactoe.game.AiPlayer;
import src.main.java.tictactoe.game.HumanPlayer;
import src.main.java.tictactoe.game.Player;
import src.main.java.tictactoe.game.TicTacToe;

public class LunchGame {
    public static void main(String[] args) {
        System.out.println("####################### Game started ...! ###################");

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.generateBoard();
        ticTacToe.displayBoard();
        System.out.println();
        System.out.println();


        HumanPlayer humanPlayer = new HumanPlayer("Human-player", 'X');
        AiPlayer aiPlayer = new AiPlayer("Ai-player ", 'O');

        Player currentPlayer;
        currentPlayer = humanPlayer;

        while (true) {
            System.out.println(currentPlayer.getName().toUpperCase() + " turn!");
            currentPlayer.makeSymbol();
            ticTacToe.displayBoard();


            if (ticTacToe.isGameDraw()) {
                System.out.println("The game is a tie");
                ticTacToe.printEndOfGamePattern();
                break;
            } else if (ticTacToe.checkWinnerCol() || ticTacToe.checkWinnerRow() || ticTacToe.checkWinnerDiagonal()) {
                System.out.println(currentPlayer.getName() + " won the game!");
                ticTacToe.printEndOfGamePattern();
                break;
            } else {
                currentPlayer = (currentPlayer == humanPlayer) ? aiPlayer : humanPlayer;
            }

        }



    }
}
