package tree;

public class PostorderRecursive {
	
	public void printOrder(Node root) {
		if(root!=null) {
			printOrder(root.left);
			printOrder(root.right);
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

			PostorderRecursive pr = new PostorderRecursive();
			pr.printOrder(root);
}
}
