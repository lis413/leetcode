package ru.lis154;

import java.util.List;

public class PathSum {
    boolean rez = false;
   // Integer summ = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int summ = 0;
        boolean rez = false;
        int sh = 0;
        postorderTraversal(root, targetSum, summ, sh);
        return rez;
    }
    public static boolean postorderTraversal(TreeNode root, int targetSum, int summ, int sh) {
        if (root != null) {
            summ += root.val;
            sh++;
            if (root.left != null) {
                postorderTraversal(root.left, targetSum, summ, sh);
            }
            if (root.right != null) {
                postorderTraversal(root.right, targetSum, summ, sh);
            }
            System.out.println(summ);
            //   if (summ == targetSum && sh != 1) rez = true;
        }
        return false;
    }
}
