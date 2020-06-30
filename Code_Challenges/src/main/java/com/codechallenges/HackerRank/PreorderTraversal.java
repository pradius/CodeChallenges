package com.codechallenges.HackerRank;

public class PreorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }


    public static void preOrder(Node root) {
        System.out.print(root.data + " "); // PreOrder
        if(root != null) {
            if (root.left != null) {
                preOrder(root.left);
            }
            if (root.right != null) {
                preOrder(root.right);
            }
        }
        System.out.print(root.data + " "); // Post Order
    }
}

/** PostOrder Traversal : 4 3 6 5 2 1 Bottom Up
/*
            1
             \
              2
               \
                5
              /   \
             3     6
              \
               4
*/

/** PreOrder Traversal : 1 2 5 3 4 6  Top Bottom
/*
            1
             \
              2
               \
                5
              /   \
             3     6
            /
           4
**/
