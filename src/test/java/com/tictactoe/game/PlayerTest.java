package com.tictactoe.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlayerTest {
    private final Player player = mock(Player.class);

    @BeforeEach
    public void setup() {
        new TicTacToe();
    }

    @Test
    void isValidDrawReturnTrueTest() {
        int row = 0, col = 0;
        // Set up the board with an empty position
        TicTacToe.board[0][0] = ' ';
        when(player.isValidDraw(row, col)).thenCallRealMethod();
        assertThat(player.isValidDraw(row, col)).isTrue();
    }

    @Test
    void isValidDrawReturnFalseWhenPositionAlreadyTakenTest() {
        int row = 0, col = 0;
        TicTacToe.board[0][0] = 'X';
        when(player.isValidDraw(row, col)).thenCallRealMethod();
        assertThat(player.isValidDraw(row, col)).isFalse();
    }

    @Test
    void isValidDrawReturnFalseWhenPositionIsOutOfRangeTest() {
        int row = 3, col = 0;
        TicTacToe.board[0][0] = 'X';
        when(player.isValidDraw(row, col)).thenCallRealMethod();
        assertThat(player.isValidDraw(row, col)).isFalse();
    }

    @Test
    void getNameReturnString() {
        String name = "Bob";
        when(player.getName()).thenReturn(name);
        assertThat(player.getName()).isEqualTo(name);
    }
}
