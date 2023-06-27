package ru.lis154;

public class InvertBinaryTree {

    TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        TreeNode t = root;
        recInvert(root);
        return t;
    }
    void recInvert(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);
    }

}
