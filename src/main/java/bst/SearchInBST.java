package bst;

public class SearchInBST {

	static boolean isPresentViaRecursion(Node root, int x) {
		if (root == null) {
			return false;
		} else if (root.data == x) {
			return true;
		} else if (x > root.data) {
			return isPresentViaRecursion(root.right, x);
		} else {
			return isPresentViaRecursion(root.left, x);
		}
	}
	
	static boolean isPresentViaIteration(Node root, int x) {
		/*
		 * if (root == null) { return false; }
		 */
		while (root != null) {

			if(root.data == x) {
				return true;
			}

			else if (root.data < x) {
				root = root.right;
			}
			else if (root.data > x) {
				root = root.left;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		//                     20
		//                10        30
		//               7  11         70
		//                               90

		// ANS : Max is : If Passed 12, return false

		Node root = new Node(20);
		root.left = new Node(10);
		root.left.left = new Node(7);
		root.left.right = new Node(11);
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);

		System.out.println("Is it Present ---> " + isPresentViaIteration(root, 8));

	}

}
