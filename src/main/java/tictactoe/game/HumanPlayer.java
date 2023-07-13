package src.main.java.tictactoe.game;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void drawMark() {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        char[][] gameBoard = new char[3][3];

        do {
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!isValidDraw(gameBoard, row, col));
        TicTacToe.drawMark(row, col, symbol);

    }
}
