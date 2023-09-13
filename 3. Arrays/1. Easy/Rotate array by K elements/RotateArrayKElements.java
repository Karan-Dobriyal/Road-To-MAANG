// Example 1:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position .

// Example 2:
// Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
// Output: 9 10 11 3 7 8
// Explanation: Array is rotated to right by 3 position.


public class RotateArrayKElements {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k=k%nums.length;
        if(k<0){
            k+=nums.length;
        }
        reverse(nums, 0,nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }
    public static void reverse(int nums[], int i, int j){
        int left=i;
        int right=j;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
// Time Complexity : O(N) and Space Complexity : O(1)

