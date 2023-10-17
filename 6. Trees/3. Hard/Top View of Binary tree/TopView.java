//  Given a binary tree of integers denoted by root A. Return an array of integers representing the top view of the Binary tree.

// The top view of a Binary Tree is a set of nodes visible when the tree is visited from the top.

// Return the nodes in any order.



// Problem Constraints
// 1 <= Number of nodes in binary tree <= 100000

// 0 <= node values <= 10^9



// Input Format
// First and only argument is head of the binary tree A.



// Output Format
// Return an array, representing the top view of the binary tree.



// Example Input
// Input 1:

 
//             1
//           /   \
//          2    3
//         / \  / \
//        4   5 6  7
//       /
//      8 
// Input 2:

 
//             1
//            /  \
//           2    3
//            \
//             4
//              \
//               5


// Example Output
// Output 1:

//  [1, 2, 4, 8, 3, 7]
// Output 2:

//  [1, 2, 3]


// Example Explanation
// Explanation 1:

// Top view is described.
// Explanation 2:

// Top view is described.

import java.util.*;
public class TopView {

    class Pair
    {
        int hl;
        TreeNode node;

        Pair(int hl, TreeNode node)
        {
            this.hl = hl;
            this.node = node;
        }
    }

    public int[] solve(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        q.add(new Pair(0,root));

        while(q.size() != 0)
        {
            Pair curr = q.poll();

            if(!map.containsKey(curr.hl))
            {
                map.put(curr.hl,curr.node.val);
            }

            if(curr.node.left != null)
            {
                q.add(new Pair(curr.hl-1, curr.node.left));
            }
            if(curr.node.right != null)
            {
                q.add(new Pair(curr.hl+1, curr.node.right));
            }
        }
        int index = 0;
        int[] ans = new int[map.size()];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
            ans[index]= entry.getValue();
            index++;
        }

        return ans;
    }
}
 // Time ans Space Compleixty : O(N)
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
 