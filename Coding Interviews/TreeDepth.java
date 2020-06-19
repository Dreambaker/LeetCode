import structObs.TreeNode;

public class TreeDepth {
    /**
     * 面试题55 - I. 二叉树的深度
     */
    public static int maxDepth(TreeNode root) {
        return search(root, 0);
        //return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    public static int search(TreeNode root, int depth){
        if(root !=null){
            depth++;
            depth = Math.max(search(root.left, depth), search(root.right, depth));
        }
        return depth;

    }


    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(4);
        tn.right.right = new TreeNode(5);
        System.out.println(maxDepth(tn));
    }

}
