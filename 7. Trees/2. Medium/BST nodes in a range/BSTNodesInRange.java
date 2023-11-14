// Given a binary search tree of integers. You are given a range B and C.

// Return the count of the number of nodes that lie in the given range.



// Problem Constraints
// 1 <= Number of nodes in binary tree <= 100000

// 0 <= B < = C <= 109



// Input Format
// First argument is a root node of the binary tree, A.

// Second argument is an integer B.

// Third argument is an integer C.



// Output Format
// Return the count of the number of nodes that lies in the given range.



// Example Input
// Input 1:

//             15
//           /    \
//         12      20
//         / \    /  \
//        10  14  16  27
//       /
//      8

//      B = 12
//      C = 20
// Input 2:

//             8
//            / \
//           6  21
//          / \
//         1   7

//      B = 2
//      C = 20


// Example Output
// Output 1:

//  5
// Output 2:

//  3
import java.util.*;
public class BSTNodesInRange  {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        public TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static  int countNodesInRange(TreeNode root, int low, int high) {
        return countNodesInRange(root, low, high, 0);
    }
    
    private  static int countNodesInRange(TreeNode node, int low, int high, int count) {
        if (node == null) {
            return count;
        }
    
        if (node.val >= low && node.val <= high) {
            count++;
        }
    
        if (node.val > low) {
            count = countNodesInRange(node.left, low, high, count);
        }
    
        if (node.val < high) {
            count = countNodesInRange(node.right, low, high, count);
        }
    
        return count;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
    
        int low = 7;
        int high = 15;
    
        int count = countNodesInRange(root, low, high);
    
        System.out.println("Count of nodes in the range [" + low + ", " + high + "]: " + count);
    }
 
}
      
// Time and Space O(H).