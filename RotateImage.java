// TRANSPOSE + REVERSE COLUMN
class RotateImage {
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=i+1;j<matrix.length;j++) {
                matrix[i][j] = (matrix[i][j] + matrix[j][i]) - (matrix[j][i] = matrix[i][j]);
            }
        }

        int left = 0;
        int right = matrix.length - 1;
        while(left < right) {
            int top = 0;
            while(top < matrix.length) {
                matrix[top][right] = (matrix[top][right] + matrix[top][left]) - (matrix[top][left] = matrix[top][right]);
                top++;
            }
            left++;
            right--;
        }
    }

    public static void display(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.err.print(matrix[i][j] + "\t");
            }
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
        display(matrix);
    }
}