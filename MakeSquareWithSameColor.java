class MakeSquareWithSameColor {
    public static boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid.length - 1; j++) {

                int bCount = 0;
                for (int r = i; r < i + 2; r++) {
                    for (int c = j; c < j + 2; c++) {
                        if (grid[r][c] == 'B') bCount++;
                    }
                }
                if (bCount >= 3 || bCount <= 1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // char[][] grid = {{'B','W','B'},{'W','B','W'},{'B','W','B'}};
        char[][] grid = {{'B','W','B'},{'B','W','W'},{'B','W','B'}};

        // MakeSquareWithSameColor solver = new MakeSquareWithSameColor();
        // System.out.println(solver.canMakeSquare(grid));

        System.err.println(canMakeSquare(grid));
    }
}