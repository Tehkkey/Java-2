/*
 * Kyle Sanchez
 * 12/6/2019
 * This is an IntTree class containing multiple methods for
 * reporting data of Binary Trees
 * 
 */

public class IntTree {
	
	// one instance variable
	private IntTreeNode overallRoot;
	
	//create an IntTree constructor that initializes the overallRoot
	public IntTree(IntTreeNode root)
	{
		overallRoot = root;
	}
	
	// print the tree in PreOrder
	 public void printPreOrder()
	 {
		 //call a recursive method
		 preOrder(overallRoot);
	 }
	
	 private void preOrder(IntTreeNode root)
	 {
		 // base case
		 if(root == null)
		 {
			 return;
		 }
		 //print root's data
		 System.out.print(root.data + " ");
		 // recurse left
		 preOrder(root.left);
		 //recurse right
		 preOrder(root.right);
		 
		 
	 }
	 // in order tree traversal
	 public void inOrder() {
		 inOrder(overallRoot);
	 }
	 private void inOrder(IntTreeNode root) {
		 if(root == null) {
			 return;
		 }else {
			 inOrder(root.left);
			 System.out.print(root.data + " ");
			 inOrder(root.right);
			
		 }
	 }
	 public void postOrder()
	 {
		 //call a recursive method
		 postOrder(overallRoot);
	 }
	
	 private void postOrder(IntTreeNode root)
	 {
		 // base case
		 if(root == null)
		 {
			 return;
		 }
		 // recurse left
		 postOrder(root.left);
		 //recurse right
		 postOrder(root.right);
		//print root's data
		 System.out.print(root.data + " ");
		 
		 
	 }
	 //set pattern pass in the topmost node in the tree
	 // overallRoot
	 public int getNumLevels()
	 {
		 return getNumLevels(overallRoot);
	 }
	 private int getNumLevels(IntTreeNode current)
	 {
		 //base case
		 if(current == null)
		 {
			 return 0;
		 }
		 int thisLevel = 1;
		 // recurse left
		 int leftLevel = getNumLevels(current.left);
		 // recurse right
		 int rightLevel = getNumLevels(current.right);
		 if(leftLevel > rightLevel)
			 return thisLevel + leftLevel;
		 else
			 return thisLevel + rightLevel;
	 }
	 
	 // make public private pair
	 public int sumAll()
	 {
		 return sumAll(overallRoot);
	 }
	 
	 private int sumAll(IntTreeNode current)
	 {
		 // base case
		 if(current == null)
			 return 0;
		 int thisSum = current.data;
		 int leftSum = sumAll(current.left);
		 int rightSum = sumAll(current.right);
		 
		 return thisSum+ leftSum + rightSum;
	 }
	 
	 public int numNodes()
	 {
		 return numNodes(overallRoot);
	 }

	private int numNodes(IntTreeNode root){
				if (root == null) {
					return 0;
				}else {
					return 1 + numNodes(root.left) + numNodes(root.right);
				}
		 }



}