package bst;

public class CeilInBST {
	
	static Node ceil(Node root, int x) {
		Node result = null;
		while (root != null) {
			if (root.data == x) {
				return root;
			} else if (root.data < x) {
				root = root.right;
			} else {
				result = root;
				root = root.left;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		// Ceil Means : Find the Maximum Values and then the smallest of those Maximum's

		//                     20
		//                10        30
		//               7  11         70
		//                               90

		// ANS : Max is : Int is 9 : Ans 100

		Node root = new Node(20);
		root.left = new Node(10);
		root.left.left = new Node(7);
		root.left.right = new Node(11);
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);

		Node data = ceil(root,9);
		System.out.println(data.data);
	}

}
