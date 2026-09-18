public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxOneCount = 0;
        for(int num : nums) {
            if(num == 0) {
                if(count > maxOneCount) maxOneCount = count;
                count = 0;
            } else count++;
        }
        if(count > maxOneCount) maxOneCount = count;
        return maxOneCount;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0,0,1,1,0,1,1,1,0,0};
        System.err.println(findMaxConsecutiveOnes(nums));
    }
}
