import java.util.Arrays;

class DegreeOfEachVertex {
    public static int[] findDegrees(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowSum = new int[rows];

        for(int i=0;i<rows;i++) {
            // int count = 0;
            for(int j=0;j<cols;j++) {
                if(matrix[i][j] == 1) {
                    rowSum[i] += 1;
                    // count++;
                }
            }
            // rowSum[i] = count;
        }
        return rowSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{1,0,1},{1,1,0}};

        System.err.println(Arrays.toString(findDegrees(matrix)));
    }
}