

//create a TreeNode INNER class - similar to ListNode
public class IntTreeNode {

	// 3 instance variables
	public int data;
	public IntTreeNode left;
	public IntTreeNode right;
	
	// 3 constructors
	
	// default constructor
	public IntTreeNode()
	{
		this(0, null, null);
	}
	// 1 parameter constructor
	public IntTreeNode (int data)
	{
		this(data, null, null); 
	}
	public IntTreeNode (int data, IntTreeNode left, IntTreeNode right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
		
	}

	}