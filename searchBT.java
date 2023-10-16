public class searchBT extends BinaryTree {

    // Check if the tree contains a value greater than the given item
    public boolean containsGreater(int item) {
        return containsGreater(this.root, item);
    }

    // Recursive helper for containsGreater
    private boolean containsGreater(Node node, int item) {
        if (node == null) return false;
        if (node.data > item) return true;
        return containsGreater(node.left, item) || containsGreater(node.right, item);
    }

    // Get the level of the given item in the tree
    public int getLevel(int item) {
        return getLevel(this.root, item, 1);
    }

    // Recursive helper for getLevel
    private int getLevel(Node node, int item, int level) {
        if (node == null) return -1;
        if (node.data == item) return level;
        int leftLevel = getLevel(node.left, item, level + 1);
        if (leftLevel != -1) return leftLevel;
        return getLevel(node.right, item, level + 1);
    }

    // Test the methods with a sample tree
    @Override
    public void testMethods() {
        searchBT tree = new searchBT();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(12);

        System.out.println("Contains value greater than 8? " + containsGreater(8)); 
        System.out.println("Contains value greater than 16? " + containsGreater(16));  
        System.out.println("Level of node with value 7: " + getLevel(7));  
        System.out.println("Level of node with value 15: " + getLevel(15));  
    } 
}
