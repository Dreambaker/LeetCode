import structObs.ListNode;

import java.util.List;

/**
 * 剑指 Offer 24. 反转链表
 */
public class ReverseLinkLiost {
    public  static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode var = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return var;
    }
    public  static ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur =  head;
        ListNode tmp = null;
        while(cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur =tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(5);
        //ListNode res = reverseList(ln);
        ListNode res = reverseList2(ln);
        System.out.println(res.val);
      while(res.next != null) {
          res = res.next;
          System.out.println(res.val);
      }


    }
}
