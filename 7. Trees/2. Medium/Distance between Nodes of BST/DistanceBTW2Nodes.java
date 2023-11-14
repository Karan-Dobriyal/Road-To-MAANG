// Given a binary search tree.
// Return the distance between two nodes with given two keys B and C. It may be assumed that both keys exist in BST.

// NOTE: Distance between two nodes is number of edges between them.



// Problem Constraints
// 1 <= Number of nodes in binary tree <= 1000000

// 0 <= node values <= 109



// Input Format
// First argument is a root node of the binary tree, A.

// Second argument is an integer B.

// Third argument is an integer C.



// Output Format
// Return an integer denoting the distance between two nodes with given two keys B and C



// Example Input
// Input 1:

    
//          5
//        /   \
//       2     8
//      / \   / \
//     1   4 6   11
//  B = 2
//  C = 11
// Input 2:

    
//          6
//        /   \
//       2     9
//      / \   / \
//     1   4 7   10
//  B = 2
//  C = 6


// Example Output
// Output 1:

//  3
// Output 2:

//  1


// Example Explanation
// Explanation 1:

//  Path between 2 and 11 is: 2 -> 5 -> 8 -> 11. Distance will be 3.
// Explanation 2:

//  Path between 2 and 6 is: 2 -> 6. Distance will be 1

 
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

public class DistanceBTW2Nodes {
    // Function to find the Lowest Common Ancestor (LCA) of two nodes in a BST
    public TreeNode findLCA(TreeNode root, int node1, int node2) {
        if (root == null) {
            return null;
        }

        if (root.val > node1 && root.val > node2) {
            return findLCA(root.left, node1, node2);
        } else if (root.val < node1 && root.val < node2) {
            return findLCA(root.right, node1, node2);
        } else {
            return root;
        }
    }

    // Function to find the distance from the LCA to a node
    public int findDistance(TreeNode root, int nodeValue) {
        if (root == null) {
            return -1; // Node not found
        }

        if (root.val == nodeValue) {
            return 0;
        } else if (root.val > nodeValue) {
            int leftDistance = findDistance(root.left, nodeValue);
            return leftDistance >= 0 ? leftDistance + 1 : -1;
        } else {
            int rightDistance = findDistance(root.right, nodeValue);
            return rightDistance >= 0 ? rightDistance + 1 : -1;
        }
    }

    // Function to find the distance between two nodes in a BST
    public int findDistanceBetweenNodes(TreeNode root, int node1, int node2) {
        TreeNode lca = findLCA(root, node1, node2);

        if (lca == null) {
            return -1; // One or both nodes not found
        }

        int distance1 = findDistance(lca, node1);
        int distance2 = findDistance(lca, node2);

        if (distance1 >= 0 && distance2 >= 0) {
            return distance1 + distance2;
        } else {
            return -1; // One or both nodes not found
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);

        DistanceBTW2Nodes solution = new DistanceBTW2Nodes();

        int node1 = 3;
        int node2 = 7;
        int distance = solution.findDistanceBetweenNodes(root, node1, node2);

        if (distance >= 0) {
            System.out.println("Distance between " + node1 + " and " + node2 + " is " + distance);
        } else {
            System.out.println("One or both nodes not found in the BST.");
        }
    }
}
// Time and Space Compleixty : O(N)
