package dataStructures.o5_BinaryTree.medium;

import dataStructures.o5_BinaryTree.easy.BinaryTree;

import java.util.*;

public class BFS {
    TreeNode root;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int i) {
            this.val = i;
        }

        TreeNode(int i, TreeNode left, TreeNode right) {
            this.val = i;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode insert(int n) {
        return insert(n, root);
    }

    public TreeNode insert(int n, TreeNode node) {
        if (node == null) {
            TreeNode nd = new TreeNode(n);
            if (root == null)
                root = nd;

            return nd;
        } else if (n < node.val)
            node.left = insert(n, node.left);
        else
            node.right = insert(n, node.right);

        return node;
    }

    public static void main(String[] args) {
        BFS bt = new BFS();

        bt.insert(40);     //40
        bt.insert(34);   // 34   45
        bt.insert(45); //20          60
        bt.insert(20); //  22             66
        bt.insert(60); //                     80
        bt.insert(22);
        bt.insert(66);
        bt.insert(80);

        bt.levelOrderTraversal();
    }

    public List<List<Integer>> levelOrderTraversal(){
        List<List<Integer>> ls;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()){
            TreeNode n = q.remove();
            //System.out.println(n.val);
            List<Integer> ls2 = new ArrayList<>();
            
            ls.add(new ArrayList<Integer>())
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }

    }
}
