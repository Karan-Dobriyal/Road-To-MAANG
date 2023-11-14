// Problem Description
// Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



// Problem Constraints
// 1 <= |A| <= 100000



// Input Format
// First and only argument is the vector A



// Output Format
// Return one integer, the answer to the question



// Example Input
// Input 1:

// A = [0, 1, 0, 2]
// Input 2:

// A = [1, 2]


// Example Output
// Output 1:

// 1
// Output 2:

// 0


// Example Explanation
// Explanation 1:

// 1 unit is trapped on top of the 3rd element.
// Explanation 2:

// No water is trapped.


public class RainWaterTrapped {
    public static void main()
    {
        int[] A = {0, 1, 0, 2};
        int ans = 0;
        int[] lmax = new int[A.length];
        int leftCurrentMax = A[0];
        lmax[0] =  leftCurrentMax;

        int[] rmax = new int[A.length];
        int rightCurrentMax = A[A.length-1];
        rmax[rmax.length-1] = rightCurrentMax;

        // 1. Creating the LMax Array from Left to Right find the Max Elements in l-r
        for(int i=1; i<A.length; i++)
        {
            if(leftCurrentMax < A[i])
            {
                leftCurrentMax = A[i];
                lmax[i] = A[i];
            }
            else
            {
                lmax[i] = leftCurrentMax;
            }
        }

        // 2. Creating the RMax Array From Right to left find the Max elements in r-l

        for(int i=A.length-2; i>=0; i--)
        {
            if(A[i] > rightCurrentMax)
            {
                rightCurrentMax = A[i];
                rmax[i] = A[i];
            }
            else
            {
                rmax[i] = rightCurrentMax;
            }
        }


        for(int i=0; i<A.length; i++)
        {
            ans += Math.min(lmax[i],rmax[i]) - A[i];
        }
        
        System.out.println(ans);
    }
}
// Time and Space Complexity : O(N)