package ru.lis154;

public class reverseList {

    public ListNode reverseList(ListNode head) {
        ListNode ll = null;
        ListNode l = null;
        while (head != null){
            if (l == null){
                l = new ListNode(head.val);
            } else {
                l = new ListNode(head.val, l);
            }
            ll = l;
            head = head.next;
        }
        return l;
    }


      public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
