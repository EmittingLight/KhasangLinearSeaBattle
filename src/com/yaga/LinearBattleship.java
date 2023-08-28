package com.yaga;

import java.util.Random;

public class LinearBattleship {
    private final int boardSize = 10;
    private Board board;
    private int shipLocation;

    private boolean[] alreadyShot = new boolean[boardSize + 1];

    public LinearBattleship() {
        board = new Board(boardSize);
    }

    public Board getBoard() {
        return board;
    }

    public int getShipLocation() {
        return shipLocation;
    }

    public void initializeBoard() {
        for (int i = 1; i <= boardSize; i++) {
            board.setCellSymbol(i, ".");
            alreadyShot[i] = false;
        }
    }

    public void displayBoard() {
        board.displayBoard(shipLocation);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public String takeShot(int targetCell) {
        if (alreadyShot[targetCell]) {
            return "Вы уже стреляли в эту ячейку. Пожалуйста, выберите другую ячейку.";
        }

        alreadyShot[targetCell] = true;

        if (targetCell == shipLocation) {
            shipLocation = -1;
            return "Попадание";
        } else {
            return "Промах";
        }
    }

    public void placeShips() {
        Random random = new Random();
        shipLocation = random.nextInt(boardSize) + 1;
    }
}