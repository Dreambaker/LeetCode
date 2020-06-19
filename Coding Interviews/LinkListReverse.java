import structObs.ListNode;
import structObs.TreeNode;

import java.util.Stack;

public class LinkListReverse {

        public int[] reversePrint(ListNode head) {
            if(head == null)
                return new int[0];
            Stack<ListNode> st = new Stack();
            st.push(head);
            while(head.next!=null){
                st.push(head.next);
                head = head.next;
            }
            int size = st.size();
            int[] res = new int[size];
            for (int i = 0; i < size; i++) {
                res[i] = st.pop().val;
            }
            return res;
        }
}
