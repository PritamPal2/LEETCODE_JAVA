import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String result = "";

        if (strs == null || strs.length == 0) return result;
        if (strs[0].length() == 0) return result;

        int i=0;
        while (i < strs[0].length() && i < strs[strs.length - 1].length()) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                result += strs[0].charAt(i);
                i++;
            } 
            else break;
        }

        return result;
    }
    public static void main(String[] args) {
        // String[] strs = {"flower","flow","flight"};
        String[] strs = {"dog","racecar","car", ""};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        // String[] result = obj.longestCommonPrefix(strs);
        System.err.println(obj.longestCommonPrefix(strs));
    }
}