package com.codechallenges.LeetCode;


import java.util.Stack;

public class ReversedLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode output = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = output;
            output = head;
            head = next;
        }

        return output;
    }

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        current = head;

        while (current != null) {
            if (current.val != stack.pop().val) return false;
            current = current.next;
        }
        return true;
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
