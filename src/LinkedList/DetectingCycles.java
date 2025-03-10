package LinkedList;

/***
 * Problem Category is
 * Slow Pointer and Fast Pointer
 *
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class DetectingCycles {
    public boolean hasCycles(ListNode head){
        ListNode slow = head, fast= head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return  true;
            }
        }
        return false;
    }
}
