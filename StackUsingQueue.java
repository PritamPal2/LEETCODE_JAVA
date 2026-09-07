import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q;

    public StackUsingQueue() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int n = q.size();
        for(int i=0;i<n-1;i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) { 
        StackUsingQueue stack = new StackUsingQueue(); 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 

        System.out.println("Top: " + stack.top()); 
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Top: " + stack.top()); 
        System.out.println("Is Empty: " + stack.empty()); 
    }
}
