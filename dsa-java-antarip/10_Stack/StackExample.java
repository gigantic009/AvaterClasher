import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st.pop());
    }
}