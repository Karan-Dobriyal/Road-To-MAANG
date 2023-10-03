// Problem Description
// Given an integer array A of size N. In one second, you can increase the value of one element by 1.

// Find the minimum time in seconds to make all elements of the array equal.


// Problem Constraints
// 1 <= N <= 1000000
// 1 <= A[i] <= 1000


// Input Format
// First argument is an integer array A.


// Output Format
// Return an integer denoting the minimum time to make all elements equal.


// Example Input
// A = [2, 4, 1, 3, 2]


// Example Output
// 8


// Example Explanation
// We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.

public class TimeEquality {
    public static void main()
    {
        int[] A = {2, 4, 1, 3, 2};
        int max = A[0];
        int totalSeconds = 0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i] > max) max = A[i];
        }

        for(int j=0; j<A.length; j++)
        {
            if(A[j] != max)
            {
                totalSeconds += (max - A[j]);
            }
        }
        System.out.println(totalSeconds);
    }
}
// Time Complexity : O(N)
// Space Compleixty : O(1)