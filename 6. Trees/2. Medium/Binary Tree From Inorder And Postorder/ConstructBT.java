// Problem Description
// Given the inorder and postorder traversal of a tree, construct the binary tree.

// NOTE: You may assume that duplicates do not exist in the tree.



// Problem Constraints
// 1 <= number of nodes <= 105



// Input Format
// First argument is an integer array A denoting the inorder traversal of the tree.

// Second argument is an integer array B denoting the postorder traversal of the tree.



// Output Format
// Return the root node of the binary tree.



// Example Input
// Input 1:

//  A = [2, 1, 3]
//  B = [2, 3, 1]
// Input 2:

//  A = [6, 1, 3, 2]
//  B = [6, 3, 2, 1]


// Example Output
// Output 1:

//    1
//   / \
//  2   3
// Output 2:

//    1  
//   / \
//  6   2
//     /
//    3


// Example Explanation
// Explanation 1:

//  Create the binary tree and return the root node of the tree.

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] A, int[] B) {
        int s1 = 0;
        int e1 = B.length - 1;
        int s2 = 0;
        int e2 = A.length - 1;
        return tree(B, s1, e1, A, s2, e2);
    }
    public TreeNode tree(int[] post, int s1, int e1, int[] in, int s2, int e2) {
        if (s1 > e1) {
            return null;
        }
        TreeNode root = new TreeNode(post[e1]);
        int x = -1;
        for (int i = s2; i <= e2; i++) {
            if (in[i] == post[e1]) {
                x = i;
                break;
            }
        }
        int c = x - s2;
        root.left = tree(post, s1, c + s1 - 1, in, s2, x - 1);
        root.right = tree(post, c + s1, e1 - 1, in, x + 1, e2);
        return root;
    }
}
// Time and Space Complexity : O(N)
