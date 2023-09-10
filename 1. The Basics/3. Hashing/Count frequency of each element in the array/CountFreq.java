// Count frequency of each element in the array

// Example 1:
// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	 5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	      5 occurs 2 times in the array
//               15 occurs 1 time in the array

// Example2: 
// Input: arr[] = {2,2,3,4,4,2};
// Output: 2  3
// 	3  1
//         4  2
// Explanation: 2 occurs 3 times in the array
// 	     3 occurs 1 time in the array
//              4 occurs 2 time in the array

public class CountFreq {
    public static int[] countFrequency(int n, int x, int []nums){
        // Create a frequency array 'freq' of size 'n'
        // with all elements initialized to 0.
        int []ans = new int[n];

        // Traverse the input array 'nums'.
        for (int num : nums)
        {
            // Check if the element 'num' is within the range of 1 to n.
            if (num <= n)
            {
                // Increment the frequency of 'num' in 'ans'.
                ans[num - 1]++;
            }
        }

        // Return the vector 'ans' containing the frequencies.
        return ans;
    }
    // Time Complexity : O(N) and Space Complexity O(1).
}