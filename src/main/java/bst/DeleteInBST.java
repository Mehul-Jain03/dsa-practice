package bst;

public class DeleteInBST {
	
	static Node deleteViaRecusrion(Node root, int x) {
		if (root == null) {
			return root;
		}
		if (root.data > x) {
			root.left = deleteViaRecusrion(root.left, x);
		} else if (root.data < x) {
			root.right = deleteViaRecusrion(root.right, x);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root.data = minValue(root.right);
			root.right = deleteViaRecusrion(root.right, root.data);
		}

		return root;
	}

	static int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	

	public static void main(String[] args) {

		//                     20
		//                10        30
		//               7  11         70
		//                               90


		Node root = new Node(20);
		root.left = new Node(10);
		root.left.left = new Node(7);
		root.left.right = new Node(11);
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);
		
		deleteViaRecusrion(root,10);
	}


}
