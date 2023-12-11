package bst;

public class FloorInBST {
	
	static Node floor(Node root,int x) {
		Node result = null;
		while(root!=null) {
			if(root.data==x) {
				return root;
			}
			else if(root.data>x) {
				root = root.left;
			}
			else {
				result = root;
				root = root.right;
			}
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		
		// Floor Means Maximum of the Lowest values.

		//                     20
		//                10        30
		//               7  11         70
		//                               90

		// ANS : Max is : Int is 63 : Ans 100

		Node root = new Node(20);
		root.left = new Node(10);
		root.left.left = new Node(7);
		root.left.right = new Node(11);
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.right.right = new Node(90);

		Node data = floor(root,100);
		System.out.println(data.data);
	}

}
