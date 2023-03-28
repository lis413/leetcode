package ru.lis154;

public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        int max= maxDepth(root);
        int min = minDepth(root);
        if (max > 2 && (root.right == null || root.left == null)) return false;
        if (max-min <= 1) return true;
        return false;
    }




    public static int maxDepth(TreeNode root) {
        return (root == null) ? 0 : 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }

    public static int minDepth(TreeNode root) {
        return (root == null) ? 0 : 1 + Math.min(minDepth(root.right), minDepth(root.left));
    }
}
