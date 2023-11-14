// Given a root of binary tree A, determine if it is height-balanced.

// A height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.



// Problem Constraints
// 1 <= size of tree <= 100000



// Input Format
// First and only argument is the root of the tree A.



// Output Format
// Return 0 / 1 ( 0 for false, 1 for true ) for this problem.



// Example Input
// Input 1:

//     1
//    / \
//   2   3
// Input 2:

 
//        1
//       /
//      2
//     /
//    3


// Example Output
// Output 1:

// 1
// Output 2:

// 0


// Example Explanation
// Explanation 1:

// It is a complete binary tree.
// Explanation 2:

// Because for the root node, left subtree has depth 2 and right subtree has depth 0. 
// Difference = 2 > 1. 

import java.util.*;
public class BalanceBinaryTree {
    int balanced = 1;//flag to check tree is balanced or not
    public void isBalanced(TreeNode root) {
        postOrderTraversal(root);
        System.out.println(balanced);
    }

    public int postOrderTraversal(TreeNode root){
        if(root == null)
            return -1;//for height only I always return -1 as an edge case and counter it by +1 at end 
        int left = postOrderTraversal(root.left);
        int right = postOrderTraversal(root.right);

        if(Math.abs(left - right) > 1)
            balanced = 0;

        return Math.max(left,right) + 1;
    }
}
// Time and Space Compelxity : O(N)
 
 // Definition for binary tree
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 