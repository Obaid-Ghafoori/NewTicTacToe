package com.tictactoe.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlayerTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void makeSymbol() {
        fail("tesfail");
    }

    @Test
    void isValidDrawReturnTrueTest() {
        Player player = mock(Player.class);
        int row = 0;
        int col = 0;

        // Set up the board with an empty position
        TicTacToe.board[0][0] = ' ';
        when(player.isValidDraw(row, col)).thenCallRealMethod();
        assertThat(player.isValidDraw(row, col)).isTrue();
    }

    @Test
    void getName() {
    }
}
