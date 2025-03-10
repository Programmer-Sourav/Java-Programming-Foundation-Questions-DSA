package LinkedList;

/***
 *
 * Pattern:
 * We need to find the k-th node from the end of a linked list.
 * Approach:
 * Use two pointers. Move one pointer k steps ahead, then move both pointers simultaneously.
 * When the fast pointer reaches the end, the slow pointer will be at the k-th to last element.
 *
 */
class LLIListNode{
    int val;
    LLIListNode next;

    LLIListNode(int data){
        val = data;
        next = null;
    }
}
public class KthItemToTheLastOfLinkedList {
    private static LLIListNode getTheKthToTheLastNode(LLIListNode head, int k) {
        LLIListNode slow = head;
        LLIListNode fast = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) return null; // Edge case: k is greater than the length of the list
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow; // slow now points to the kth to last node
    }

}
