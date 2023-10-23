// Given a binary search tree represented by root A, write a function to find the Bth smallest element in the tree.



// Problem Constraints
// 1 <= Number of nodes in binary tree <= 100000

// 0 <= node values <= 10^9



// Input Format
// First and only argument is head of the binary tree A.



// Output Format
// Return an integer, representing the Bth element.



// Example Input
// Input 1:

 
//             2
//           /   \
//          1    3
// B = 2
// Input 2:

 
//             3
//            /
//           2
//          /
//         1
// B = 1



// Example Output
// Output 1:

//  2
// Output 2:

//  1


// Example Explanation
// Explanation 1:

// 2nd element is 2.
// Explanation 2:

// 1st element is 1.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class KthSmallestElement {
    int result;
    int count;

    public int kthSmallest(TreeNode root, int k) {
        count = 0; // Initialize the count
        inOrderTraversal(root, k);
        return result;
    }

    private void inOrderTraversal(TreeNode node, int k) {
        if (node == null || count >= k) {
            return;
        }

        // Traverse the left subtree
        inOrderTraversal(node.left, k);

        // Process the current node
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        // Traverse the right subtree
        inOrderTraversal(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestElementInBST solution = new KthSmallestElementInBST();
        int k = 2;
        int kthSmallest = solution.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
