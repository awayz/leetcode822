package mergeTwoLists21;

public class SolutionOne implements Solution {
    
    @Override
    public ListNode mergeTwoLists (ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode current = new ListNode();
        ListNode head = current;
        while (c1 != null && c2 != null) {
            if (c1.val > c2.val) {
                current = merge(current, c2.val);
                c2 = c2.next;
            } else {
                current = merge(current, c1.val);
                c1 = c1.next;
            }
        }
        
        while (c1 != null) {
            current = merge(current, c1.val);
            c1 = c1.next;
        }
        
        while (c2 != null) {
            current = merge(current, c2.val);
            c2 = c2.next;
        }
        return head.next;
    }
    
    private ListNode merge (ListNode current, int val) {
        current.next = new ListNode(val);
        return current.next;
    }
}