package com.tictactoe.game;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override

    public void makeSymbol() {
        Scanner scanner = new Scanner(System.in);
        int row = 0, col = 0;

        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.println("Please enter the position the row and col [e.g. 1 2]!");

            try {
                String input = scanner.nextLine();
                String[] tokens = input.trim().split("\\s+");

                row = Integer.parseInt(tokens[0]);
                col = Integer.parseInt(tokens[1]);

                isValidInput = isValidDraw(row, col);
            } catch (InputMismatchException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input! Please enter valid numbers.");
            }
        }

        // Now row and col are valid, you can use them for further processing.
        System.out.println("You choose for Row: " + row + ", Col: " + col);
        TicTacToe.drawMark(row, col, symbol);
    }
}
