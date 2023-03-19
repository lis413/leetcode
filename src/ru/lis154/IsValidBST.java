package ru.lis154;

public class IsValidBST {


    public boolean isValidBST(TreeNode root) {
        boolean left = true;
        if (root.left != null){
            if (root.left.val < root.val){
                isValidBST(root.left);
            } else {
                left =  false;
            }
        }
        boolean right = true;
        if (root.right != null){
            if(root.right.val > root.val){
                isValidBST(root.right);
            } else {
                right = false;
            }
        }
        return left && right;
    }

    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
