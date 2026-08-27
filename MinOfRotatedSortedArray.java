public class MinOfRotatedSortedArray {
    public static int findMin(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<=min) min=nums[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,4,4,4,4,4,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,10,10,10,-10,-10,-10,-9,-8,-8,-8,-8,-8,-7,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-5,-5,-5,-4,-4,-4,-4,-3,-3,-3,-3,-3,-3,-2,-2,-2,-2,-1,-1,0,0,0,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3};
        System.out.println(findMin(nums));
        
    }
}
