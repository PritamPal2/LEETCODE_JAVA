import java.util.ArrayList;

class ZigzagGridTraversalWithSkip {
    public static ArrayList<Integer> zigzagTraversal(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        while(top < grid.length) {
            int left = 0;
            int right = grid[0].length - 1;
            for (int i = left; i <= right; i += 2) {
                list.add(grid[top][i]);
                if(i == right) right--;
            }
            top++;

            if (top >= grid.length) break;

            for(int i=right;i>=left;i -= 2) {
                list.add(grid[top][i]);
            }
            top++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.err.println(zigzagTraversal(grid));
    }
}