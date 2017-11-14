package com.ting.isBST;

import java.util.ArrayList;
import java.util.List;

// Check if a Binary Tree is actually a Binary Search Tree (if the nodes are equal it is not a BST);

public class isBST {

    boolean checkBST(Node root) {

        List<Node> BSTNodes = new ArrayList<>();
        BSTNodes = inOrderTraversal(root);

        for (int i = 0; i < BSTNodes.size() - 1; i++) {
            if (BSTNodes.get(i + 1).data <= BSTNodes.get(i).data) {
                return false;
            }
        }

        return true;

    }


    List<Node> inOrderTraversal(Node root) {

        List<Node> inOrderNode = new ArrayList<Node>();

        if (root == null) {
            return inOrderNode;
        }

        inOrderNode.addAll(inOrderTraversal(root.left));
        inOrderNode.add(root);

        inOrderNode.addAll(inOrderTraversal(root.right));

        return inOrderNode;

    }

    public static void main(String[] args) {

    }



}
