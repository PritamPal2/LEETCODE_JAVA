import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String parenthesis) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<parenthesis.length();i++) {
            char c = parenthesis.charAt(i);
            if(c == '(' || c == '{' || c == '[') stack.push(c);    
            else if(!stack.isEmpty() && ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '['))) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses: ");
        String parenthesis = sc.nextLine(); // eg ({[]})

        ValidParentheses result = new ValidParentheses(); // Create object
        System.out.println(result.isValid(parenthesis));
        sc.close();
    }
}
