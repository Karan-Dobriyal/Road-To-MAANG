// Find the Largest element in an array
// Problem Statement: Given an array, we have to find the largest element in the array.

// Examples
// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 5
// Explanation: 5 is the largest element in the array. 

// Example2: 
// Input: arr[] = {8,10,5,7,9};
// Output: 10
// Explanation: 10 is the largest element in the array. 

public class LargestElement {
    public static void main(String[] args)
    {
        int max = Integer.MIN_VALUE;
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
// Time Complexity : O(N) and Space Complexity : O(1)
