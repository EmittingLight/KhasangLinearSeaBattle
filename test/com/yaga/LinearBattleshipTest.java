package com.yaga;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LinearBattleshipTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    void initializeBoard() {
        LinearBattleship game = new LinearBattleship();
        game.initializeBoard();

        Board board = game.getBoard();
        for (int i = 1; i <= board.getBoardSize(); i++) {
            assertEquals(".", board.getCellSymbol(i));
        }
    }

    @Test
    void displayBoard() {
        LinearBattleship game = new LinearBattleship();
        game.initializeBoard();
        game.placeShips();

        game.displayBoard();


    }

    @Test
    void getBoardSize() {
        LinearBattleship game = new LinearBattleship();
        assertEquals(10, game.getBoardSize());
    }

    @Test
    void takeShot() {
        LinearBattleship game = new LinearBattleship();
        game.initializeBoard();
        game.placeShips();

        String result = game.takeShot(game.getShipLocation());
        assertTrue(result.equals("Попадание") || result.equals("Промах"));
    }

    @Test
    void placeShips() {
        LinearBattleship game = new LinearBattleship();
        game.placeShips();

        int shipLocation = game.getShipLocation();
        assertTrue(shipLocation >= 1 && shipLocation <= game.getBoardSize());
    }
}
