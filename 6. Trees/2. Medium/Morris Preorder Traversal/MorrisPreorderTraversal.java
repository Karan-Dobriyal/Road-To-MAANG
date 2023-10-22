// Problem Statement: Morris Preorder Traversal of a Binary tree. Given a Binary Tree, find the Morris preorder traversal of Binary Tree.

// Example:


// Output: Preorder Traversal of this binary tree will be:- 1,2,4,5,6,3

// Approach:

// The algorithm can be described as:

// When we are currently at a node, the following cases can arise:

// Case 1: When the current node has no left subtree. In this scenario, there is nothing to be traversed on the left side, so we simply print the value of the current node and move to the right of the current node.
// Case 2: When there is a left subtree and the right-most child of this left subtree is pointing to null. In this case we need to set the right-most child to point to the current node, instead of NULL, print the current node value and move to the left of the current node.
// Case 3: When there is a left subtree and the right-most child of this left-subtree is already pointing to the current node. In this case we know that the left subtree is already visited so we need to reset the last node to NULL and move the current node to its right. 
// Note: Case 3 is very important as we need to remove the new links added to restore the original tree. 

// To summarize, at a node whether we have to move left or right is determined whether the node has a left subtree. If it doesn’t we move to the right. If there is a left subtree then we see its rightmost child. If the rightmost child is pointing to NULL, we print the current node’s value and move it to its left. If the rightmost child is already pointing towards the current node, we remove that link and move to the right of the current node. We will stop the execution when the current points to null and we have traversed the whole tree.

import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class MorrisPreorderTraversal {
    static ArrayList < Integer > preorderTraversal(Node root) {
        ArrayList < Integer > preorder = new ArrayList < > ();
        Node cur = root;
        while (cur != null) {
            if (cur.left == null) {
                preorder.add(cur.data);
                cur = cur.right;
            } else {
                Node prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = cur;
                    preorder.add(cur.data);
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return preorder;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        ArrayList < Integer > preorder = new ArrayList < > ();
        preorder = preorderTraversal(root);

        System.out.println("The Preorder Traversal is: ");
        for (int i = 0; i < preorder.size(); i++) {
            System.out.print(preorder.get(i) + " ");
        }

    }
}
// Time Complexity: O(N).

// Space Complexity: O(1)