package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
                new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null)));

        System.out.println(isSymmetric(treeNode));
    }

    private static boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return  true;
        return isMirror(root.left, root.right);
    }





        public static boolean isSymmetric2(TreeNode root) {
            if(root.left == null & root.right == null) return true;
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            getListElements(root.left, list1);
            getListElements2(root.right, list2);
            return list1.equals(list2);

        }

        private  static List<Integer> getListElements(TreeNode treeNode, List<Integer> list){
            if (treeNode == null) return null;
            list.add(treeNode.val);
            if (treeNode.left != null) {
                getListElements(treeNode.left, list);
            } else {
                list.add(null);
            }
            if (treeNode.right != null){
                getListElements(treeNode.right, list);
            }  else {
                list.add(null);
            }
            return list;
        }
    private static List<Integer> getListElements2(TreeNode treeNode, List<Integer> list){
        if (treeNode == null) return null;
        list.add(treeNode.val);
        if (treeNode.right != null) {
            getListElements2(treeNode.right, list);
        }  else {
            list.add(null);
        }
        if (treeNode.left != null) {
            getListElements2(treeNode.left, list);
        }
        else {
            list.add(null);
        }
        return list;
    }

}
