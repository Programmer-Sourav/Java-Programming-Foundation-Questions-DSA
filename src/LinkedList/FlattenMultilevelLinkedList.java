package LinkedList;

//Flatten a multilevel linked list using level order traversal
/**
Given a linked list where in addition to the next pointer,
each node has a child pointer, which may or may not point
to a separate list. These child lists may have one or more
children of their own to produce a multilevel linked list.
Given the head of the first level of the list. The task is to
flatten the list so that all the nodes appear in a single-level
linked list. Flatten the list in a way that all nodes at the first
level should come first, then nodes of the second level, and so on.

 1->4->6
 |
 2->5->7
 |
 3->8
Output: 1->4->6->2->5->7->3->8
Explanation: The multilevel linked list is flattened as it has no child pointers.
*/

import java.util.LinkedList;

/**
 * Approach:
 * head = 1 (1,4,6) re-initialize to 1 check if it has a child node, set the child node as head, (2)
 * head = 2 (2,5,7), head = 2, then 3
 * head = 3 (3,8)
 */

class LinkedListNode{
    int data;
    LinkedListNode next;
    LinkedListNode child;

    LinkedListNode(){};
    LinkedListNode(int data){
        this.data = data;
        this.next = null;
        this.child = null;

    }
}
public class FlattenMultilevelLinkedList {
    //traverse
    //reinitialize
    //traverse
    public void flattenLL(LinkedListNode head){
        LinkedListNode temp;
        temp = head;

        while(temp!=null){
             temp = temp.next;
        }
    }
}
