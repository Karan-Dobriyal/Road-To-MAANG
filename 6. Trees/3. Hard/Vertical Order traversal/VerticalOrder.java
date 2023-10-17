// Problem Description
// Given a binary tree, return a 2-D array with vertical order traversal of it. Go through the example and image for more details.


// NOTE: If 2 Tree Nodes shares the same vertical level then the one with lesser depth will come first.



// Problem Constraints
// 0 <= number of nodes <= 105



// Input Format
// First and only arument is a pointer to the root node of binary tree, A.



// Output Format
// Return a 2D array denoting the vertical order traversal of tree as shown.



// Example Input
// Input 1:

//       6
//     /   \
//    3     7
//   / \     \
//  2   5     9
// Input 2:

//       1
//     /   \
//    3     7
//   /       \
//  2         9


// Example Output
// Output 1:

//  [
//     [2],
//     [3],
//     [6, 5],
//     [7],
//     [9]
//  ]
// Output 2:

//  [
//     [2],
//     [3],
//     [1],
//     [7],
//     [9]
//  ]


// Example Explanation
// Explanation 1:

//  First row represent the verical line 1 and so on.

 

  
import java.util.*;
public class VerticalOrder {

    public class Node {
        TreeNode node;
        int value; // which defines the vertical order of node 

        Node(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }


    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        int min = 0, max = 0;
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(new Node(A, 0));

        while(!queue.isEmpty()) {

            Node x = queue.poll();

            max = Math.max(max, x.value);
            min = Math.min(min, x.value);

            if(!hm.containsKey(x.value)) {
                ArrayList<Integer> y = new ArrayList<Integer>();
                y.add(x.node.val);
                hm.put(x.value, y);
            }
            else {
                hm.get(x.value).add(x.node.val);
            }

            if(x.node.left != null) {
                queue.add(new Node(x.node.left, x.value - 1));
            }

            if(x.node.right != null) {
                queue.add(new Node(x.node.right, x.value + 1));
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i = min; i <= max; i++) {
            ans.add(hm.get(i));
        }
        
        return ans;
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