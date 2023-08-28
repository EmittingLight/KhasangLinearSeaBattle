package com.yaga;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CellTest {

    private Cell cell;

    @BeforeEach
    void setUp() {
        cell = new Cell();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSymbol() {
        assertEquals(".", cell.getSymbol());
    }

    @Test
    void setSymbol() {
        cell.setSymbol("X");
        assertEquals("X", cell.getSymbol());
    }
}
