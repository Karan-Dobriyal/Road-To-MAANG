// Problem Statement: Given an integer N, write a program to count the number of digits in N.
// Example 1:
// Input: N = 12345
// Output: 5
// Explanation: N has 5 digits

// Example 2:
// Input: N = 8394
// Output: 4
// Explanation: N has 4 digits 


// Algorithm / Intuition
// Approach: 
// Store the integer in a variable X and initialize a counter variable to count the number of digits.
// We know that in programming languages when we divide X by Y it will result in an integer (given both the variables are integers).
//  For example, 133/10 will result in 13 similarly 1/10 will result in 0.
// Using a for loop and above observation keep on dividing X by 10 and increment the count in every iteration when X equals 0 
// terminate the loop and the count will have the number of digits in N.


class countOfDigits{
    public static void main(String args[])
    {
        int n = 25879; 
        System.out.println("Number of digits in "+n+" is "+getCountOfDigits(n)); 

        // or we can do like this 
        // n = 12345
        // log10(12345) = 4.091
        // Integral part of 4.091 is 4 and 4 + 1 =  5 which is also the number of digits in 12345    
        int digits = (int) Math.floor(Math.log10(n) + 1);
        System.out.println("Number of digits in "+n+" is "+digits + " using Log base 10"); // TC : O(1) and SC : O(1)
    }   

    static int getCountOfDigits(int n) // TC: O (n) and  SC: O(1)
    {
        int count = 0;

        while(n > 0)
        { 
            count++;
            n=n/10;
        }
        return count;
    }
}
