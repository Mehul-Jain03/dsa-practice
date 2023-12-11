package tree;

public class HeightOfBT {
	
	
	public int calcHeight(Node root) {
		if(root==null) {
			return 0;
		}
		
		return Math.max(calcHeight(root.left), calcHeight(root.right))+1;
	}

	public static void main(String[] args) {
		
		
					//   10

			//      20       30

			//    40   50  60    70
		    //                       90

		//Ans : 4

				Node root =      new Node(10);
				root.left =      new Node(20);
				root.right =     new Node(30);
				root.left.left = new Node(40);
				root.left.right = new Node(50);
				root.right.left = new Node(60);
				root.right.right = new Node(70);
				root.right.right.right = new Node(90);

				HeightOfBT ht = new HeightOfBT();
				System.out.println("Height Of this tree is ----> "+ht.calcHeight(root));
    }
	
}