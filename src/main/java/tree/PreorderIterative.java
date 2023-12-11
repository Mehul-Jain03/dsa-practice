package tree;

import java.util.Stack;

public class PreorderIterative {

	// In Preorder : Root Left Right

	public void printOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		while (st.isEmpty()!=true) {
		   Node curr = st.pop();
		   System.out.print(curr.data+ " ");
		   
		   if(curr.right!=null) {
			   st.push(curr.right);
		   }
		   if(curr.left!=null) {
			   st.push(curr.left);
		   }
		}
		
	}

	public static void main(String[] args) {

		         //   10

         //      20       30

		//    40   50  60    70
//	Ans : 10 20 40 50 30 60 70

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		PreorderIterative pt = new PreorderIterative();
		pt.printOrder(root);

	}

}
