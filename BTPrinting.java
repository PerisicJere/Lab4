public class BTPrinting extends BinaryTree{

	//Prints the postOrder for a BinaryTree Node
	public void postOrder(Node node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

	//Prints the right most nodes of a BinaryTree
	public void printRight() {
		
		if(this.root != null) {
			Node temp = this.root;
			while(temp != null) {
				System.out.println(temp);
				temp = temp.right;
			}
		}
		else {
			System.out.println("Tree is empty");
		}
	}

	//Creates a BinaryTree and tests the methods
	@Override
	public void testMethods() {
		BTPrinting tree1 = new BTPrinting();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		Node newnode = tree1.root.left;
		tree1.postOrder(newnode);
		tree1.printRight();
		
	}
}
