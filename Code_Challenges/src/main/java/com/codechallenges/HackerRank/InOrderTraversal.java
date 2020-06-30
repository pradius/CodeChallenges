package com.codechallenges.HackerRank;


public class InOrderTraversal {

    class Node {
        int data;
        Node left;
        Node right;
    }


    public static void inOrder(Node root) {
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }
    }
}
