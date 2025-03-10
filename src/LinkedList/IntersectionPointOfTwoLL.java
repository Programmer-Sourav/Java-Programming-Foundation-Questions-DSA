package LinkedList;

/**
 *
 * Pattern:
 * We need to find the node where two linked lists intersect.
 * Approach:
 * Use two pointers. Traverse both lists. When a pointer reaches the end,
 * switch it to the head of the other list. If there is an intersection,
 * they will meet at the intersection node.
 *
 *
 *
 */

class LIListNode{
    int value;
    LIListNode next;

    LIListNode(int data){
       value = data;
       next = null;
    }
}
public class IntersectionPointOfTwoLL {
   public LIListNode getIntersectionListNode(LIListNode headA, LIListNode headB){
       LIListNode a = headA;
       LIListNode b = headB;

       while(a!=b){
           a = a== null ? headB : a.next;
           b = b== null ? headA : b.next;
       }
       return a; // Intersection node or null
   }

}
