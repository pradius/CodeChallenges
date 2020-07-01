package com.codechallenges.LeetCode;

import java.util.Collections;
import java.util.LinkedList;


class MaxStack {

    LinkedList<Integer> stack;
    Integer max;

    /**
     * initialize your data structure here.
     */
    public MaxStack() {
        stack = new LinkedList<>();
        max = Integer.MIN_VALUE;
    }

    public void push(int x) {
        stack.push(x);
        if ( x > max) {
            max = x;
        }
    }

    public int pop() {
        int temp = stack.pop();
        calculateMax();
        return temp;
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return max;
    }

    public int popMax() {
        int output = max;
        stack.remove(max);
        calculateMax();
        return output;
    }

    private void calculateMax(){
        LinkedList temp = new LinkedList(stack);
        Collections.sort(temp);
        if(!temp.isEmpty()){
            max = (int)temp.get(temp.size() - 1);
        }
        else{
            max = Integer.MIN_VALUE;
        }
    }
}
