public class TreesExample {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println("Root is " + root.val);
    }
}