package ru.lis154;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode current = head;

        while(current!=null) {

            while(current.next!=null &&  current.val ==current.next.val) {
                current = current.next;
            }

            if(pre.next == current) {
                pre = pre.next;
            }
            else {
                pre.next = current.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
