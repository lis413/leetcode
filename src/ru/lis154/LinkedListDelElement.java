package ru.lis154;

import org.w3c.dom.ls.LSException;

public class LinkedListDelElement {

    public static void main(String[] args) {
       // ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode listNode4 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNode5 = new ListNode(0, new ListNode(7, new ListNode(2, new ListNode(6, new ListNode(6
                                    , new ListNode(8, new ListNode(0, new ListNode(3, new ListNode(
                                    4, new ListNode(5))))))))));
//        ListNode listNode2 = new ListNode(1, new ListNode(2));
//        ListNode listNode3 = new ListNode(1);
//
//        System.out.println(removeLastN(listNode, 2));
//        System.out.println(removeLastN(listNode2, 1));
//        System.out.println(removeLastN(listNode3, 1));
//        System.out.println(removeLastN(listNode4, 2));

        System.out.println(swapPairs(listNode5));
    }

    public static ListNode removeLastN(ListNode head, int n) {
        ListNode head2 = head;
        int i = 1;
        while (head2.next != null) {
            i++;
            head2 = head2.next;
        }
        if (n > i) {
            return head;
        }
        if (n < i) {
            ListNode node = head;
            ListNode preNode = head;
            //System.out.println(i-n);
            for (int j = 1; j <= i - n; j++) {
                preNode = node;
                node = preNode.next;
            }

            preNode.next = node.next;
            return head;
        }
        if (n == i) {
            return head.next;
        }
        return head;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode head2 = head;
        ListNode node;
        ListNode preNode = head;
        for (int i = 0; i < n; i++) {
            if (head2.next == null) {
                preNode.next = null;
                return head;
            }
            preNode = head2;
            head2 = head2.next;

        }
        if (!(head2.next == null)) {
            node = head2.next;// та, которую удаляем
            head2.next = node.next;
        } else {
            preNode.next = null;
        }
        return head;
    }


    public static ListNode swapPairs(ListNode head) {
        if (head.next == null) {
            return head;
        }
        if (head == null) {
            return null;
        }
        ListNode predNode1 = head;
        ListNode next = head.next;
        predNode1.next = head.next.next;
        next.next = predNode1;
        head = next; // сылка на 1 элементё
        next = null;
        ListNode node = null;
        ListNode changNode = null;
        ListNode afteChangeNode= null;
        while (predNode1.next != null) {
        if (predNode1.next != null) {
            node = predNode1.next;
        } else {
            return head;
        }
        if (node.next != null) {
            changNode = node.next;
        } else {
            return head;
        }
            System.out.println(changNode);
            if (changNode.next != null) afteChangeNode = changNode.next;
             else afteChangeNode = null;// пересмотреть
        predNode1.next = changNode;
        changNode.next = node;
        node.next = afteChangeNode;
        predNode1 = node;
        }
        return head;

    }


    public static ListNode swapPairs2(ListNode head) {
        ListNode t,p;
        int c=0;
        for(t=head;t!=null;t=t.next){
            c=c+1;
        }
        if(c==1){
            return head;
        }
        for(t=head;t!=null && t.next!=null;t=t.next){

            int a=t.val;
            t.val=t.next.val;
            t.next.val=a;
            t=t.next;

        }

        return head;
    }
}
