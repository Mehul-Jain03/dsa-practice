package tree;

public class DiameterOfBinaryTree {
	int diameter;

	public int getDiameter(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return 1;
		}

		int lH = getDiameter(node.left);
		int rH = getDiameter(node.right);

		diameter = Math.max(diameter, lH + rH + 1);
		return Math.max(lH, rH) + 1;
	}

	public static void main(String[] args) {

		//            10
		//          20  30
		//        40  50   70
		//      80
		// ANS : 6

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(70);
		root.left.left.left = new Node(80);

		DiameterOfBinaryTree pt = new DiameterOfBinaryTree();
		pt.getDiameter(root);
		System.out.println(pt.diameter);

	}
}
