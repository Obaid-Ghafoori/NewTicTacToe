package src.main.java.tictactoe.game;

public abstract class Player {
    protected String name;
    protected char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public abstract void makeSymbol();

    public boolean isValidDraw( int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }
            System.out.println("this position is already taken, please try other spot!");
        }
        return false;
    }

    public String getName() {
        return this.name;
    }
}
