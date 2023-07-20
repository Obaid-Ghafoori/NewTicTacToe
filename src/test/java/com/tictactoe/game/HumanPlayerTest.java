package com.tictactoe.game;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;

import java.util.Scanner;

import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HumanPlayerTest {

    @Mock
    HumanPlayer humanPlayer;

    @Test
    void makeSymbol() {
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        when(scanner.nextInt()).thenCallRealMethod();

       // assertThat(scanner.nextInt()).is

    }
}