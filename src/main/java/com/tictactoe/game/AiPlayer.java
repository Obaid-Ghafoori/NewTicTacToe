package com.tictactoe.game;

import java.util.Random;
import java.util.Scanner;

public class AiPlayer extends Player {
    public AiPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void makeSymbol() {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;

        do {
            Random random = new Random();
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!isValidDraw(row, col));
        TicTacToe.drawMark(row, col, symbol);
    }
}
