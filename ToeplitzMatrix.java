class ToeplitzMatrix {
    public static boolean isToeplitz(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // FORMULA A[i][j] == A[i-1][j-1]
        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                if(matrix[i][j] != matrix[i-1][j-1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{6,5,1,2},{7,6,5,1}};

        if(isToeplitz(matrix)) System.err.println("Toeplitz Matrix");
        else System.err.println("Not Toeplitz Matrix");
    }
}