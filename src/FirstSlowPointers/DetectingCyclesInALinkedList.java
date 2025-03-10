package FirstSlowPointers;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
public class DetectingCyclesInALinkedList {
    public static void main(String[] args){
        // Create a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle

        boolean hasCycle = hasCycle(head);
        System.out.println("Cycle detected: " + hasCycle);
    }

    public static boolean hasCycle(ListNode head){
        //if LL has no element or denotes single element
        if(head== null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;  //Move slow pointer by 1 step
            fast = fast.next.next; //Move slow pointer by 2 step

            if(slow == fast){   //Cycle detected
                return true;
            }
        }
      return true;
    }
}
