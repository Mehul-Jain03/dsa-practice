package tree;

import java.util.Stack;

public class PostorderIterative {
	
	//Postorder : L R Root
	
	public void printOrder(Node root) {
		if(root==null) {
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while(!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if(root.left!=null) {
				s1.push(root.left);
			}
			if(root.right!=null) {
				s1.push(root.right);
			}
			
		}
		while(!s2.isEmpty()) {
			root =s2.pop();
			System.out.print(root.data+" ");
		}
		
	}

	public static void main(String[] args) {
		
               //   10

       //      20       30

       //    40   50  60    70
      //Ans : 40 50 20 60 70 30 10

          Node root = new Node(10);
          root.left = new Node(20);
          root.right = new Node(30);
          root.left.left = new Node(40);
          root.left.right = new Node(50);
          root.right.left = new Node(60);
          root.right.right = new Node(70);

          PostorderIterative pt = new PostorderIterative();
          pt.printOrder(root);

	}

}
