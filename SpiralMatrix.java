import java.util.ArrayList;
class SpiralMatrix {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    // public static void display(ArrayList<Integer> list) {
    //     for(int num : list) {
    //         System.out.print(num + "\t");
    //     }
    //     System.err.println("");
    // }
        

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> result = spiralOrder(matrix);

        System.out.println(spiralOrder(matrix));
        // display(result);
    }
}