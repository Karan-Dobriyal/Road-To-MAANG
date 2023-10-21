// Given a binary search tree A, where each node contains a positive integer, and an integer B, you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.

// Return 1 to denote that two such nodes exist. Return 0, otherwise.



// Problem Constraints
// 1 <= size of tree <= 100000

// 1 <= B <= 109



// Input Format
// First argument is the head of the tree A.

// Second argument is the integer B.



// Output Format
// Return 1 if such a pair can be found, 0 otherwise.



// Example Input
// Input 1:

//          10
//          / \
//         9   20

// B = 19
// Input 2:

 
//           10
//          / \
//         9   20

// B = 40


// Example Output
// Output 1:

//  1
// Output 2:

//  0


// Example Explanation
// Explanation 1:

//  10 + 9 = 19. Hence 1 is returned.
// Explanation 2:

//  No such pair exists.

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TwoSumBST {
    public static boolean findTarget(TreeNode root, int target) {
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();

        // Initialize the left iterator at the smallest node
        TreeNode left = root;
        while (left != null) {
            leftStack.push(left);
            left = left.left;
        }

        // Initialize the right iterator at the largest node
        TreeNode right = root;
        while (right != null) {
            rightStack.push(right);
            right = right.right;
        }

        while (!leftStack.isEmpty() && !rightStack.isEmpty() && leftStack.peek() != rightStack.peek()) {
            int leftVal = leftStack.peek().val;
            int rightVal = rightStack.peek().val;
            int currentSum = leftVal + rightVal;

            if (currentSum == target) {
                return true;
            } else if (currentSum < target) {
                // Move the left iterator to the next smallest value
                left = leftStack.pop().right;
                while (left != null) {
                    leftStack.push(left);
                    left = left.left;
                }
            } else {
                // Move the right iterator to the next largest value
                right = rightStack.pop().left;
                while (right != null) {
                    rightStack.push(right);
                    right = right.right;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int target = 9;

        boolean result = findTarget(root, target);

        if (result) {
            System.out.println("There are two numbers in the BST that add up to the target.");
        } else {
            System.out.println("No two numbers in the BST add up to the target.");
        }
    }
}
// Time Complexity : O(N)
// Sapce Compleixty : O(H)