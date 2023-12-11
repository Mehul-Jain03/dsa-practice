package tree;

public class MaximumInBinaryTree {
	
	public int maxNumber(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data,Math.max(maxNumber(root.left),maxNumber(root.right)));
	}

	public static void main(String[] args) {
	
		
				 //         10                                   
		        //      20       30   
               //    40   50  60    70  
              //                       90

            // ANS : Max is : 90

		Node root =      new Node(10);
		root.left =      new Node(20);
		root.right =     new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);

		MaximumInBinaryTree max = new MaximumInBinaryTree();
		System.out.println("Max Number in BT is  "+max.maxNumber(root));

	}

}
