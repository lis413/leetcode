package ru.lis154;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode newList = null;
        while (head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = newList;
            newList = temp;
        }
        return newList;

    }

}
