// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:

// Input: nums = [1]
// Output: [[1]]
 

// Constraints:

// 1 <= nums.length <= 6
// -10 <= nums[i] <= 10
// All the integers of nums are unique.

import java.util.*;
class Permutations {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visit=new boolean[nums.length];      
        List<Integer> res=new ArrayList<>();
        perm(nums,0,visit,res); 
        return ans; 
    }

        void perm(int[] A,int idx,boolean[] visit,List<Integer> res){
        if(idx==A.length) //BASE CASE
        {
            ans.add(new ArrayList(res));
            return; 
        }

        for(int i=0;i<A.length;i++){
            if(visit[i]==false){
                visit[i]=true;
                res.add(idx,A[i]);
                perm(A,idx+1,visit,res);
                res.remove(res.size()-1);
                visit[i]=false;             
            }
        }
    }
}