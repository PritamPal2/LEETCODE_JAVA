
class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int rows = mat.length;
        int cols = mat[0].length;
        // if(rows * cols != r * c) return mat;
        // int a=0;
        // int b=0;
        for(int i=0;i< rows * cols;i++) {
            result[i/c][i%c] = mat[i/cols][i%cols];
            // b++;
            // if(b == c) {
            //     a++;
            //     b=0;
            // }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        // int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 10;

        int[][] result = matrixReshape(mat, r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        // System.err.println(Arrays.toString(matrixReshape(mat, r, c)));
    }
}