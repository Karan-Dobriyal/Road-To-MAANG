// Level Order Traversal of a Binary Tree
// Problem Statement: Level order traversal of a binary tree. Given the root node of the tree and you have to print the value of the level of the node by level.

// Example 1:


// Output:

// 20 10 30 5 15 25 35
// We will print the nodes of the first level (20), then we will print nodes of second level(10,30) and at last we will print nodes of the last level(5,15,25,35)

// Example 2:


// 5 10 15
 
  
import java.util.*;
class LevelOrder {
    public List<Integer> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> wrapList = new ArrayList<Integer>();
        
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            
            if(queue.peek().left != null) 
                queue.offer(queue.peek().left);
                
            if(queue.peek().right != null) 
                queue.offer(queue.peek().right);
                
            wrapList.add(queue.poll().val);
        }
        return wrapList;
    }
}
// Time Complexity: O(N)

// Space Complexity: O(N)
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
 