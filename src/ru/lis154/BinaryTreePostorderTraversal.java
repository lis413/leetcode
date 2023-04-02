package ru.lis154;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    Stack<Integer> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();

//    public List<Integer> postorderTraversal(TreeNode root) {
//        Stack<Integer> st = preorderTraversal(root);
//        List<Integer> list = new ArrayList<>();
//        while(!st.empty()){
//            list.add(st.pop());
//        }
//        return list;
//    }
//    public Stack<Integer> preorderTraversal(TreeNode root) {
//        if (root == null) return stack;
//        stack.push(root.val);
//        if (root.left != null){
//            preorderTraversal(root.left);
//        }
//        if (root.right != null){
//            preorderTraversal(root.right);
//        }
//        return stack;
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                postorderTraversal(root.left);
            }
            if (root.right != null) {
                postorderTraversal(root.right);
            }
            list.add(root.val);
        }

        return list;
    }
}
