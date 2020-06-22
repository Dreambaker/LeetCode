import structObs.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthMaxNode {
    public int kthLargest(TreeNode root, int k) {
       List<Integer>  res= new ArrayList();
       midOrder(root, res);
       return res.get(res.size()-k);
    }
    public void midOrder(TreeNode n , List res){
        if(n.left != null )
            midOrder(n.left, res);
        res.add(n.val);
        if(n.right != null )
            midOrder(n.right, res);
    }
}
