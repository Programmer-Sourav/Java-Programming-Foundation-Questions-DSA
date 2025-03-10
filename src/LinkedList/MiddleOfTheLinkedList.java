package LinkedList;


/***
 * Pattern:
 * We need to find the middle node of a linked list.
 * Approach:
 * Use two pointers: move the slow pointer one step at a time and
 * the fast pointer two steps. When the fast pointer reaches the end,
 * the slow pointer will be at the middle.
 *
 */

class LListNode {
    int val;
    LListNode next;
    LListNode(int data){
        val = data;
        next = null;
    }
}
public class MiddleOfTheLinkedList {
    public LListNode findTheMiddleOfTheLL(LListNode head){
        LListNode slow = head, fast = head;

        while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
        }
        return slow;
    }
}
