// Problem Description
// Given 4 array of integers A, B, C and D of same size, find and return the maximum value of | A [ i ] - A [ j ] | + | B [ i ] - B [ j ] | + | C [ i ] - C [ j ] | + | D [ i ] - D [ j ] | + | i - j| where i != j and |x| denotes the absolute value of x.



// Problem Constraints
// 2 <= length of the array A, B, C, D <= 100000
// -106 <= A[i] <= 106



// Input Format
// The arguments given are the integer arrays A, B, C, D.



// Output Format
// Return the maximum value of | A [ i ] - A [ j ] | + | B [ i ] - B [ j ] | + | C [ i ] - C [ j ] | + | D [ i ] - D [ j ] | + | i - j|



// Example Input
// Input 1:

//  A = [1, 2, 3, 4]
//  B = [-1, 4, 5, 6]
//  C = [-10, 5, 3, -8]
//  D = [-1, -9, -6, -10]
// Input 2:

//  A = [1, 2]
//  B = [3, 6]
//  C = [10, 11]
//  D = [1, 6]


// Example Output
// Output 1:

//  30
// Output 2:

//  11


// Example Explanation
// Explanation 1:

//  Maximum value occurs for i = 0 and j = 1.
// Explanation 2:

// There is only one possibility for i, j as there are only two elements in the array.

public class AbsMax {
    public static void main()
    {
        int[] A = {1, 2, 3, 4};
        int[] B = {-1, 4, 5, 6};
        int[] C = {-10, 5, 3, -8};
        int[] D = {-1, -9, -6, -10};
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 16; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < A.length; j++) {
                int sum = A[j];
                int tmp = 0;
                for (int m = 0; m < 4; m++) {
                    if (m == 0) {
                        tmp = B[j];
                    } else if (m == 1) {
                        tmp = C[j];
                    } else if (m == 2) {
                        tmp = D[j];
                    } else {
                        tmp = j;
                    }
                    if ((i & (1 << m)) != 0) {
                        sum += tmp;
                    } else {
                        sum -= tmp;
                    }
                }
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
            maxSum = Math.max(maxSum, Math.abs(max - min));
        }
        System.out.println(maxSum);
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)