package FirstSlowPointers;

public class IntersectionPointOfTwoLL {

    public ListNode findIntersectionPointOfLL(ListNode headA, ListNode headB){
        if(headA == null || headB ==null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Traverse both lists
        while(pointerA!= pointerB){
            // Move to the next node or reset to the beginning of the other list
            pointerA = (pointerA==null) ? headB : pointerA.next;
            pointerB = (pointerB==null) ? headA : pointerB.next;
        }
        // Both pointers either meet at the intersection or at null (no intersection)
        return pointerA;
    }
}
