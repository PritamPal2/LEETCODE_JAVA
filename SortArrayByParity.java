
import java.util.Arrays;

public class SortArrayByParity {
    public static  int[] sortArrayByParity(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] % 2 == 0) nums[i] = nums[i] * (-1);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i] % 2 == 0) nums[i] = nums[i] * (-1);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3};

        // SortArrayByParity obj = new SortArrayByParity();
        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }
}
