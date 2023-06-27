package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {

        recursion(root, "");
        return list;
    }

    private void recursion(TreeNode root, String str){
        if (root == null) return;
        if (root.left == null && root.right == null){
            list.add(str + root.val);
        }
        str = str + root.val + "->";
        if (root.left != null) {
            recursion(root.left, str);
        }
        if (root.right != null) {
            recursion(root.right, str);
        }
    }
}
