// Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only 
// divisible by 1 and by itself.
// Example 1:
// Input: N = 3
// Output: Prime
// Explanation: 3 is a prime number

// Example 2:
// Input: N = 26
// Output: Non-Prime
// Explanation: 26 is not prime

// Algorithm / Intuition 

// Approach: Running the for loop till the square root of the number

// A prime number is a natural number that is only divisible by 1 and by itself. Examples 1 2 3 5 7 11 13 17 19 …

// Using a for loop for checking if the number is divisible by a number from 2 to its square root.

// Running the for loop from 2 to the square root of the number.

// And then checking if the number is divisible by the numbers from 2 to its square root.

// Then, If the remainder is zero, that means it is divisible and hence not a prime number.

// If the loop runs till square root and none of the numbers divided it completely. So it is the Prime number.
 

public class isPrime {  // Time Complexity: O(√n) and Space Complexity: O(1).
	public static boolean isPrimeNumber(int num) {
		int ans = countOfFactos(num);
		if(ans == 2) return true;
		else return false;
	}

	static int countOfFactos(int num)
	{
		int count = 0;
		int sqrt = (int)Math.sqrt(num);
		for(int i=1; i<=sqrt; i++)
		{
			if(num%i == 0)
			{
				if(num/i == i) count+=1;
				else count+=2;
			}
		}
		return count;
	}
}