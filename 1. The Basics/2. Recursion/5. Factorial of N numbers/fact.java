// Factorial of a Number
// Example 1:
// Input: X = 5
// Output: 120
// Explanation: 5! = 5*4*3*2*1

// Example 2:
// Input: X = 3
// Output: 6
// Explanation: 3!=3*2*1

class Recursion {
    
    static int factorial(int n){ 
            // Base Condition.
            if(n == 0){ 
                return 1;
            } 
            // Problem broken down into 2 parts and then combined.
            return n * factorial(n-1); 

    }
    public static void main(String[] args) { 
       // Here, let’s take the value of n to be 3.
       int n = 3;
       System.out.println(factorial(n));
    }
}
// Time Complexity: O(N)
// pace Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function
// calls waiting to get completed and that would make it an O(N) recursion stack space }.