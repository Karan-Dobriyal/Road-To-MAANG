// Two elements of a Binary Search Tree (BST), represented by root A are swapped by mistake. Tell us the 2 values, when swapped, will restore the Binary Search Tree (BST).

// A solution using O(n) space is pretty straightforward. Could you devise a constant space solution?

// Note: The 2 values must be returned in ascending order



// Problem Constraints
// 1 <= size of tree <= 100000



// Input Format
// First and only argument is the head of the tree,A



// Output Format
// Return the 2 elements which need to be swapped.



// Example Input
// Input 1:

//          1 
//         / \ 
//        2   3
// Input 2:

 
//          2
//         / \
//        3   1



// Example Output
// Output 1:

//  [2, 1]
// Output 2:

//  [3, 1]


// Example Explanation
// Explanation 1:

// Swapping 1 and 2 will change the BST to be 
//          2
//         / \
//        1   3
// which is a valid BST 
// Explanation 2:

// Swapping 1 and 3 will change the BST to be 
//          2
//         / \
//        1   3
// which is a valid BST 


public class Solution {
    int [] swap = new int[2];
    TreeNode prev= null;
    public int[] recoverTree(TreeNode A) {
       findSwapEle(A);
        return swap;
    }
    public void findSwapEle(TreeNode A){
        if(A==null){
            return;
        }

        findSwapEle(A.left);
        // store the values in array according to question if found desceending order.
        if(prev != null && prev.val >= A.val){
           if(swap[0] == 0){
                swap[1] = prev.val;
                swap[0] = A.val;
           }
           else{
               swap[0] = A.val;
           }
        }
        prev = A;
        findSwapEle(A.right);
    }
}

 // Time Compleixty and Space Complexity : O(N)

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
 