// Given a binary tree A, invert the binary tree and return it.

// Inverting refers to making the left child the right child and vice versa.



// Problem Constraints
// 1 <= size of tree <= 100000



// Input Format
// First and only argument is the head of the tree A.



// Output Format
// Return the head of the inverted tree.



// Example Input
// Input 1:

 
//      1
//    /   \
//   2     3
// Input 2:

 
//      1
//    /   \
//   2     3
//  / \   / \
// 4   5 6   7


// Example Output
// Output 1:

 
//      1
//    /   \
//   3     2
// Output 2:

 
//      1
//    /   \
//   3     2
//  / \   / \
// 7   6 5   4


// Example Explanation
// Explanation 1:

// Tree has been inverted.
// Explanation 2:

// Tree has been inverted.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class InvertBT {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // Helper function to print the tree (in-order traversal)
    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        InvertBinaryTree solution = new InvertBinaryTree();

        System.out.println("Original tree (in-order):");
        solution.printTree(root);

        TreeNode invertedRoot = solution.invertTree(root);

        System.out.println("\nInverted tree (in-order):");
        solution.printTree(invertedRoot);
    }
}
// Time and Space Complexity : O(N)