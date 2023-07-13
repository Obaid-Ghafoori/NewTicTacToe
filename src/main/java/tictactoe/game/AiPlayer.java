package src.main.java.tictactoe.game;

import java.util.Random;

public class AiPlayer extends Player {
    public AiPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void drawMark() {
        Random random;
        int row;
        int col;
        char[][] gameBoard;

        do {
            random = new Random();
            gameBoard = new char[3][3];
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!isValidDraw(gameBoard, row, col));
        TicTacToe.drawMark(row, col, symbol);
    }
}
