// Example 1:
// Input: arr[]= 1 2 3 4 5, num = 3
// Output: 2
// Explanation: 3 is present in the 2nd index

// Example 2:
// Input: arr[]= 5 4 3 2 1, num = 5
// Output: 0
// Explanation: 5 is present in the 0th index


public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int nums = 4;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num) System.out.println(i);
        }
        System.out.println(-1);
    } 
}
// Time Complexity : O(N) and Space Complexity : O(1).
