package com.codechallenges.LeetCode;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Integer min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MIN_VALUE;
    }

    public void push(int x) {
        stack.push(x);
        if(min == Integer.MIN_VALUE){
            min = x;
        }
        else if(x < min){
            min = x;
        }
    }

    public void pop() {
        stack.pop();
        calculateMin();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    private void calculateMin(){
        min = Integer.MAX_VALUE;
        for(int n : stack){
            if(n < min){
                min = n;
            }
        }
    }
}