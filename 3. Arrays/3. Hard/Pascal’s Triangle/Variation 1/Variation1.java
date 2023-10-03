// Example 1:
// Input Format: N = 5, r = 5, c = 3
// Result: 6 (for variation 1)
// 1 4 6 4 1 (for variation 2)

// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1    (for variation 3)

// Explanation: There are 5 rows in the output matrix. Each row is formed using the logic of Pascal’s triangle.

// Example 2:
// Input Format: N = 1, r = 1, c = 1
// Result: 1 (for variation 1)
//     1 (for variation 2)
//     1  (for variation 3)
// Explanation: The output matrix has only 1 row.


import java.util.*;

public class tUf {
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }
}  
// Output: The element at position (r,c) is: 6

// Complexity Analysis
// Time Complexity: O(c), where c = given column number.
// Reason: We are running a loop for r times, where r is c-1.

// Space Complexity: O(1) as we are not using any extra space.