// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 2,3,4,5,1
// Explanation: 
// Since all the elements in array will be shifted 
// toward left by one so ‘2’ will now become the 
// first index and and ‘1’ which was present at 
// first index will be shifted at last.


// Example 2:
// Input: N = 1, array[] = {3}
// Output: 3
// Explanation: Here only element is present and so 
// the element at first index will be shifted to 
// last index which is also by the way the first index.

public class LeftRotateArrayByOne {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k=k%nums.length;
        if(k<0){
            k+=nums.length;
        }
        reverse(arr,0,n-1);
        reverse(arr,0,n-2);
    }
    static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        } 
    }
}
// Time Complexity : O(N) and Space Complexity : O(1)
