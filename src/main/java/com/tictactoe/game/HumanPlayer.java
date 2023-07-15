package com.tictactoe.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override

    public void makeSymbol() {

        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int col = 0;
        try{
        do {
            System.out.println("Please enter the position the row and col [e.g. 1 2]!");
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!isValidDraw(row, col));
    } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter a valid number.");
        scanner.nextLine(); // Clear the invalid input from the scanner
    }
        TicTacToe.drawMark(row, col, symbol);

    }
}
