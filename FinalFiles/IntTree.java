public class IntTree 
{
    // one instance variable
    private IntTreeNode overallRoot;
  
    // create an IntTree constructor that initializes the 
    // overallRoot
    public IntTree(IntTreeNode root)
    {
        overallRoot = root;
    
    }
    public int countEvenNodes()
	 {
		 return countEvenNodes(overallRoot);
	 }
	 int count = 0;
	 private int countEvenNodes(IntTreeNode current)
	 {
         
		 // base case
		 if(current == null)
			 return 0;
		 int thisSum = current.data;
       if(thisSum % 2 ==0)
       {
       count++;
		 int leftSum = countEvenNodes(current.left);
		 int rightSum = countEvenNodes(current.right);
       }
		 
		 return count;
	 }

} // end of IntTree