import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class PairSumLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        // Collections.sort(nums, Collections.reverseOrder()); // DESCENDING ORDER
        nums.sort(null); // SORT IN ASCENDING ORDER

        int i = 0;
        int j = i + 1;
        int count = 0;

        while (i < nums.size() - 1) {

            if (j >= nums.size()) {
                i++;
                j = i + 1;
                continue;
            }

            if (nums.get(i) + nums.get(j) < target) {
                count++;
                j++;
            } 
            else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,-1,7,4,2,3);
        int target = 8;
        PairSumLessThanTarget obj = new PairSumLessThanTarget();
        PrintStream ps = System.out;
        ps.println(obj.countPairs(nums, target));
    }
}
