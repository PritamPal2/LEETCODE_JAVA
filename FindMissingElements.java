import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElements {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int low = nums[0], high = nums[0];

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

            if (nums[i] < low)
                low = nums[i];

            if (nums[i] > high)
                high = nums[i];
        }

        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums = {4, 7, 1, 8};

        FindMissingElements obj = new FindMissingElements();
        System.out.println(obj.findMissingElements(nums));
    }
}