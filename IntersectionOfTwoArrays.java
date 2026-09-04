import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> values = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : nums1) {
            values.add(num);
        }

        for (int num : nums2) {
            if (values.contains(num)) {
                common.add(num);
            }
        }

        // USING SET DIRECTLY
        int[] result = new int[common.size()];
        int i = 0;
        for (int num : common) {
            result[i] = num;
            i++;
        }

        // // CONVER SET INTO ARRAYLIST THE COPY ELEMENTS INTO ARRAY
        // ArrayList<Integer> list = new ArrayList<>(common);
        // int[] result = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        //     result[i] = list.get(i);
        // }
        
        return result;
    }

    public static void main(String args[]) {
        int[] nums1 = {1,6,2,4,8,2,7,9,1};
        int[] nums2 = {1,8,0,3,7};
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        // System.out.println(obj.intersection(nums1, nums2));
        PrintStream ps = System.out;
        ps.println(Arrays.toString(obj.intersection(nums1, nums2)));
    }
}