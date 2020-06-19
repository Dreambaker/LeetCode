import structObs.ListNode;

/**
 * 面试题22. 链表中倒数第k个节点
 */
public class getKthFromEndList {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        //双指针，使两个指针之间相差k
        ListNode fast = head;
        ListNode low =head;
        for (int i = 1; i < k ; i++) {
            fast = fast.next;
        }
        while(fast.next !=null) {
            fast = fast.next;
            low = low.next;
        }
        return low;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n.next =  new ListNode(2);
        n.next.next =  new ListNode(3);
        n.next.next.next =  new ListNode(4);
        n.next.next.next.next =  new ListNode(5);
        System.out.println(getKthFromEnd(n, 2).val);
    }
}
