// Problem Description
// Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

// and at least one occurrence of the minimum value of the array.



// Problem Constraints
// 1 <= |A| <= 2000



// Input Format
// First and only argument is vector A



// Output Format
// Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



// Example Input
// Input 1:

// A = [1, 3, 2]
// Input 2:

// A = [2, 6, 1, 6, 9]


// Example Output
// Output 1:

//  2
// Output 2:

//  3


// Example Explanation
// Explanation 1:

//  Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
// Explanation 2:

//  Take the last 3 elements of the array.


public class ClosestMinMax {
    public static void main(){
        int[] A = {1, 3, 2};
        int maxi = -1;
        int mini = -1;
        int minLen = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++)
        {
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }

        for(int i=A.length-1; i>=0; i--)
        {

            if(A[i] == max)
            {
                maxi = i;
                if(mini != -1)
                {
                    int len = Math.max(mini,maxi) - Math.min(mini,maxi) + 1;
                    minLen = Math.min(len,minLen);
                }
            }

            if(A[i] == min)
            {
                mini = i;
                if(maxi != -1)
                {
                    int len = Math.max(mini,maxi) - Math.min(mini,maxi) + 1;
                    minLen = Math.min(len,minLen);
                }
            } 
        } 
        System.out.println(minLen);
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)
