package ru.lis154;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode node7 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))))));
        System.out.println(removeElements(node, 6));
        System.out.println(removeElements(node7, 7));
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode t = head;
        ListNode s = head;
        while(s != null){
            if (s.val == val){
                s = s.next;
            } else {
                t = s;
                break;
            }
        }
        if (s == null) return null;
        while (head.next != null){
            if (head.val == val) {
                head = head.next;
            } else if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return t;
    }
}
