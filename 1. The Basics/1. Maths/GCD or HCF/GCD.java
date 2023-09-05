// Find GCD of two numbers
// Example 1:
// Input: num1 = 4, num2 = 8
// Output: 4
// Explanation: Since 4 is the greatest number which divides both num1 and num2.

// Example 2:
// Input: num1 = 3, num2 = 6
// Output: 3
// Explanation: Since 3 is the greatest number which divides both num1 and num2.

// Algorithm / Intuition
// Solution 2: Using Euclidean’s theorem.

// Intuition: Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.


// Approach:

// Recursively call gcd(b,a%b) function till the base condition is hit.
// b==0 is the base condition.When base condition is hit return a,as gcd(a,0) is equal to a.

public class GCD {    // Time Complexity: O(logMin(a,b)) Space Complexity: O(1)
    public static void getGCD(int n, int m){ 
        int ans = calcGCD(n,m);
        System.out.println(ans);
    }

public static int calcGCD(int n, int m){ 
       if(m == 0) return n; 
      return  calcGCD(m, n%m);  
    }
}