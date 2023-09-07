// Count Subarray Zero Sum

// Problem Description
// Given an array A of N integers.

// Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7


// Problem Constraints
// 1 <= N <= 105
// -109 <= A[i] <= 109


// Input Format
// Single argument which is an integer array A.


// Output Format
// Return an integer.


// Example Input
// Input 1:

//  A = [1, -1, -2, 2]
// Input 2:

//  A = [-1, 2, -1]


// Example Output
// Output 1:

// 3
// Output 2:

// 1


// Example Explanation
// Explanation 1:

//  The subarrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].
// Explanation 2:

//  The subarray with zero sum is [-1, 2, -1].

import java.util.ArrayList;
import java.util.HashMap;

public class CountSubArrZeroSum {
    public static void main()
    {
        ArrayList<Integer> A=new ArrayList<Integer>();  
        A.add(1);  
        A.add(-1);  
        A.add(2);  
        A.add(-2);  
        long count = 0l;
        ArrayList<Long> psum = new ArrayList<>();
        psum.add((long)A.get(0));
        if(psum.get(0)==0){
            count++;
        }
        for(int i=1;i<A.size();i++){
            long val = ((long)A.get(i) + psum.get(i-1)%1000000007)%1000000007;
            psum.add(val);
            if(psum.get(i)==0){
                count++;
            }
        }
        HashMap<Long,Long> map = new HashMap<>();
        for(long x:psum){
            if(map.containsKey(x)){
                count = count+map.get(x);
                long f = map.get(x);
                map.put(x,f+1);
            }
            else{
                map.put(x,1l);
            }
        }
        count = (count%1000000007)%1000000007;
       System.out.println(count);
    } 
    // Time Complexity : O(N) and Space Complexity : O(N).
}
