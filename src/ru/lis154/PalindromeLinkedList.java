package ru.lis154;

import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        if (head == null || head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.add(head.val);
            head = head.next;
        }
        while(start != null){
            if (start.val != stack.pop()){
                return false;
            }
            start = start.next;
        }
        return true;
    }
}
