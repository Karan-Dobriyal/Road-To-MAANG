// Sum of first N Natural Numbers
// Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.
// Example 1:
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

// Example 2:
// Input: N=6
// Output: 21
// Explanation: 1+2+3+4+5+6=15

public class Solution {
    public static long sumFirstN(long n) {
        return (n*(n+1)/2);
    }
}

// TC : O(1) and SC : O(1)
