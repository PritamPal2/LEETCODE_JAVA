import java.util.ArrayList;

class LuckyNumbersInMatrix {
    public static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] minrow = new int[rows];
        int[] maxcol = new int[cols];

        for(int i=0;i<rows;i++){
            minrow[i] = Integer.MAX_VALUE;
            // System.err.println(minrow[i]);
        }
        for(int i=0;i<cols;i++){
            maxcol[i] = Integer.MIN_VALUE;
            // System.err.println(maxcol[i]);
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(minrow[i] > matrix[i][j]) minrow[i] = matrix[i][j];
                if(maxcol[j] < matrix[i][j]) maxcol[j] = matrix[i][j];
            }
        }
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(matrix[i][j] == minrow[i] && matrix[i][j] == maxcol[j]) list.add(matrix[i][j]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        // int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] matrix = {{1,10,4,2},{19,13,12,13},{25,26,27,24}};
        ArrayList<Integer> result = luckyNumbers(matrix);
        for(int num : result) {
            System.err.println(num);
        }
    }
}