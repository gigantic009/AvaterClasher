public class LinkedListExample {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        System.out.println(head.data + " -> " + head.next.data);
    }
}