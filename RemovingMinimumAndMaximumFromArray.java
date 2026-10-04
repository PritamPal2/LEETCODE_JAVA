public class RemovingMinimumAndMaximumFromArray {
     public static int minimumDeletions(int[] nums) {
        // if(nums.length == 1) return 1;
        int minIdx = 0;
        int maxIdx = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
                minIdx = i;
            }
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIdx = i;
            }
        }

        if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        int deleteFromLeft = maxIdx + 1;
        int deleteFromRight = nums.length - minIdx;
        int deleteFromBothEnds = minIdx + 1 + nums.length - maxIdx;

        return Math.min(deleteFromLeft, Math.min(deleteFromRight, deleteFromBothEnds));
    }

    public static void main(String[] args) {
        // int[] nums = {2,7,5,1,10,4,8,6};
        int[] nums = {2,2,2,2,2,2,2};
        System.err.println(minimumDeletions(nums));
    }
}
