import java.util.ArrayList;
public class GraphsExample {
    public static void main(String[] args) {
        int v = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < v; i++) adj.add(new ArrayList<>());
        System.out.println("Graph initialized with " + v + " vertices");
    }
}