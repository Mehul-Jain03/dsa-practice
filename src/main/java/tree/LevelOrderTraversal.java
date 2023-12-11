package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	
	public void print(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
			 
		}
		
	}
	

	public static void main(String[] args) {
		
		
				//         10                                   
			   //      20       30   
              //    40   50  60    70  
             //                       90

            // ANS : Max is : 10,20,30,40,50,60,70,90

		Node root =      new Node(10);
		root.left =      new Node(20);
		root.right =     new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);
		
		LevelOrderTraversal lt = new LevelOrderTraversal();
		lt.print(root);
}

}
