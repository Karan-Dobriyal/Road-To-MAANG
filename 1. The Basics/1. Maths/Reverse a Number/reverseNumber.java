// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
//  signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:

// -231 <= x <= 231 - 1

class ReverseNumber {
    public int reverse(int x) {  //  Time Complexity: O(n), where n is the length of the given number and Space Complexity: O(1)
        int power = countDigits(x);
        int p1 = power;
        long ans = 0; 
        while(x!=0)
        {
            int res = x%10; 
            ans += res * Math.pow(10,p1);
            x/=10; 
            p1--; 
        }
        if(ans>Math.pow(2,31) || ans<Math.pow(-2,31)) return 0;
        return (int)ans;
    }

    static int countDigits(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        return count-1;
    }
}