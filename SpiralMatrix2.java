
class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                matrix[top][j] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                
                matrix[i][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    
                    matrix[bottom][j] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    
                    matrix[i][left] = count++;
                }
                left++;
            }
        }
        return matrix;
    }

    public static void display(int n) {
        int[][] matrix = generateMatrix(n);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.err.print(matrix[i][j] + "\t");
            }
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        display(12);
    }
}