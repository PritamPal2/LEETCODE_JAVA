class FindChampion1 {
    public static int findChampion(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int track = 0;
        int rowSum = 0;

        for(int i=0;i<m;i++) {
            int count = 0;
            for(int j=0;j<n;j++) {
                if(grid[i][j] == 1) count++;
            }
            // System.err.println(count+"\t"+track+"\t"+rowSum);
            if(count > rowSum) {
                rowSum = count;
                track = i;
            }
            // System.err.println(count+"\t"+track+"\t"+rowSum);
            // System.err.println("");
        }
        return track;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{1,0,1},{1,0,0}};
        System.err.println(findChampion(grid));
    }
}