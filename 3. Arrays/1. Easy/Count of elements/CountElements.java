// Problem Description
// Given an array A of N integers. 
// Count the number of elements that have at least 1 elements greater than itself.


// Problem Constraints
// 1 <= N <= 105
// 1 <= A[i] <= 109


// Input Format
// First and only argument is an array of integers A.


// Output Format
// Return the count of elements.


// Example Input
// Input 1:
// A = [3, 1, 2]
// Input 2:
// A = [5, 5, 3]


// Example Output
// Output 1:
// 2
// Output 2:
// 1


// Example Explanation
// Explanation 1:
// The elements that have at least 1 element greater than itself are 1 and 2
// Explanation 2:
// The elements that have at least 1 element greater than itself is 3

public class CountElements {
    public static void main()
    {
        int[] A = {3,1,2};
        int max = A[0];
        int freq = 0;
        // Getting Max
        for(int i=0; i<A.length; i++)
        {
            if(A[i]> max)
            {
              max = A[i];  
              freq = 0;
            }
            if(A[i] == max) freq++;
        }

        // return the answer
        System.out.println(A.length - freq);
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)