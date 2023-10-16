public class BinaryTree {
    protected Node root;

    static class Node {
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

   
      // Testing method to create a sample tree and test the methods
      public static void testMethods() {
  
    }

    public static void main(String[] args) {
        testMethods();
    }
}
