// Longest Consecutive Sequence

// Given an unsorted integer array A of size N.

// Find the length of the longest set of consecutive elements from array A.



// Problem Constraints
// 1 <= N <= 106

// -106 <= A[i] <= 106



// Input Format
// First argument is an integer array A of size N.



// Output Format
// Return an integer denoting the length of the longest set of consecutive elements from the array A.



// Example Input
// Input 1:

// A = [100, 4, 200, 1, 3, 2]
// Input 2:

// A = [2, 1]


// Example Output
// Output 1:

//  4
// Output 2:

//  2


// Example Explanation
// Explanation 1:

//  The set of consecutive elements will be [1, 2, 3, 4].
// Explanation 2:

//  The set of consecutive elements will be [1, 2].

import java.util.HashSet;

public class LongestConsSeq
{
    public static void main(String[] args)
    {
        int[] A = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int n = A.length;

        for(int i = 0; i < n; i++) {
            set.add(A[i]);
        }

        for(Integer x : set) {
            if(!set.contains(x-1)) {
                int chain = 1;
                int y = x + 1;
                while(set.contains(y)) {
                    chain += 1;
                    y += 1;
                }

                max = max > chain ? max : chain;
            }
        }

        System.out.println(max);
    }
    // Time Complexity : O(N) and Space Complexity is O(N).
}