import java.util.PriorityQueue;
public class HeapsExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        System.out.println("Min is " + pq.peek());
    }
}