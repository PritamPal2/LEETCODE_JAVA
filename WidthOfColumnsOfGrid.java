class WidthOfColumnsOfGrid {
    public static int[] findColumnWidth(int[][] grid) {
        int[] col = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    int size = (int)Math.log10(Math.abs(grid[i][j])) + 1;
                    size++;
                    if (size > col[j])
                        col[j] = size;
                } else if (grid[i][j] == 0) {
                    int size = 1;
                    if (size > col[j])
                        col[j] = size;
                } else {
                    int size = (int) Math.log10(grid[i][j]) + 1;
                    if (size > col[j])
                        col[j] = size;
                }
            }
        }
        return col;
    }

    public static void main(String[] args) {
        int[][] grid = {{-15,1,3},{15,7,12},{5,6,-2}};
        // int[][] grid = {{1},{22},{333}};
        int[] result = findColumnWidth(grid);
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + "  ");
        }
        System.err.println("");
    }
}