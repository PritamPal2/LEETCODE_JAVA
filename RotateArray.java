public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k = k % nums.length;
        int i=0;
        int j=nums.length-k-1;
        while(i<j) {
           int temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp; 
           i++;
           j--;
        }
        i=nums.length-k;
        j=nums.length-1;
        while(i<j) {
           int temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp; 
           i++;
           j--;
        }
        i=0;
        j=nums.length-1;
        while(i<j) {
           int temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp; 
           i++;
           j--;
        }
        for(i=0;i<nums.length;i++) {
            System.out.print(nums[i]);
        }

        /*
    public void rotate(int[] nums, int k) {

        k%=nums.length;
        if(k<0)
        {
            k+=nums.length;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        }
        
        private void reverse(int nums[] , int left , int right)
        {
            while(left < right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        */
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        RotateArray result = new RotateArray();
        result.rotate(nums, k);
    }
}
