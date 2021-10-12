package ru.lis154;

public class MergeTree {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        else if (root1 == null) return root2;
        else if (root2 == null) return root1;
        return new TreeNode(root1.val + root2.val, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right));
    }

    public Node connect(Node root) {
        if (root == null) return root;
        if(root.left != null) root.left.next = root.right;
                if (root.next != null && root.right != null) root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }
}
