package com.yaga;

import java.util.Scanner;

public class GameRunner {
    public static void playBattleshipGame() {
        LinearBattleship game = new LinearBattleship();
        Scanner scanner = new Scanner(System.in);

        game.initializeBoard();
        game.placeShips();

        int moves = 0;
        boolean shipSunk = false;

        while (!shipSunk) {
            System.out.println("������� ����:");
            game.displayBoard();

            System.out.print("������� ����� ������ (1-10): ");
            String input = scanner.nextLine();

            try {
                int targetCell = Integer.parseInt(input);

                if (targetCell < 1 || targetCell > game.getBoardSize()) {
                    System.out.println("������������ ����. ����������, ������� ���������� ����� ������.");
                    continue;
                }

                String result = game.takeShot(targetCell);
                System.out.println(result);

                if ("���������".equals(result)) {
                    shipSunk = true;
                }

                moves++;
            } catch (NumberFormatException e) {
                System.out.println("������������ ����. ����������, ������� ���������� ����� ������.");
            }
        }

        System.out.println("�����������! �� �������� ������� �� " + moves + " �����.");
    }
}
