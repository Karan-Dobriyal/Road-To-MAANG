// Given a binary tree of integers. Find the difference between the sum of nodes at odd level and sum of nodes at even level.

// NOTE: Consider the level of root node as 1.



// Problem Constraints
// 1 <= Number of nodes in binary tree <= 100000

// 0 <= node values <= 109



// Input Format
// First and only argument is a root node of the binary tree, A



// Output Format
// Return an integer denoting the difference between the sum of nodes at odd level and sum of nodes at even level.



// Example Input
// Input 1:

//         1
//       /   \
//      2     3
//     / \   / \
//    4   5 6   7
//   /
//  8 
// Input 2:

//         1
//        / \
//       2   10
//        \
//         4


// Example Output
// Output 1:

//  10
// Output 2:

//  -7


// Example Explanation
// Explanation 1:

//  Sum of nodes at odd level = 23
//  Sum of ndoes at even level = 13
// Explanation 2:

//  Sum of nodes at odd level = 5
//  Sum of ndoes at even level = 12

 
import java.util.*;
public class OddEvenBT {
public void solve(TreeNode A)
{
    if (A == null)
    {
        System.out.println(0);
        return;
    }

    Queue<TreeNode> nodeQueue = new LinkedList<>();
    nodeQueue.add(A);

    int level = 1;
    int oddLevelSum = 0;
    int evenLevelSum = 0;

    while (!nodeQueue.isEmpty())
    {
        int queueSize = nodeQueue.size();

        for (int i = 0; i < queueSize; i++)
        {
            TreeNode curr = nodeQueue.poll();

            if (level % 2 == 0)
            {
                evenLevelSum += curr.val;
            }
            else
            {
                oddLevelSum += curr.val;
            }

            if (curr.left != null)
            {
                nodeQueue.add(curr.left);
            }
            if (curr.right != null)
            {
                nodeQueue.add(curr.right);
            }
        }
        level++;
    }
    System.out.println(oddLevelSum - evenLevelSum);
}
}
 // Time and Space Complexity : O(N)
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
  