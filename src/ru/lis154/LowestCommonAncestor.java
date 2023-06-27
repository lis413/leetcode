package ru.lis154;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
//        List<TreeNode> queue1 = getQueue(root, p);1
//        List<TreeNode> queue2 = getQueue(root, q);
//        for (int i = queue1.size()-1; i >= 0; i--){
//            for (int j = queue1.size()-1; j >= 0; j--){
//                if (queue2.get(j) == queue1.get(i)) return t1;
//            }
//        }
        return root;
    }

    // поиск элемента
    private static List<TreeNode> getQueue(TreeNode root, TreeNode p){
        List<TreeNode> list = new ArrayList<>();
        if (root.val == p.val) {
            list.add(root);
        }
        if (p.val > root.val && root.right != null){
            getQueue(root.right, p);
        } else if (root.left != null){
            getQueue(root.left, p);
        }
        return list;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {val = x;}
    }
}
