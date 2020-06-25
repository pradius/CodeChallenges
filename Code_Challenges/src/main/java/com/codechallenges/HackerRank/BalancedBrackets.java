package com.codechallenges.HackerRank;

import java.util.Stack;

public class BalancedBrackets {

    private static String isBalanced(String s) {
        if(s.isEmpty() || s == "") return "NO";
        Stack<Character> stack = new Stack<>();

            if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']'){
                return "NO";
            }
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '{'){
                    stack.push('}');
                }
                else if(s.charAt(i) == '('){
                    stack.push(')');
                }
                else if(s.charAt(i) == '['){
                    stack.push(']');
                }
                else{
                    if(!stack.empty() && stack.peek() == s.charAt(i)){
                        stack.pop();
                    }
                    else {
                        return "NO";
                    }
                }
            }
        return stack.empty() ? "YES" : "NO";
    }


    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println("Expected YES: - " + isBalanced(s));

        String s0 = "[]]";
        System.out.println("Expected NO: - " + isBalanced(s0));

        String s1 = "{[(])}";
        System.out.println("Expected NO: - " + isBalanced(s1));

        String s2 = "{{[[(())]]}}";
        System.out.println("Expected YES: - " + isBalanced(s2));

        String s3 = "[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}](({[{[{)]{)}}}({[)}}([{{]]({{";
        System.out.println("Expected NO: - " + isBalanced(s3));

        String s4 = "[]]";
        System.out.println("Expected NO: - " + isBalanced(s4));
    }


}
