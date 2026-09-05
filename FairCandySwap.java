import java.util.Arrays;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i : aliceSizes) {
            sum1 += i;
        }
        for(int i : bobSizes) {
            sum2 += i;
        }

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        if (sum1 >= sum2) {

            int left = 0;
            int right = 0;

            int diff = (sum1 - sum2) / 2;

            while (left < aliceSizes.length && right < bobSizes.length) {
                int difference = aliceSizes[left] - bobSizes[right];
                if (difference == diff) {
                    result[0] = aliceSizes[left];
                    result[1] = bobSizes[right];
                    return result;
                }
                if (difference < diff) {
                    left++;
                } else {
                    right++;
                }
            }
        } else {
            int left = 0;
            int right = 0;
            int diff = (sum2 - sum1) / 2;
            while (left < aliceSizes.length && right < bobSizes.length) {
                int difference = bobSizes[right] - aliceSizes[left];
                if (difference == diff) {
                    result[0] = aliceSizes[left];
                    result[1] = bobSizes[right];
                    return result;
                }
                if (difference < diff) {
                    right++;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] aliceSizes = {1,2,7,8,6,4,5};
        int[] bobSizes = {2,3,5,8,6,4,9};
        FairCandySwap obj = new FairCandySwap();
        int[] result = obj.fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result));
    }
}
