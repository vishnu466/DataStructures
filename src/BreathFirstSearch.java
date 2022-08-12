public class BreathFirstSearch {
	Node root;
	public  BreathFirstSearch() {
		root = null;
	}
	
//	void printLevelOrder() {
//		int h = getTotalLevel(root);	
//		int i;
//		for(i=0;i<h;i++) {
//			printGivenLevel(root,i);
//		}
//	}
//	
//	public int getTotalLevel(Node node) {
//		if(node == null) {
//			return 0;
//		}
//		else {
//			return 1 + 
//			Math.max(getTotalLevel(node.left), getTotalLevel(node.right));
//			
//		}
//	}
//	
//	void printGivenLevel(Node root,int level) {
//		if(root == null) {
//			return;
//		}
//		if(level == 0) {
//			System.out.print(root.data + " ");
//		}
//		else if(level > 0 ) {
//			
//			printGivenLevel(root.left, level-1);
//			
//			printGivenLevel(root.right, level-1);
//		}
//	}
	
	void preOrder() {
		preOrderHelper(root);
	}
	void preOrderHelper(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preOrderHelper(root.left);
			preOrderHelper(root.right);
		}
	}

	void inorder() {
		inOrderHelper(root);
	}
	void inOrderHelper(Node root) {
		if(root != null) {
			inOrderHelper(root.left);
			System.out.print(root.data + " ");
			inOrderHelper(root.right);
		}
		
	}
	void postOrder() {
		postOrderHelper(root);
	}
	void postOrderHelper(Node root) {
		if(root != null) {
			postOrderHelper(root.left);
			postOrderHelper(root.right);
			System.out.print(root.data + " ");
		}
	}	
	public static void main(String[] args) {
		/*
		 		1
		 	/		\
		   2		 3
		  /  \		/  \
		 4	  5    6    7
		  
		 */
		BreathFirstSearch tree = new BreathFirstSearch();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
//		System.out.println("BFS traversal of tree is : ");
//		
//		tree.printLevelOrder();
//		System.out.println();
		System.out.println("PreOrder traversal(Root--Left--Right==>)  : ");
		tree.preOrder();
		System.out.println();
		System.out.println("InOrder traversal(Left--Root--Right==>)   : ");
		tree.inorder();
		System.out.println();
		System.out.println("PostOrder traversal(Left--Right--Root==>) : ");
		tree.postOrder();
		
	}

}
