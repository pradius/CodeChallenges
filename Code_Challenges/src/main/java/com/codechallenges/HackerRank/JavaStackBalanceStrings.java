package com.codechallenges.HackerRank;

import java.util.Stack;

public class JavaStackBalanceStrings {

    private static boolean isBalanced(String[] str) {
        Stack<Character> stack = new Stack<>();

        for(String s :  str){
            if(s.charAt(0) == '}' || s.charAt(0) == ')'){
                return false;
            }
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '{'){
                    stack.push('}');
                }
                else if(s.charAt(i) == '('){
                    stack.push(')');
                }
                else{
                    if(stack.peek() == s.charAt(i)){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }


    public static void main(String[] args) {
        String[] s = {"{}()", "{()}", "({()})"};
        System.out.println("Expected True: - " + isBalanced(s));

        String[] s1 = {"{}(", "({)}", "((", "}{"};
        System.out.println("Expected False: - " + isBalanced(s1));

        String test = "Test";
        System.out.println(test.substring(0,1));
    }


}
