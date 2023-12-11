package tree;

public class PreorderRecursive {
	
	public void printOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			printOrder(root.left);
			printOrder(root.right);
		}
	}

	public static void main(String[] args) {
		

				//   10

		//      20       30

		//    40   50  60    70
		//Ans : 10 20 40 50 30 60 70

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		PreorderRecursive pt = new PreorderRecursive();
	    pt.printOrder(root);


	}

}