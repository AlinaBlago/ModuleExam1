public class BinaryTree {

    TreeNode root;


    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        } else {
            //value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

   public int getHeight(){
        if (root == null) return 0;


        int leftHeight = root.left == null ? 1 : 1 +  root.left.getTreeHeightRecurs() ;
        int rightHeight = root.right == null ? 1 : 1 +  root.right.getTreeHeightRecurs();

        return leftHeight > rightHeight ? leftHeight : rightHeight;
   }
}
