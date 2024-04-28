package dataStructures.o5_BinaryTree.easy;

import java.util.Arrays;

public class BinaryTree {
    Node root;

    BinaryTree(){}

    BinaryTree(int val){
        root = new Node(val);
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();

        bt.insert(20);
        bt.insert(40);
        bt.insert(18);
        bt.insert(60);
        bt.insert(80);



    }

    public Node insert(int n){
       return insert(n, root);
    }



    public Node insert(int n, Node node){
        if (node == null) {
          Node nd =  new Node(n);
          if (root == null)
              root = nd;

          return nd;
        }
        else if (n < node.data)
           node.leftChild =  insert(n, node.leftChild);
        else
           node.rightChild = insert(n, node.rightChild);

        return node;
    }

    public class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(){}
        Node(int val){
            this.data = val;
        }
        Node(int val, Node left, Node right){
            this.data = val;
            this.leftChild = left;
            this.rightChild = right;
        }
    }

}


