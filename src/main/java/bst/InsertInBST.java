package bst;

public class InsertInBST {
	
	static Node insertViaRecursion(Node root,int x) {
		if(root == null) {
			return new Node(x);
		}
		if(x>root.data) {
			root.right = insertViaRecursion(root.right,x);
		}
		else if(x<root.data) {
			root.left = insertViaRecursion(root.left,x);
		}
		return root;
		
	}
	
	static Node insertViaIteration(Node root, int x) {
		Node temp = new Node(x);
		Node parent = null;
		Node curr = root;
		while (curr != null) {
			parent = curr;
			if (curr.data < x) {
				curr = curr.right;
			} else if (curr.data > x) {
				curr = curr.left;
			} else
				return root;
		}
		if (parent == null) {
			return temp;
		}
		if (parent.data > x) {
			parent.left = temp;
		} else
			parent.right = temp;
		return root;
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
		
		insertViaRecursion(root,34);
		insertViaIteration(root,34);

	}

}
