package tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class PrintBottomViewOfTree {
	
	
	public void bottomView(Node root) {
		if(root==null) {
			return;
		}
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int ht = temp.height;
			map.put(ht,temp.data);
			
			if(temp.left!=null) {
				temp.left.height = ht-1;
				q.add(temp.left);
			}
			if(temp.right!=null) {
				temp.right.height = ht+1;
				q.add(temp.right);
			}
		}
		System.out.println(map.values());
		
	}

	public static void main(String[] args) {
		

        //          10
       //      20       30
      //    40   50        70
     //   80    
    // ANS : 80, 40, 20, 50, 30, 70

	Node root = new Node(10);
	root.left = new Node(20);
	root.right = new Node(30);
	root.left.left = new Node(40);
	root.left.right = new Node(50);
	root.right.right = new Node(70);
	root.left.left.left = new Node(80);

	PrintBottomViewOfTree pt = new PrintBottomViewOfTree();
	pt.bottomView(root);

} 
}
