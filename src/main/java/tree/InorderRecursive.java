package tree;

public class InorderRecursive {
	
	public void printOrder(Node root) {
		if (root !=null) {
			printOrder(root.left);
			System.out.print(root.data + " ");
			printOrder(root.right);
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

		InorderRecursive pt = new InorderRecursive();
		pt.printOrder(root);

	}

}
