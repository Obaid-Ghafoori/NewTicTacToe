package src.main.java.tictactoe.game;

public abstract class Player {
    protected String name;
    protected char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public abstract void drawMark();

    public boolean isValidDraw(char[][] gameBaod, int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= col) {
            if (gameBaod[row][col] == ' ') {
                return true;
            }
        }
        return false;
    }
}
