// Sort Array in given Order

// Given two arrays of integers A and B, Sort A in such a way that the relative order among the elements will be the same as those are in B.
// For the elements not present in B, append them at last in sorted order.

// Return the array A after sorting from the above method.

// NOTE: Elements of B are unique.



// Problem Constraints
// 1 <= length of the array A <= 100000

// 1 <= length of the array B <= 100000

// -10^9 <= A[i] <= 10^9



// Input Format
// The first argument given is the integer array A.

// The second argument given is the integer array B.



// Output Format
// Return the array A after sorting as described.



// Example Input
// Input 1:

// A = [1, 2, 3, 4, 5, 4]
// B = [5, 4, 2]
// Input 2:

// A = [5, 17, 100, 11]
// B = [1, 100]


// Example Output
// Output 1:

// [5, 4, 4, 2, 1, 3]
// Output 2:

// [100, 5, 11, 17]


// Example Explanation
// Explanation 1:

// Since 2, 4, 5, 4 of A are present in the array B.  So Maintaining the relative order of B.
// Thus, [5, 4, 4, 2] and appending the remaining element (1, 3) in sorted order.

// The Final array is [5, 4, 4, 2, 1, 3]
// Explanation 2:

// Since 100 of A are present in the array B.  So Maintaining the relative order of B.
// Thus, [100] and appending the remaining element (5, 11, 17) in sorted order.

// The Final array is [100, 5, 11, 17]

import java.util.ArrayList;

public class SortArrayInGivenOrder {
    public static void main(String[] args)
    { 
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(4); 
        ArrayList<Integer> B = new ArrayList<>();
        A.add(5);
        A.add(4);
        A.add(2);
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<B.size(); i++)
        {
            set.add(B.get(i));
        }
        for(int i=0; i<A.size(); i++)
        {
            if(map.containsKey(A.get(i)))
            {
                map.put(A.get(i),map.get(A.get(i))+1);
            }
            else
            {
                map.put(A.get(i),1);
            }
        }
        for(int i=0; i<B.size(); i++)
        {
            if(map.containsKey(B.get(i)))
            {
                int a = map.get(B.get(i));
                for(int j=1; j<=a; j++) ans.add(B.get(i));
            }
        }
        Collections.sort(A);
        for(int i=0; i<A.size(); i++)
        {
            if(set.contains(A.get(i)) == false)
            {
                ans.add(A.get(i));
            }
        }
    }

    // Time Complexity : O(NLOGN) and Space Complexity : O(N)
}
