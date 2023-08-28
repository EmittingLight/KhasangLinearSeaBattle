package com.yaga;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(10);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void displayBoard() {
        board.setCellSymbol(5, "X");
        board.displayBoard(3);
    }

    @Test
    void setCellSymbol() {
        board.setCellSymbol(7, "O");
        assertEquals("O", board.getCellSymbol(7));
    }
}
