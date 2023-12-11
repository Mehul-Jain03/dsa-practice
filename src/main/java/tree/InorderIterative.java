package tree;

import java.util.Stack;

public class InorderIterative {
	
	//Inorder L Root R
	
	public void printOrder(Node root) {
		
		Stack<Node> st = new Stack<Node>();
		Node curr = root;
		while(curr!=null||st.isEmpty()!=true) {
			while(curr!=null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.print(curr.data+" ");
			curr = curr.right;
		}
		
	}

	public static void main(String[] args) {
	
		
			   	 //   10

		 //      20       30

		//    40   50  60    70
       
		//Ans : 40 20 50 10 60 30 70

		Node root =      new Node(10);
		root.left =      new Node(20);
		root.right =     new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		InorderIterative pt = new InorderIterative();
        pt.printOrder(root);


	}

}
