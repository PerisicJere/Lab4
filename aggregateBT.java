// Made by Nikan

// AggregateBT class extends BinaryTree and contains methods to work with binary trees
public class aggregateBT extends BinaryTree {

    // Constructor for AggregateBT class, calling the constructor of the superclass (BinaryTree)
    public aggregateBT() {
        super();
    }

    // Recursive method to count nodes with even values
    public int countEvenNumberRecursive(Node node) {
        // Base case: if the node is null, return 0
        if (node == null) {
            return 0;
        }

        // Initialize a counter for even numbers
        int evenCount = 0;

        // Check if the current node's value is even, increment the counter if true
        if (node.data % 2 == 0) {
            evenCount++;
        }

        // Recursively count even nodes in the left and right subtrees and accumulate the count
        evenCount = evenCount + countEvenNumberRecursive(node.left);
        evenCount = evenCount + countEvenNumberRecursive(node.right);

        // Return the total count of even nodes
        return evenCount;
    }

    // Recursive method to find the summation of values in the tree
    public int findSumRecursive(Node node) {
        // Base case: if the node is null, return 0
        if (node == null) {
            return 0;
        }

        // Initialize a variable to store the sum of node values
        int sum = node.data;

        // Recursively find the sum of values in the left and right subtrees and accumulate the sum
        sum += findSumRecursive(node.left);
        sum += findSumRecursive(node.right);

        // Return the total sum of node values
        return sum;
    }

    // Public method to initiate the recursive process of finding the sum of values in the tree
    public int findSum() {
        return findSumRecursive(root); // Start recursion from the root node
    }

    // Public method to initiate the recursive process of counting nodes with even values
    public int findEvenSum() {
        return countEvenNumberRecursive(root); // Start recursion from the root node
    }
}
