import structObs.TreeNode;

/**
 * 面试题27. 二叉树的镜像
 */
public class InvertBTree {
    public TreeNode mirrorTree(TreeNode root) {
         if(root !=null) {
             TreeNode tmp = root.left;
             root.left = root.right;
             root.right = tmp;
             mirrorTree(root.left);
             mirrorTree(root.right);
         }

         return root;
    }
}
