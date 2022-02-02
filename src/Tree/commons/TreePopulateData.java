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

    public TreeNode populateKTreeData() {

        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode head = new TreeNode(1,node2, null);

        return head;
    }


    /*
       Tree structure of this kind will be populated
          20
        /  \
        2   13
       / \  / \
       4  -2 6  7

     */
    public TreeNode populateSumChildTreeData() {
        TreeNode node7 = new TreeNode(7,null, null );
        TreeNode node6 = new TreeNode(6,null, null );
        TreeNode node5 = new TreeNode(-2,null, null );
        TreeNode node4 = new TreeNode(6, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(13, node6, node7);
        TreeNode head = new TreeNode(30,node2, node3);

        return head;
    }

    /*
       Tree structure of this kind will be populated
          1
        /  \
        2   2
       / \  / \
       4  5 4  5

     */
    public TreeNode populateMirrorTreeData() {
        TreeNode node8 = new TreeNode(8,null, null );
        TreeNode node7 = new TreeNode(5,node8, null );
        TreeNode node6 = new TreeNode(4,null, null );
        TreeNode node5 = new TreeNode(5,null, null );
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(2, node6, node7);
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
       // TreeNode node10 = new TreeNode(10, null, null);
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


    /*
       Tree structure of this kind will be populated

     */
    public TreeNode populateOneSidedTree() {

        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node7 = new TreeNode(7,null, null );
        TreeNode node6 = new TreeNode(6,null, null );
        TreeNode node5 = new TreeNode(5,node7, node8 );
        TreeNode node4 = new TreeNode(4, node5, node6);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, node4);
        TreeNode head = new TreeNode(1,node2, null);

        return head;
    }


}
