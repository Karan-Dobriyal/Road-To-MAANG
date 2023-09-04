// Palindrome Number
// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1

// Follow up: Could you solve it without converting the integer to a string?


class Solution {
    public boolean isPalindrome(int x) { // TC: O(logN) for reversing N digits of input integer and SC:O(1) 
        int dummy = x;
        int Y = reverse(x);
        if (dummy == Y) return true;
        else return false; 
    }

    static int reverse(int x)
    {
        int Y = 0;
        while (x > 0) {
            //Extract the last digit
            int digit = x % 10;
            //Appending last digit
            Y = Y * 10 + digit;
            // Shrinking X by discarding the last digit
            x =x / 10;
      }
      return Y;
    }
}