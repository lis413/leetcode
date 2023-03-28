package ru.lis154;

import java.util.List;

public class MaxDepth {
    int max = 0;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
                new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null)));

        System.out.println(maxDepth(treeNode));
    }
    public static int maxDepth(TreeNode root) {
      return (root == null) ? 0 : 1 + Math.max(maxDepth(root.right), maxDepth(root.left));

    //getListElements(root, 0);
    //return max;
    }

//    private  static void getListElements(TreeNode treeNode, Integer list){
//        int max = 0;
//        if (treeNode == null) return null;
//        list = list+1;
//        if (treeNode.left != null) {
//            getListElements(treeNode.left, list);
//        } else {
//            if (list > max) max = list;
//        }
//        if (treeNode.right != null){
//            getListElements(treeNode.right, list);
//        }  else {
//            if (list > max) max = list;
//        }
//       // return max;
//    }
}
