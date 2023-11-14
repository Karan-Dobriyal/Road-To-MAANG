// An array is squareful if the sum of every pair of adjacent elements is a perfect square.

// Given an integer array nums, return the number of permutations of nums that are squareful.

// Two permutations perm1 and perm2 are different if there is some index i such that perm1[i] != perm2[i].

 

// Example 1:

// Input: nums = [1,17,8]
// Output: 2
// Explanation: [1,8,17] and [17,8,1] are the valid permutations.
// Example 2:

// Input: nums = [2,2,2]
// Output: 1
 

// Constraints:

// 1 <= nums.length <= 12
// 0 <= nums[i] <= 109

import java.util.*;
class NumberOfSquarefulArrays {
    public int numSquarefulPerms(int[] nums) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        Arrays.sort(nums);
        int[] res = new int[1];
        dfs(nums,used,new ArrayList<>(), res);
        return res[0];
    }

    private void dfs(int[] nums, boolean[] used,List<Integer> path, int[] result)
    {
        int n = nums.length;
        if(path.size() == n)
        {
            result[0]++;
        }
        for(int i=0; i<n; i++)
        {
            if(used[i]) continue;

            if(i != 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            int size = path.size();
            if(size == 0 || isSquare(path.get(size-1) + nums[i]))
            {
                used[i] = true;
                path.add(nums[i]);
                dfs(nums,used,path,result);
                path.remove(size);
                used[i]  = false;
            }
        }
    }

    private boolean isSquare(int num)
    {
        double sqrt = Math.sqrt(num);
        return sqrt - Math.floor(sqrt) < 1e-5;
    }
}