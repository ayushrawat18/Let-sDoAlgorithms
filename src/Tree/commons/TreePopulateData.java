package Tree.commons;

public class TreePopulateData {

    /*
       Tree structure of this kind will be populated
          1
        /  \
        2   3
       / \  / \
       4  5 6  7

     */
    public TreeNode populateTreeData() {
        TreeNode node7 = new TreeNode(7,null, null );
        TreeNode node6 = new TreeNode(6,null, null );
        TreeNode node5 = new TreeNode(5,null, null );
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode head = new TreeNode(1,node2, node3);

        return head;
    }


    /*
       Tree structure of this kind will be populated
          1
        /  \
        2    3
       / \  /  \
       4  5 6   7
          \     /
           9    8
     */
    public TreeNode populateUnBalancedTreeData() {
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node7 = new TreeNode(7,node8, null );
        TreeNode node6 = new TreeNode(6,null, null );
        TreeNode node5 = new TreeNode(5,null, node9 );
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode head = new TreeNode(1,node2, node3);

        return head;
    }


}
