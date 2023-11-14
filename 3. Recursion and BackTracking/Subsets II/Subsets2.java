// Given an integer array nums that may contain duplicates, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10

import java.util.*;
class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSubsets(0,nums,new ArrayList<>(), ans);
        return ans;
    }

    static void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds));

        for(int i=index; i<nums.length; i++)
        {
            if(i > index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1,nums,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}
// Time and Space Complexity : O(2^N)