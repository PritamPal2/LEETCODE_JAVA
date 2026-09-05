

public class Search2Dmatrix {

    // Time Complexity O(m + log( n))
/*
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int low=0;
        int high = matrix[0].length - 1; // COLUMN
        int boundary = matrix[i][high];

        while(low <= high && i < matrix.length) {
            if(target > boundary) {
                i++;
                boundary = matrix[i][high];
                continue;
            }
            int mid = low + (high - low) / 2;
            if(matrix[i][mid] == target) return true;
            else if(matrix[i][mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
*/

// Time Complexity O(log(m * n))
public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1; // We assuming 2D array --> 1D array 

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / n;  // Convert Mid to Row
            int col = mid % n; //  Convert Mid to Column

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter target element: ");
        // int target = sc.nextInt();
         
        int target = 20;
        System.err.println(searchMatrix(matrix, target));
    }
}
