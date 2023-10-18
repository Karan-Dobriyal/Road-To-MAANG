// Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

// Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
// Output: [3,9,20,null,null,15,7]
// Example 2:

// Input: preorder = [-1], inorder = [-1]
// Output: [-1]
 

// Constraints:

// 1 <= preorder.length <= 3000
// inorder.length == preorder.length
// -3000 <= preorder[i], inorder[i] <= 3000
// preorder and inorder consist of unique values.
// Each value of inorder also appears in preorder.
// preorder is guaranteed to be the preorder traversal of the tree.
// inorder is guaranteed to be the inorder traversal of the tree.


import java.util.*;
class ConstructBT {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<inorder.length; i++)
        {
            map.put(inorder[i],i);
        }
        TreeNode root = buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder,int inStart, int inEnd, HashMap<Integer,Integer> map)
    {
        // Base Case
        if(preStart > preEnd || inStart > inEnd) return null;

        // Creating a Node
        TreeNode root = new TreeNode(preorder[preStart]);
        int idxInorder = map.get(root.val);
        int countL = idxInorder - inStart;

        root.left = buildTree(preorder,preStart+1, preEnd+countL, inorder,inStart,idxInorder-1,map);
        root.right = buildTree(preorder,preStart+countL+1,preEnd,inorder,idxInorder+1,inEnd,map);
        return root;
    }
}
// Time and Space Complexity : O(N)
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }