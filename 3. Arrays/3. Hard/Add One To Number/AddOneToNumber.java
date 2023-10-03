// Problem Description
// Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

// The digits are stored such that the most significant digit is at the head of the list.

// NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

// Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
// A: For the purpose of this question, YES
// Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
// A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


// Problem Constraints
// 1 <= size of the array <= 1000000



// Input Format
// First argument is an array of digits.



// Output Format
// Return the array of digits after adding one.



// Example Input
// Input 1:

// [1, 2, 3]


// Example Output
// Output 1:

// [1, 2, 4]


// Example Explanation
// Explanation 1:

// Given vector is [1, 2, 3].
// The returned vector should be [1, 2, 4] as 123 + 1 = 124.

public class AddOneToNumber {
    public static void main()
    {
        int[] A = {1,2,3};
        int n = A.length;
        int[] B;
        int count = 0;
        //if single 0 digit
        if(n==1 && A[0]==0) 
        {
            A[0]++;
           // return A; This is the final result.
        }
        //if there are any non zeros, remove those and store in another array
        for(int i=0;i<A.length;i++) 
        { 
            if(A[i]!=0)  break;
            else count++; 
        }
        if(count > 0) 
        {
            B = new int[A.length-count];
            int j = 0;
            while(count<A.length) 
            {
                B[j++]=A[count];
                count++;
            }
        } 
        else
        {
            B = new int[A.length];
            B=A;
        }
    
        for(int i=B.length-1;i>=0;i--)
        {
        if(B[i]!=9) 
        {
            B[i]++;
            break;
        } 
        else B[i] = 0; 
        }
        if(B[0]==0)
        {
            int[] newArr = new int[B.length+1];
            newArr[0] = 1;
            //return newArr; This is the final result.
        }
      //  return B; This is the final result.
    }
}
// Time Compleixty : O(N)
// Space Complexity : O(1)