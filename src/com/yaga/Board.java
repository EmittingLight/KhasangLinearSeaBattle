package com.yaga;

public class Board {
    private final int size;
    private Cell[] cells;

    public int getBoardSize() {
        return size;
    }

    public Board(int size) {
        this.size = size;
        cells = new Cell[size + 1];
        for (int i = 1; i <= size; i++) {
            cells[i] = new Cell();
        }
    }

    public void displayBoard(int shipLocation) {
        for (int i = 1; i <= size; i++) {
            if (i == shipLocation) {
                System.out.print(". ");
            } else {
                System.out.print(cells[i].getSymbol() + " ");
            }
        }
        System.out.println();
    }

    public void setCellSymbol(int index, String symbol) {
        cells[index].setSymbol(symbol);
    }

    public String getCellSymbol(int index) {
        return cells[index].getSymbol();
    }
}


