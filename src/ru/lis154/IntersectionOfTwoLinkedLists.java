package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list1 = new ArrayList<>();
        ListNode l1 = headA;
        while(l1 != null){
            list1.add(l1);
            l1 = l1.next;
        }
        while (headB != null){
            if (list1.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
