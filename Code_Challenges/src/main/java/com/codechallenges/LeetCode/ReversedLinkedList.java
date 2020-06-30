package com.codechallenges.LeetCode;


import java.util.Stack;

public class ReversedLinkedList {


      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseList(ListNode head) {
        ListNode output = new ListNode();
        Stack<ListNode> temp = new Stack<>();

        while(head != null){
            temp.push(head);
            head = head.next;
        }

        output = temp.pop();
        ListNode current;
        while(!temp.empty()){
            output.next = temp.pop();
            current = output.next;
            output = current;
        }
        return output;
    }
}
