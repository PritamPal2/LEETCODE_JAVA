import java.util.Arrays;

public class ConcatinateArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];
        for(int i=0;i<n;i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }
        return result;
    }

    public static void main(String args[]) {
        int[] nums = {1,4,7,8,2};

        ConcatinateArray obj = new ConcatinateArray();
        int[] result = obj.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
