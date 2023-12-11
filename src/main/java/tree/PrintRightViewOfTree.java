package tree;

public class PrintRightViewOfTree {
	
	
	public void print(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		print(root.right);
	}
	

	public static void main(String[] args) {
		

				     //          10
					//      20       30
                   //    40   50  60    70
		          //   80    
                 // ANS : 10,30,70

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.left.left.left = new Node(80);

		PrintRightViewOfTree pt = new PrintRightViewOfTree();
		pt.print(root);


}
}
