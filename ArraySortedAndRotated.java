public class ArraySortedAndRotated {
    public static boolean check(int[] nums) {
        if(nums.length == 1) return true;
        int[] result = new int[nums.length * 2];

        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);

        int n=nums.length;
        for(int i=0;i<result.length-1;i++) {
            if(result[i]<=result[i+1]) {
                n--;
            } else {
                n = nums.length;
            }
            if(n == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }
}
