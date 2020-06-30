package com.codechallenges.HackerRank;

public class HeightBinaryTree {
    class Node {
        int data;
        Node left;
        Node right;

    }

    public static int height(Node root) {

        if(root.left == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
