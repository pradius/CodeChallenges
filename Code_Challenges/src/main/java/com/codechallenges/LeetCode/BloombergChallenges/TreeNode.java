package com.codechallenges.LeetCode.BloombergChallenges;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public int sumOfLeftLeaves(TreeNode root) {
        if (root != null) {
            sumOfLeftLeaves(root.left);
            sumOfLeftLeaves(root.right.left);
        }
        int sum = root.val;
        return sum;
    }

}
