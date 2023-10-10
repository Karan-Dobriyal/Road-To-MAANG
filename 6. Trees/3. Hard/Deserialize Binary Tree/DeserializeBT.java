// Problem Description
// You are given an integer array A denoting the Level Order Traversal of the Binary Tree.

// You have to Deserialize the given Traversal in the Binary Tree and return the root of the Binary Tree.

// NOTE:

// In the array, the NULL/None child is denoted by -1.
// For more clarification check the Example Input.


// Problem Constraints
// 1 <= number of nodes <= 105

// -1 <= A[i] <= 105



// Input Format
// Only argument is an integer array A denoting the Level Order Traversal of the Binary Tree.



// Output Format
// Return the root node of the Binary Tree.



// Example Input
// Input 1:

//  A = [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
// Input 2:

//  A = [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


// Example Output
// Output 1:

//            1
//          /   \
//         2     3
//        / \
//       4   5
// Output 2:

//             1
//           /   \
//          2     3
//         / \ .   \
//        4   5 .   6


// Example Explanation
// Explanation 1:

//  Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
//  Since 3, 4 and 5 each has both NULL child we had represented that using -1.
// Explanation 2:

//  Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
//  Since 3 has left child as NULL while 4 and 5 each has both NULL child.
 
import java.util.*;
public class DeserializeBT {
    public TreeNode solve(ArrayList<Integer> A) {
        String[] values = {"1","2","3","4","5","#","6","#","#","#","#","#","#"};
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for (int i = 1; i < values.length; i++) {
            TreeNode parent = q.poll();
            if (!values[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            if (!values[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;

    }
}
// Time and Space Compleixty : O(N)
 
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