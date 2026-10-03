public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int rightsum = 0;
        for(int num : nums) rightsum += num;
        int leftsum = 0;
        /* 
        if(rightsum - nums[0] == 0) return 0;
        for(int i=1;i<nums.length;i++) {
            leftsum += nums[i-1];
            rightsum = rightsum - leftsum - nums[i];
            System.err.println("Left Sum: " + leftsum + "\t" + "Pivot: " + i + "\t" + "Right Sum: " + rightsum);
            if(leftsum != rightsum) {
                rightsum = rightsum + leftsum + nums[i];
            }
            else return i;
        }
        */

        for(int i=0;i<nums.length;i++) {
            rightsum -= nums[i];
            if(leftsum != rightsum) leftsum += nums[i];
            else return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        // int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
}
