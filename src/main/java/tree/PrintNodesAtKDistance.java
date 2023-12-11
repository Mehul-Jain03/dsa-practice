package tree;

public class PrintNodesAtKDistance {
	
	public void print(Node root,int k) {
		
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.print(root.data+" ");
		}
		print(root.left, k-1);
		print(root.right, k-1);
	}

	public static void main(String[] args) {
		
			  //         10                                     10
			 //      20       30                             20    30
 			//    40   50  60    70                          ANS : At Distance 1: 20,30
		   //                       90

          // ANS : At Distance 2 : 40,50,60,70

	Node root =      new Node(10);
	root.left =      new Node(20);
	root.right =     new Node(30);
	root.left.left = new Node(40);
	root.left.right = new Node(50);
	root.right.left = new Node(60);
	root.right.right = new Node(70);
	root.right.right.right = new Node(90);

	PrintNodesAtKDistance pr = new PrintNodesAtKDistance();
	pr.print(root, 2);

	}
}