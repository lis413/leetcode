package ru.lis154;

import java.util.List;

public class DeleteDuplicates {


    //  Definition for singly-linked list.


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode l2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        //deleteDuplicates(l1);
        deleteDuplicates(l2);
    }
        public static ListNode deleteDuplicates(ListNode head) {
            ListNode l1 = head;
            if (head == null) return null;
            while (head.next != null){
                if (head.next.val == head.val){
                        head.next = head.next.next;
                } else {
                    head = head.next;
                }
            }
            return l1;
        }

}

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
