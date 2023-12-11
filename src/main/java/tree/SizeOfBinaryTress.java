package tree;

public class SizeOfBinaryTress {
	
	public int count(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+count(root.left)+count(root.right);
	}
	

	public static void main(String[] args) {
		
						//          10                                   
		 			   //      20       30   
		              //    40   50  60    70  
	                 //                       90

		            // ANS : Size is Count of Total Nodes : 8

		Node root =      new Node(10);
		root.left =      new Node(20);
		root.right =     new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);

		SizeOfBinaryTress pr = new SizeOfBinaryTress();
		System.out.println("Size of the tree is "+pr.count(root));

	}

}
