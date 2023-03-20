package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    List<List<Integer>> list = new ArrayList<>();
    int i = 0;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (i == 0){
            List<Integer> listRoot = new ArrayList<>();
            listRoot.add(root.val);
            list.add(listRoot);
            i++;
        }
        List<Integer> listRoot = new ArrayList<>();
        if (root.left != null) listRoot.add(root.left.val);
        if (root.right != null) listRoot.add(root.right.val);
        list.add(listRoot);
        if (root.left != null) {
            levelOrder(root.left);
        }
        if (root.right != null) {
            levelOrder(root.right);
        }
       return list;
    }

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
    }

}
