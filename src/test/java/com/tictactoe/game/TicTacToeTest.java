package com.tictactoe.game;

import com.tictactoe.game.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void testGenerateBoard_BoardIsEmpty() {
        // Act
        ticTacToe.generateBoard();

        // Assert
        char[][] expectedBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        assertThat(ticTacToe.board).isEqualTo(expectedBoard);
    }

    @Test
    public void testDrawMarkValidPositionMarkDrawn() {
        // Arrange
        int row = 1;
        int col = 2;
        char symbol = 'X';

        // Act
        ticTacToe.drawMark(row, col, symbol);

        // Assert
        assertThat(ticTacToe.board[row][col]).isEqualTo(symbol);
    }

    @Test
    public void testDrawMarkInvalidPositionNoMarkDrawn() {
        // Arrange
        int row = 3;
        int col = 1;
        char symbol = 'O';

        // Create a mock of System.out to capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        ticTacToe.drawMark(row, col, symbol);

        // Assert
        assertThat(outputStream.toString()).contains("invalid rang");
    }

    @Test
    public void testCheckWinnerColThreeMarksInColumnReturnsTrue() {
        // Arrange
        ticTacToe.board = new char[][]{
                {' ', 'O', ' '},
                {' ', 'O', ' '},
                {' ', 'O', ' '}
        };

        // Act
        boolean result = ticTacToe.checkWinnerCol();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckWinnerRowThreeMarksInRowReturnsTrue() {
        // Arrange
        ticTacToe.board = new char[][]{
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };

        // Act
        boolean result = ticTacToe.checkWinnerRow();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckWinnerDiagonalThreeMarksInDiagonalReturnsTrue() {
        // Arrange
        ticTacToe.board = new char[][]{
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {'X', ' ', ' '}
        };

        // Act
        boolean result = ticTacToe.checkWinnerDiagonal();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckWinnerDiagonalThreeMarksInDiagonalLeftToRightReturnsTrue() {
        // Arrange
        ticTacToe.board = new char[][]{
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        // Act
        boolean result = ticTacToe.checkWinnerDiagonal();

        // Assert
        assertThat(result).isTrue();
    }


    @Test
    public void testIsGameDraw_BoardIsFull_ReturnsTrue() {
        // Arrange
        ticTacToe.board = new char[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };

        // Act
        boolean result = ticTacToe.isGameDraw();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testGetSpace_ReturnsCorrectValue() {
        // Arrange
        String expectedSpace = "\t \t \t \t \t \t";

        // Act
        String actualSpace = ticTacToe.getSpace();

        // Assert
        assertThat(actualSpace).isEqualTo(expectedSpace);
    }
}
