package LeetCodeQuestions;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    // Function to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;       // Start with no previous node
        Node current = head;    // Start from the head
        Node next = null;       // Temporary node to store next

        while (current != null) {
            next = current.next;    // Step 1: store next node
            current.next = prev;    // Step 2: reverse pointer
            prev = current;         // Step 3: move prev forward
            current = next;         // Step 4: move current forward
        }

        // After the loop, prev becomes the new head
        return prev;
    }

    // Helper function to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 10 -> 20 -> 30 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
