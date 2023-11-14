// Problem Description
// Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



// Problem Constraints
// 1 <= n <= 105
// -105 <= A[i] <= 105


// Input Format
// First argument contains an array A of integers of size N


// Output Format
// Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



// Example Input
// Input 1:
// A=[2, 1, 6, 4]
// Input 2:

// A=[1, 1, 1]


// Example Output
// Output 1:
// 1
// Output 2:

// 3


// Example Explanation
// Explanation 1:
// Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
// Therefore, the required output is 1. 
// Explanation 2:

// Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
// Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
// Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
// Therefore, the required output is 3.


public class SpecialIndex {
    public static void main()
    {
        int[] A={2, 1, 6, 4};
        int[] pfEven = new int[A.length];
        int[] pfOdd = new int[A.length];
        int count = 0;
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        pfEven[0] = A[0];
        pfOdd[0] = 0;
        for(int i=1; i<A.length; i++)
        {
            if(i % 2 == 0) pfEven[i] = pfEven[i-1] + A[i];
            else  pfEven[i]= pfEven[i-1];
        }
        for(int i=1; i<A.length; i++)
        {
            if(i % 2 == 0) pfOdd[i]= pfOdd[i-1];
            else  pfOdd[i] = pfOdd[i-1] + A[i];
        }

        for(int i=0; i<A.length; i++)
        {
            if(i==0)
            {
                evenIndexSum = pfOdd[A.length-1] - pfOdd[i];
                oddIndexSum = pfEven[A.length-1] - pfEven[i];
            }
            else
            {
                evenIndexSum = pfEven[i-1] + pfOdd[A.length-1] - pfOdd[i];
                oddIndexSum = pfOdd[i-1] + pfEven[A.length-1] - pfEven[i];
            }
            if(evenIndexSum == oddIndexSum) count++;
        }
        System.out.println(count);
    }
}
// Time and Space Complexity : O(N)