// Find the lowest common ancestor in an unordered binary tree A, given two values, B and C, in the tree.

// Lowest common ancestor: the lowest common ancestor (LCA) of two nodes and w in a tree or directed acyclic graph (DAG) is the lowest (i.e., deepest) node that has both v and w as descendants.



// Problem Constraints
// 1 <= size of tree <= 100000

// 1 <= B, C <= 109



// Input Format
// First argument is head of tree A.

// Second argument is integer B.

// Third argument is integer C.



// Output Format
// Return the LCA.



// Example Input
// Input 1:

 
//       1
//      /  \
//     2    3
// B = 2
// C = 3
// Input 2:

//       1
//      /  \
//     2    3
//    / \
//   4   5
// B = 4
// C = 5


// Example Output
// Output 1:

//  1
// Output 2:

//  2


// Example Explanation
// Explanation 1:

//  LCA is 1.
// Explanation 2:

//  LCA is 2.
 

public class LCAinBT {
    public int lca(TreeNode A, int B, int C) {
     
      ArrayList<Integer> pathB =  new ArrayList<>();
      ArrayList<Integer> pathC =  new ArrayList<>();

        int match = A.val;
        if(!pathFromNodeToRoot(A, B, pathB) || !pathFromNodeToRoot(A, C, pathC)){
          return -1;
        }

     
        if(pathFromNodeToRoot(A,B, pathB) && pathFromNodeToRoot(A,C,pathC)){
            int N = pathB.size();
            int M = pathC.size();
            for(int i=0; i< Math.min(N,M); i++){
              if(pathB.get(i).equals(pathC.get(i))){
                  match = pathB.get(i);
              }
            }
        }

      return match;
    }

    public  boolean pathFromNodeToRoot(TreeNode root, int nodeVal, ArrayList<Integer> list){
        if(root == null){
            return false;
        }
        list.add(root.val);
        if(root.val == nodeVal){
            return true;
        }

        if(pathFromNodeToRoot(root.left, nodeVal, list) || pathFromNodeToRoot(root.right, nodeVal, list)){
            return true;
        }
       
        list.remove(list.size()-1);
        return false;
    }
}

// Time and Space Complexity : O(N)



  //Definition for binary tree
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
 