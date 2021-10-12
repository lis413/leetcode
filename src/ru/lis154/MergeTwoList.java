package ru.lis154;

public class MergeTwoList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            if (l2 == null){
                return null;
            }
            return l2;
        } else if (l2 == null){
            return l1;
        }


        ListNode listResult;
        if (l1.val < l2.val){
            listResult = l1;
            l1 = l1.next;
        } else {
            listResult = l2;
            l2 = l2.next;
        }

        ListNode listTek = listResult;
        //listResult.next = listTek;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                listTek.next = l1;
                l1 = l1.next;
                listTek = listTek.next;
            } else {
                listTek.next = l2;
                l2 = l2.next;
                listTek = listTek.next;
            }
        }
        if (l1 != null){
            while (l1 != null){
                listTek.next = l1;
                l1 = l1.next;
                listTek = listTek.next;
            }
        } else if (l2 != null){
            while (l2 != null){
                listTek.next = l2;
                l2 = l2.next;
                listTek = listTek.next;
            }
        }
        return listResult;
    }
}
