class RowWithMaximumOnes {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowsOne = new int[m];

        for(int i=0;i<m;i++) {
            int count = 0;
            for(int j=0;j<n;j++) {
                if(mat[i][j] == 1) count++;
            }
            rowsOne[i] = count;
        }
        for(int num : rowsOne) {
            System.err.print(num + "\t");
        }
        System.err.println();
        int track = 0;
        int sumOne = 0;
        for(int i=0;i<m;i++) {
            if(rowsOne[i] > sumOne) {
                track = i;
                sumOne = rowsOne[i];
            }
        }
        System.err.println(track);
        return new int[]{track, sumOne};
    }

    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,1},{0,0}};
        int[] result = rowAndMaximumOnes(mat);
        for(int num : result) {
            System.err.print(num + "\t");
        }
        System.err.println();
    }
}