// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
 

// Follow-up: Could you solve the problem in linear time and in O(1) space?

public class MajiorityElement {
    public static void main()
    {
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length; 
        int counter = 0;
        int ele = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(counter == 0)
            {
                counter = 1;
                ele = nums[i];
            }
            else if(ele == nums[i]) counter++;
            else counter--;
        }
        int counter1 = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == ele) counter1++;
        }
        if(counter1>n/2) System.out.println(ele);
        System.out.println(-1);
    }
}
// Time Compplexity : O(N)
// Space Complexity : O(1)