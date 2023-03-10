package ru.lis154;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNodeR = new ListNode();

        while (list1 != null || list2 != null){
            if (list1.val <= list2.val){
                listNodeR.val= list1.val;
                list1 = list1.next;
            } else {
                listNodeR.val = list2.val;
                list2 = list2.next;
            }
        }
        if (list1 == null){
            listNodeR.next = list2;
        } else {listNodeR = list1;}
        return listNodeR;
    }


    public class ListNode {
      int val;
    ListNode next;
      ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
