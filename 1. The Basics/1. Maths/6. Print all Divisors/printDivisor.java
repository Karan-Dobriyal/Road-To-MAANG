// Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as
//  zero when divided.
// Example 1:
// Input: n = 36
// Output: 1 2 3 4 6 9 12 18 36
// Explanation: All the divisors of 36 are printed.

// Example 2:
// Input: n = 97
// Output: 1 97
// Explanation: Since 97 is a prime number, only 1 and 97 are printed.

// Intuition:
//  We can also think of another approach. If we take a closer look,
//  we can notice that the quotient of a division by one of the divisors is actually another divisor. Like, 4 divides 36.
//  The quotient is 9, and 9 also divides 36.
// Another intuition is that the root of a number actually acts as a splitting part of all the divisors of a number.
// Also, the quotient of a division by any divisor gives an equivalent divisor on the other side. Like, 4 gives 9 while 
// dividing 36. See the image below.

// Approach:
// From the intuition, we can come to the conclusion that we don’t need to traverse all the candidates and if we found a
// single divisor, we can also find another divisor(Here, we need to be careful, if the given number is a perfect square,
//  like 36, 6 also give 6 as quotient. This is a corner case.)
// By keeping these in mind, it is enough if we traverse up to the root of a number. Whenever we find a divisor, we print
// it and also print the quotient. If the quotient is the same, we ignore it. Because the root of a perfect square will
// give the same quotient as itself.
// The quotients are the numbers that are on the other side of the root. So, it’s okay if we stop traversing at the root.
// This approach is more time efficient than the previous one. But the output sequences are not the same. In the previous 
// approach, we get an ordered output unlike here.

public class printDivisor {
    public static int sumOfAllDivisors(int n){ 
      int ans = 0;
        for(int i=1; i<=n; i++)
        {
            ans+=countOfFactors(i);
        }
        return ans;
    }

   static int countOfFactors(int num)
   { 
       int count = 0;
       for(int i=1; i<=(int)Math.sqrt(num); i++)
       {
           if(num%i == 0)
           {
                if(num/i == i) count+=i;
                else count+=i+num/i;
           }
       } 
       return count;
   }
}
// Time Complexity: O(sqrt(n)), because every time the loop runs only sqrt(n) times.
// Space Complexity: O(1), we are not using any extra space.