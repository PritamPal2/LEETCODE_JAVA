class FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] nums = new int[n*n];
        for(int i=0;i<n*n;i++) {
            nums[i] = i+1;
        }

        int duplicate = 0;
        int missing  = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == nums[grid[i][j] - 1]) {
                    nums[grid[i][j] - 1] = 0;
                } else {
                    duplicate = grid[i][j];
                }
            }
        }

        for(int i=0;i<n*n;i++) {
            if(nums[i] != 0) missing = nums[i];
        }
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        int[] result = findMissingAndRepeatedValues(grid);
        System.err.println(result[0] + "\t" + result[1]);
    }
}