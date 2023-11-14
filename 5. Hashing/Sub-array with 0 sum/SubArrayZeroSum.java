// Sub-array with 0 sum

// Problem Description
// Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

// If the given array contains a sub-array with sum zero return 1, else return 0.



// Problem Constraints
// 1 <= |A| <= 100000

// -10^9 <= A[i] <= 10^9



// Input Format
// The only argument given is the integer array A.



// Output Format
// Return whether the given array contains a subarray with a sum equal to 0.



// Example Input
// Input 1:

//  A = [1, 2, 3, 4, 5]
// Input 2:

//  A = [4, -1, 1]


// Example Output
// Output 1:

//  0
// Output 2:

//  1


// Example Explanation
// Explanation 1:

//  No subarray has sum 0.
// Explanation 2:

//  The subarray [-1, 1] has sum 0.

import java.util.HashSet;

public class SubArrayZeroSum {
    public static void main()
    {
        int[] A = {1, 2, 3, 4, 5};
        long[] psum = new long[A.length];
        psum[0] = A[0]; 
        int ans = 0;
        for(int i=1; i<A.length; i++)
        {
            psum[i] = psum[i-1] + A[i];
            if(psum[i] == 0) ans = 1;
        } 
        HashSet<Long> set = new HashSet<>();
        for(int i = 0; i < psum.length; i++){
          if(psum[i] == 0){
              ans = 1;
            }
          if(set.contains(psum[i])){
              ans = 1;
            }
          set.add(psum[i]);
        }
        ans= 0;
        System.out.println(ans);
    }
    // Time Complexity is O(N), Space Complexity is O(N).
}
