public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;

        if (nums.length == 2) {
            for (int num : nums) {
                if (num > max)
                    max = num;
            }
            return (int) max;
        }

        for (int num : nums) {
            if (num >= max) {
                if (max == num) continue;

                thirdmax = secmax;
                secmax = max;
                max = num;
            } else if (num >= secmax) {
                if (secmax == num) continue;

                thirdmax = secmax;
                secmax = num;
            } else if (num > thirdmax) {
                thirdmax = num;
            }
        }
        return (int)thirdmax;

        /*
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max3 = max2;
                max2 = num;
            }
            else if(num > max3 && num != max2 && num != max1){
                max3 = num;
            }
        }
        return (max3 == Long.MIN_VALUE) ? (int)max1 :(int)max3;
        */
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.err.println(thirdMax(nums));
    }
}
