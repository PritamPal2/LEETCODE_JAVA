import java.util.Scanner;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    public void append(int val){
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        if(head == null) {
            System.out.println("The Link List is Empty.");
            return;
        }
        Node current = head;
        System.out.println("The Link List is: ");
        while(current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // DELETE NODE
    public static void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList mylList = new LinkedList();

        System.out.print("Enter the value for the head node.");
        int headValue = sc.nextInt();
        mylList.head = new Node(headValue);
        System.out.println("Head Node fixed as: " + headValue);

        while(true) {
            System.out.print("Enter the next value (or type -999 to finish) :");
            int value = sc.nextInt();

            if(value == -999) {
                break;
            }
            mylList.append(value);
        }
        System.out.println("\n___Output___");
        mylList.display();

        System.out.println("\n___Final Output after Delete Node___");
        LinkedList.deleteNode(mylList.head);
        mylList.display();

        sc.close();
    }
}


