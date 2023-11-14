// Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

// If the answer does not exist return an array with a single integer "-1".

// First sub-array means the sub-array for which starting index in minimum.



// Problem Constraints
// 1 <= length of the array <= 100000
// 1 <= A[i] <= 109
// 1 <= B <= 109



// Input Format
// The first argument given is the integer array A.

// The second argument given is integer B.



// Output Format
// Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".



// Example Input
// Input 1:

//  A = [1, 2, 3, 4, 5]
//  B = 5
// Input 2:

//  A = [5, 10, 20, 100, 105]
//  B = 110


// Example Output
// Output 1:

//  [2, 3]
// Output 2:

//  [-1]


// Example Explanation
// Explanation 1:

//  [2, 3] sums up to 5.
// Explanation 2:

//  No subarray sums up to required number.

public class SubarrayGivenSum {
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};
        int B = 5;
        int i=0,j=0,sum=A[0];
        while(j<A.length)
        {
            if(sum==B)
            {
            int[] sub = new int[j-i+1];  //j-i+1 = length of the sub array
            for(int k=i; k<=j; k++)
            {
                sub[k-i] = A[k];  
            }
            // return sub; Here is your answer.
            }
            else if(sum<B)
            {
                j++;
                if(j<A.length) //since doing j++, checking whether exceeded the length of array
                sum = sum+A[j];//Adding elements at the end
            }
            else
            {
                i++;
                sum = sum-A[i-1]; //Have to remove (start)A[i] but since incremented first, removed A[i-1]
            }
        }
       int[] sub2 = {-1};
       System.out.println(sub2);
       // return sub2 at last.
    }  
    
    // Time Complexity : O(N) and Space Complexity O(1)
}
