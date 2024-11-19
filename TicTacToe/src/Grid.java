public class Grid {

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    System.out.print("- ");
                }
                else if (grid[i][j] == 1) {
                    System.out.print("O ");
                }
                else  {
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }


}
