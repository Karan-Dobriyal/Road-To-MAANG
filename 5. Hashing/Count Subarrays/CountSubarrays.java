// Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and told you to find the number of subarrays of A, that have unique elements.

// Since the number of subarrays could be large, return value % 109 +7.



// Problem Constraints

// 1 <= N <= 105

// 1 <= A[i] <= 106



// Input Format

// The only argument given is an Array A, having N integers.



// Output Format

// Return the number of subarrays of A, that have unique elements.



// Example Input

// Input 1:

//  A = [1, 1, 3]
// Input 2:

//  A = [2, 1, 2]


// Example Output

// Output 1:

//  4
// Output 1:

//  5


// Example Explanation

// Explanation 1:

//  Subarrays of A that have unique elements only:
//  [1], [1], [1, 3], [3]
// Explanation 2:

//  Subarrays of A that have unique elements only:
//  [2], [1], [2, 1], [1, 2], [2]

import java.util.ArrayList;
import java.util.HashSet;

public class CountSubarrays {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);        
        A.add(1);
        A.add(3);

        long count = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        int i = 0;
        int j = 0;

        while(j < A.size()){
            if(hs.contains(A.get(j))){
                hs.remove(A.get(i));
                i++;
            }else{
                hs.add(A.get(j));
                count += j - i + 1; /*  the size of the window.*/
                j++;
            }
        }
        System.out.println((int)(count%1000000007));
    }
    // Time Complexity : O(N) and Space Complexity : O(N)
}
