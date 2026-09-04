import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        // Check elements of nums2
        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                resultList.add(num);

                // Decrease frequency
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String args[]) {
        int[] nums1 = {1,6,2,4,8,2,7,9,1};
        int[] nums2 = {1,8,0,3,7,1};
        IntersectionOfTwoArrays2 obj = new IntersectionOfTwoArrays2();
        // System.out.println(obj.intersection(nums1, nums2));
        PrintStream ps = System.out;
        ps.println(Arrays.toString(obj.intersect(nums1, nums2)));
    }
}
