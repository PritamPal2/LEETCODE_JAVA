
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        
        int ans = s2.pop();
        
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int ans = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return ans;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front: " + queue.peek());

        System.out.println("Pop: " + queue.pop());

        System.out.println("Pop: " + queue.pop());

        System.out.println("Front: " + queue.peek());

        System.out.println("Is Empty: " + queue.empty());
    }
}
