import java.util.Stack;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> S = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '#' && S.isEmpty()) continue;
            if(s.charAt(i) == '#') S.pop();
            else S.push(s.charAt(i));
        }
        
        Stack<Character> T = new Stack<>();
        for(int i=0;i<t.length();i++) {
            if(t.charAt(i) == '#' && T.isEmpty()) continue;
            if(t.charAt(i) == '#') T.pop();
            else T.push(t.charAt(i));
        }

        return (S.equals(T));
    }

    public static void main(String[] args) {
        String s = "ab##ewrwe";
        String t = "c#d#dfbh";
        System.err.println(backspaceCompare(s, t));
    }
}
