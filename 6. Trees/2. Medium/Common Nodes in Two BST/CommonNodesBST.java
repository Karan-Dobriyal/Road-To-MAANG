// Given two BST's A and B, return the (sum of all common nodes in both A and B) % (109 +7) .

// In case there is no common node, return 0.

// NOTE:

// Try to do it one pass through the trees.



// Problem Constraints
// 1 <= Number of nodes in the tree A and B <= 105

// 1 <= Node values <= 106



// Input Format
// First argument represents the root of BST A.

// Second argument represents the root of BST B.



// Output Format
// Return an integer denoting the (sum of all common nodes in both BST's A and B) % (109 +7) .



// Example Input
// Input 1:

//  Tree A:
//     5
//    / \
//   2   8
//    \   \
//     3   15
//         /
//         9

//  Tree B:
//     7
//    / \
//   1  10
//    \   \
//     2  15
//        /
//       11
// Input 2:

//   Tree A:
//     7
//    / \
//   1   10
//    \   \
//     2   15
//         /
//        11

//  Tree B:
//     7
//    / \
//   1  10
//    \   \
//     2  15
//        /
//       11


// Example Output
// Output 1:

//  17
// Output 2:

//  46


// Example Explanation
// Explanation 1:

//  Common Nodes are : 2, 15
//  So answer is 2 + 15 = 17
// Explanation 2:

//  Common Nodes are : 7, 2, 1, 10, 15, 11
//  So answer is 7 + 2 + 1 + 10 + 15 + 11 = 46

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class CommonNodesBST {
    public static void findCommonNodes(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        while (!stack1.isEmpty() || !stack2.isEmpty() || root1 != null || root2 != null) {
            // Traverse the left subtree of the first tree
            while (root1 != null) {
                stack1.push(root1);
                root1 = root1.left;
            }

            // Traverse the left subtree of the second tree
            while (root2 != null) {
                stack2.push(root2);
                root2 = root2.left;
            }

            // Pop the nodes from the stacks
            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                root1 = stack1.pop();
                root2 = stack2.pop();

                // Compare values of the current nodes
                if (root1.val == root2.val) {
                    System.out.print(root1.val + " ");
                    root1 = root1.right;
                    root2 = root2.right;
                } else if (root1.val < root2.val) {
                    root1 = root1.right;
                    stack2.push(root2);
                    root2 = null;
                } else {
                    root2 = root2.right;
                    stack1.push(root1);
                    root1 = null;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two BSTs
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.left.left = new TreeNode(6);

        System.out.println("Common nodes in the two BSTs:");
        findCommonNodes(root1, root2);
    }
}
// Time Complexity : O(N)
// Space Complexity : O(H)