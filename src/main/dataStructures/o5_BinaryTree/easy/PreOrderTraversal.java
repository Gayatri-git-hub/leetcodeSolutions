package dataStructures.o5_BinaryTree.easy;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    TreeNode root;

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

    List<Integer> lst = new ArrayList<>();
    List<List<Integer>> l2 = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if (root != null) {

           // System.out.println(root.val);
            lst.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return lst;
    }

    public TreeNode insert(int n){
       return insert(n, root);
    }

    public TreeNode insert(int n, TreeNode node){
        if (node == null) {
            TreeNode nd =  new TreeNode(n);
            if (root == null)
                root = nd;

            return nd;
        }
        else if (n < node.val)
            node.left =  insert(n, node.left);
        else
            node.right = insert(n, node.right);

        return node;
    }

}
