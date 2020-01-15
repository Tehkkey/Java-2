// TreeTester file - purpose is to create binary trees
public class TreeTester
{

    public static void main(String[] args)
    {
        // instantiate an IntTreeNode that is the overallRoot
        // and has data = 12
        IntTreeNode overallRoot = new IntTreeNode(12);
        // create left child that has 7
        overallRoot.left = new IntTreeNode(7);
        // create right child that has 19
        overallRoot.right = new IntTreeNode(19);
        overallRoot.left.left = new IntTreeNode(3);      
        overallRoot.right.left = new IntTreeNode(16);
        overallRoot.right.right = new IntTreeNode(20);
        overallRoot.right.right.right = new IntTreeNode(22);
        
       
        // construct an IntTree and pass in the overallRoot
        IntTree tree = new IntTree(overallRoot);
        // uncomment to test tree.countEvenNodes()
        System.out.println(tree.countEvenNodes());
     }






}