package ru.lis154;

public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;

//        if (head.next == null) return null;
//        ListNode head2 = head;
//        while (head.next != null){
//            head = head.next;
//            while (head2.next != null){
//                if (head.next == head2){
//                    return head2;
//                }
//                head2 = head2.next;
//            }
//        }
//        return null;
    }
     class ListNode {
         int val;
          ListNode next;
         ListNode(int x) {
              val = x;
             next = null;
          }
      }

}
