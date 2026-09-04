public class FirstBadVersion {
    // VersionControl class
    static class VersionControl {

        // Store the first bad version
        private final int badVersion;

        // Constructor
        public VersionControl(int badVersion) {
            this.badVersion = badVersion;
        }

        // Check whether a version is bad
        public boolean isBadVersion(int version) {
            return version >= badVersion;
        }
    }

    // Solution class
    static class Solution extends VersionControl {

        // Constructor
        public Solution(int badVersion) {
            super(badVersion);
        }

        // Find the first bad version using Binary Search
        public int firstBadVersion(int n) {

            long left = 1;
            long right = n;

            while (left < right) {

                long mid = left + (right - left) / 2;

                if (isBadVersion((int) mid)) {
                    // mid is bad
                    // First bad version can be mid or before mid
                    right = mid;
                } else {
                    // mid is good
                    // First bad version must be after mid
                    left = mid + 1;
                }
            }

            return (int) left;
        }
    }

    // Main function
    public static void main(String[] args) {

        // Total number of versions
        int n = 2126753390;

        // First bad version
        int badVersion = 1702766719;

        // Create Solution object
        Solution solution = new Solution(badVersion);

        // Find first bad version
        int result = solution.firstBadVersion(n);

        // Print result
        System.out.println("Total versions: " + n);
        System.out.println("Actual bad version: " + badVersion);
        System.out.println("First bad version found: " + result);
    }
}
