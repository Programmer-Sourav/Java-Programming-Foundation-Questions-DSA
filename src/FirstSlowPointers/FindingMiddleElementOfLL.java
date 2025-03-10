package FirstSlowPointers;

public class FindingMiddleElementOfLL {

    //1->2->3->4->5
    public int findMiddleElement(ListNode head){
        if(head==null || head.next==null){
            return 0;
        }
        ListNode slow = head;
        ListNode fast = head;
        int middleData;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        middleData = slow.data;
        return middleData;
    }
}
