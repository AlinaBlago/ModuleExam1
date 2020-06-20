public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

    public int getTreeHeightRecurs() {
        int rightHeight = 0;
        if(right != null){
            rightHeight = 1 + right.getTreeHeightRecurs();
        }

        int leftHeight = 0;
        if(left != null){
            leftHeight = 1 + left.getTreeHeightRecurs();
        }

        if(rightHeight == 0 && leftHeight == 0) return 1;

        return rightHeight > leftHeight ? rightHeight : leftHeight;
    }
 }
