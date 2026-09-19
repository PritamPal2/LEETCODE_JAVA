class ClimbingStairs {
    public static int climbStairs(int n) {
        int f = 1;
        int s = 1;
        for(int i=0;i<n;i++) {
            int temp = s;
            s = f + s;
            f = temp;
            System.err.print(f+ "\t");
            // System.err.println(s);
        }

        return f;
    }
    public static void main(String[] args) {
        int n = 45;
        System.err.println(climbStairs(n));
    }
}
