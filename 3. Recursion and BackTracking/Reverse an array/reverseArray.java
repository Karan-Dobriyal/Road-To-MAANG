// Reverse a given Array

// Example 1:
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
// the second element occupies the fourth position and so on.

// Example 2:
// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
// the second element occupies the fourth position and so on.

public class reverseArray { 
    public static int[] reverseArrays(int n, int []nums)
    {
        int start = 0;
        int end = nums.length-1;
          reverseArr(nums,start,end);
           return nums;
    } 
    static void reverseArr(int[] nums, int start, int end)
    {
        if(start > end)
        {
            return;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverseArr(nums,start+1,end-1);
    }
}

// Time Complexity: O(n)

// Space Complexity: O(1)