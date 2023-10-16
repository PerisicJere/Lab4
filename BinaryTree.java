public class BinaryTree {
    private Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }
    public void testing() {
    }
}
