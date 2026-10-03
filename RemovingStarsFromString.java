
import java.util.Stack;

public class RemovingStarsFromString {
    public static String removeStars(String s) {
        Stack<Character> S = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '*' && S.isEmpty()) continue;
            else if(s.charAt(i) == '*') S.pop();
            else S.push(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character character : S) {
            result.append(character);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.err.println(removeStars(s));
    }
}
