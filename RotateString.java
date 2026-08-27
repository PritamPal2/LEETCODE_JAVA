public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String concatinate = s + s ;
        // System.err.println(concatinate);
        int j=0;
        for(int i=0;i<concatinate.length();i++) {
            if(goal.charAt(j) == concatinate.charAt(i)) j++;
            else if(j>0) {
                i = i - j;
                j = 0;
            }
            if(j == goal.length()) return true;
        }

        return false;

        // return concatinate.contains(goal);
    }

    public static void main(String[] args) {
        String s = "cdabna";
        String goal = "abnacd";
        RotateString result = new RotateString();
        System.out.println(result.rotateString(s, goal));
    }
}
