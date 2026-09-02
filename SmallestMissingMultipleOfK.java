import java.util.HashSet;

public class SmallestMissingMultipleOfK {

    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }

        // Check k, 2k, 3k, 4k, ...
        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }

    public static void main(String[] args) {

        int[] nums = {10, 25};
        int k = 5;

        SmallestMissingMultipleOfK result = new SmallestMissingMultipleOfK();

        System.out.println(result.missingMultiple(nums, k));
    }
}