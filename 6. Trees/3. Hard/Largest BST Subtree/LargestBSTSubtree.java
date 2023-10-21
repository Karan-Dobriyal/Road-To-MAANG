// You are given a Binary Tree A with N nodes.

// Write a function that returns the size of the largest subtree, which is also a Binary Search Tree (BST).

// If the complete Binary Tree is BST, then return the size of the whole tree.

// NOTE:

// The largest subtree is the subtree with the most number of nodes.


// Problem Constraints
// 1 <= N <= 105



// Input Format
// First and only argument is an pointer to root of the binary tree A.



// Output Format
// Return an single integer denoting the size of the largest subtree which is also a BST.



// Example Input
// Input 1:

//      10
//     / \
//    5  15
//   / \   \ 
//  1   8   7
// Input 2:

//      5
//     / \
//    3   8
//   / \ / \
//  1  4 7  9


// Example Output
// Output 1:

//  3
// Output 2:

//  7


// Example Explanation
// Explanation 1:

//  Largest BST subtree is
//                             5
//                            / \
//                           1   8
// Explanation 2:

//  Given binary tree itself is BST.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Result {
    TreeNode largestBST;
    int size;
    int min;
    int max;

    public Result(TreeNode largestBST, int size, int min, int max) {
        this.largestBST = largestBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}

public class LargestBSTSubtree {
    public TreeNode findLargestBST(TreeNode root) {
        Result result = findLargestBSTHelper(root);
        return result.largestBST;
    }

    private Result findLargestBSTHelper(TreeNode node) {
        if (node == null) {
            return new Result(null, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Result left = findLargestBSTHelper(node.left);
        Result right = findLargestBSTHelper(node.right);

        if (left.size > 0 && right.size > 0 && node.val > left.max && node.val < right.min) {
            int size = left.size + right.size + 1;
            return new Result(node, size, Math.min(node.val, left.min), Math.max(node.val, right.max));
        } else {
            // The current subtree is not a valid BST, so return the largest BST from its children.
            return left.size > right.size ? left : right;
        }
    }

    public static void main(String[] args) {
        LargestBSTSubtree solution = new LargestBSTSubtree();

        // Create a sample binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(7);

        TreeNode largestBST = solution.findLargestBST(root);
        System.out.println("Largest BST Subtree root: " + largestBST.val);
    }
}
// Time and Space Complexity : O(N)