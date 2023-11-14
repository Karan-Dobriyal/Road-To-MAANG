// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]
 

// Constraints:

// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109
 

// Follow up: Could you solve the problem in linear time and in O(1) space?

import java.util.*;

class MajorityElementN3
{
    public static void main()
    {
        int[] nums = {3,2,3};
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int n = nums.length;
        int len = n/3;

        for(int i=0; i<n; i++)
        {
            if(count1 == 0 && ele2 != nums[i])
            {
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0 && ele1 != nums[i])
            {
                count2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]) count1++;
            else if(ele2 == nums[i]) count2++;
            else 
            {
                count1--;
                count2--;
            }
        }
        List<Integer> lst = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i=0; i<n; i++)
        {
            if(ele1 == nums[i]) count1++;
            if(ele2 == nums[i]) count2++;
        }
        if(count1>len) lst.add(ele1);
        if(count2>len) lst.add(ele2);
        
        // Printing Answer.
        System.out.print(lst.get(0)+ " , ");        
        System.out.print(lst.get(1)); 
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)