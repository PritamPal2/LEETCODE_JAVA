import java.util.Arrays;

class Convert1DArrayInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if((m*n) != original.length) return new int[0][0];
        int[][] result = new int[m][n];

        for(int i=0;i<original.length;i++) {
            result[i/n][i%n] = original[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1,2};
        int m = 1;
        int n = 1;
        System.err.println(Arrays.deepToString(construct2DArray(original, m, n)));
    }
}