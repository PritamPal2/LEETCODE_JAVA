class SpecialPositionBinaryMatrix {
    public static int numSpecial(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        int[] rowsum = new int[rows];
        int[] colsum = new int[cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                rowsum[i] += mat[i][j];
                colsum[j] += mat[i][j];
            }
        }
        
        int count=0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(mat[i][j] == 1 && rowsum[i] == 1 && colsum[j] == 1) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{1,1,0},{0,0,1}};
        System.err.println(numSpecial(mat));
    }
}