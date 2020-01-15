
public class TreeTester {

	public static void main(String[] args) 
	{
		// instantiate an IntTreeNode that is the overall root
		// and has data = 4
		
		IntTreeNode overallRoot = new IntTreeNode(90);
		// create left child that has two
		overallRoot.left = new IntTreeNode(80);
		// create right child that has 5
		overallRoot.right = new IntTreeNode(100); 
		//add in the left grandchild
		overallRoot.left.left = new IntTreeNode(70);
		//add in the left, right grandchild
		overallRoot.left.right = new IntTreeNode(85);
		//add a right left child
		overallRoot.right.left = new IntTreeNode(98);
		// add a right right child
		overallRoot.right.right = new IntTreeNode(120);
		
		
		
		// construct an IntTree and pass in the overallRoot
		IntTree tree = new IntTree(overallRoot);
		
		//call inOrderList
		System.out.print("In Order: ");
		// call inOrder
		tree.inOrder();
		System.out.println();
		
		//call Pre order
		System.out.print("Pre order: ");
		// call printPreOrder
		tree.printPreOrder();
		System.out.println();
		
		//call postOrder
		System.out.print("Post Order: ");
		// call postOrder
		tree.postOrder();
		System.out.println();
		
		// call numNodes
		System.out.println("numNodes: "+ tree.numNodes());
		// call getNumLevels
		System.out.println("Levels: " + tree.getNumLevels());
		//call sumAll
		System.out.println("Sum of all node data: " + tree.sumAll());
		
		
		

	}

}
