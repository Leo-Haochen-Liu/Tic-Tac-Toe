public class Game {

    public static int gameEnd(int[][] grid) {

        // check roll completion
        // if Player 1 complete, return 1
        // if Player 2 complete, return 2
        for (int i = 0; i < grid.length; i++) {
            int sum = grid[i][0];
            for (int j = 1; j < grid.length; j++) {
                if (grid[i][j] != grid[i][j - 1]) {
                    j = grid.length;
                } else if (grid[i][j] == grid[i][j - 1] && grid[i][j] != 0) {
                    sum += grid[i][j];
                }
            }
            if (sum == grid.length) {
                return 1;
            } else if (sum == -grid.length) {
                return 2;
            }
        }

        // check column completion
        // if Player 1 complete, return 1
        // if Player 2 complete, return 2
        for (int i = 0; i < grid.length; i++) {
            int sum = grid[0][i];
            for (int j = 1; j < grid.length; j++) {
                if (grid[j][i] != grid[j - 1][i]) {
                    j = grid.length;
                } else if (grid[j][i] == grid[j - 1][i] && grid[j][i] != 0) {
                    sum += grid[j][i];
                }
            }
            if (sum == grid.length) {
                return 1;
            } else if (sum == -grid.length) {
                return 2;
            }
        }

        // check diagonal 1 completion
        // if Player 1 complete, return 1
        // if Player 2 complete, return 2
        int sum = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][i] != grid[i - 1][i - 1]) {
                i = grid.length;
            } else if (grid[i][i] == grid[i - 1][i - 1] && grid[i][i] != 0) {
                sum += grid[i][i];
            }
        }
        if (sum == grid.length) {
            return 1;
        } else if (sum == -grid.length) {
            return 2;
        }

        // check diagonal 2 completion
        // if Player 1 complete, return 1
        // if Player 2 complete, return 2
        sum = grid[0][grid.length - 1];
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][grid.length - 1 - i] != grid[i - 1][grid.length - i]) {
                i = grid.length;
            } else if (grid[i][grid.length - 1 - i] == grid[i - 1][grid.length - i] && grid[i][grid.length - 1 - i] != 0) {
                sum += grid[i][grid.length - 1 - i];
            }
        }
        if (sum == grid.length) {
            return 1;
        } else if (sum == -grid.length) {
            return 2;
        }

        // if no roll or column completed,
        // there exist a "0", return 0
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 0) return 0;
            }
        }

        // if no roll or column completed,
        // and no "0" exist,
        // then return -1
        return -1; // 0, 1, 2, -1
    }

    public static void main(String[] args) {
        int[][] grid =
                {{0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}};

        System.out.println(gameEnd(grid)); // 0

        int[][] grid1 =
                {{1, 1, 1},
                        {0, 0, 0},
                        {0, 0, 0}};

        System.out.println(gameEnd(grid1)); // 1

        int[][] grid2 =
                {{-1, -1, -1},
                        {0, 0, 0},
                        {0, 0, 0}};

        System.out.println(gameEnd(grid2)); // 2

        int[][] grid3 =
                {{1, 0, 0},
                        {1, 0, 0},
                        {1, 0, 0}};

        System.out.println(gameEnd(grid3)); // 1

        int[][] grid4 =
                {{-1, 0, 0},
                        {-1, 0, 0},
                        {-1, 0, 0}};

        System.out.println(gameEnd(grid4)); // 2

        int[][] grid5 =
                {{-1, -1, 1},
                        {1, -1, -1},
                        {-1, 1, 1}};

        System.out.println(gameEnd(grid5)); // -1

        int[][] grid6 =
                {{1, -1, 0},
                        {1, 1, -1},
                        {-1, 0, 1}};

        System.out.println(gameEnd(grid6)); // 1

        int[][] grid7 =
                {{0, -1, 1},
                        {0, 1, -1},
                        {1, 0, -1}};

        System.out.println(gameEnd(grid7)); // 1

        int[][] grid8 =
                {{-1, 0, 0},
                        {0, -1, 0},
                        {0, 0, -1}};

        System.out.println(gameEnd(grid8)); // 2

        int[][] grid9 =
                {{0, 0, -1},
                        {0, -1, 0},
                        {-1, 0, 0}};

        System.out.println(gameEnd(grid9)); // 2
    }
}
