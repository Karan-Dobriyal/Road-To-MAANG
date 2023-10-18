// Given a binary tree, return the zigzag level order traversal of its nodes values. (ie, from left to right, then right to left for the next level and alternate between).



// Problem Constraints
// 1 <= number of nodes <= 105



// Input Format
// First and only argument is root node of the binary tree, A.



// Output Format
// Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



// Example Input
// Input 1:

//     3
//    / \
//   9  20
//     /  \
//    15   7
// Input 2:

//    1
//   / \
//  6   2
//     /
//    3


// Example Output
// Output 1:

//  [
//    [3],
//    [20, 9],
//    [15, 7]
//  ]
// Output 2:

//  [ 
//    [1]
//    [2, 6]
//    [3]
//  ]


// Example Explanation
// Explanation 1:

//  Return the 2D array. Each row denotes the zigzag traversal of each level.


import java.util.*;
public class ZigZagLevelOrder {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int level = 1;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<size; i++)
            {
                TreeNode node = queue.remove();
                temp.add(node.val);

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }
            if( (level & 1) == 0)
                reverse(temp);
            level++;
            res.add(temp);
        }
        return res;
    }

    void reverse(ArrayList<Integer> temp)
    {
        int start = 0;
        int end = temp.size()-1;

        while(start < end)
        {
            temp.set(start, temp.get(start)^temp.get(end));
            temp.set(end, temp.get(start)^temp.get(end));
            temp.set(start, temp.get(start)^temp.get(end));
            start++;
            end--;
        }
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
 