package ru.lis154;

public class MiddleNode {

    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNode5 = new ListNode(0, new ListNode(7, new ListNode(2, new ListNode(6, new ListNode(6
                , new ListNode(8, new ListNode(0, new ListNode(3, new ListNode(
                4, new ListNode(5))))))))));
        System.out.println(middleNode2(listNode5));
        System.out.println(middleNode2(listNode4));
    }

    public static ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        int length = 1;
        ListNode head2 = head;
        while(head2.next != null){
            head2 = head2.next;
            length++;
        }
           int middle = length / 2 + 1;
        int i = 1;
        while (i < middle){
            head = head.next;
            i++;
        }
        return head;
    }
    public static ListNode middleNode2(ListNode head) {
        int i = 0;
        ListNode rez = head;
        while (head != null){
            head = head.next;
            i++;
            if (head != null && i%2 != 0){
                rez = rez.next;
            }
        }
        return rez;
    }

 }
