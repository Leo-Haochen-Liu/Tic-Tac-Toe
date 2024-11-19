import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] grid =
                {{0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Here's the initial Tic-Tac-Toe grid:");
        Grid.printGrid(grid);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; Game.gameEnd(grid) == 0; i++) {
            if (i % 2 == 1) {
                System.out.print("Player1 enter an coordinate using the format\"x,y\": ");
                String inputCor = scanner.nextLine();

                int rolNum = Character.getNumericValue(inputCor.charAt(0)) - 1;
                int colNum = Character.getNumericValue(inputCor.charAt(2)) - 1;

                if (grid[rolNum][colNum] == 0) {
                    grid[rolNum][colNum] = 1;
                } else {
                    System.out.println("Invalid coordinate input! please try another one");
                    i--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                System.out.print("Player2 enter an coordinate using the format\"x,y\": ");
                String inputCor = scanner.nextLine();

                int rolNum = Character.getNumericValue(inputCor.charAt(0)) - 1;
                int colNum = Character.getNumericValue(inputCor.charAt(2)) - 1;

                if (grid[rolNum][colNum] == 0) {
                    grid[rolNum][colNum] = -1;
                } else {
                    System.out.println("Invalid coordinate input! please try another one");
                    i--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            Grid.printGrid(grid);

            if (Game.gameEnd(grid) != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (Game.gameEnd(grid) == 1 || Game.gameEnd(grid) == 2) {
                    System.out.println("Game end, Player " + Game.gameEnd(grid) + " won the game");
                }
                else if (Game.gameEnd(grid) == -1) {
                    System.out.println("Game end, it's a draw");
                }
                System.exit(0);
            }
        }
    }
}