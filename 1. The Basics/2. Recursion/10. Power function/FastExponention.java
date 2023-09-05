// Implement Power Function
// Problem Description
// Implement pow(A, B) % C.
// In other words, given A, B and C, Find (AB % C).
// Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.


// Problem Constraints
// -109 <= A <= 109
// 0 <= B <= 109
// 1 <= C <= 109


// Input Format
// Given three integers A, B, C.


// Output Format
// Return an integer.


// Example Input
// Input 1:
// A = 2
// B = 3
// C = 3
// Input 2:
// A = 3
// B = 3
// C = 1


// Example Output
// Output 1:
// 2
// Output 2:
// 0


// Example Explanation
// Explanation 1:
// 23 % 3 = 8 % 3 = 2
// Explanation 2:
// 33 % 1 = 27 % 1 = 0
 
public class FastExponention {
    public int pow(int A, int B, int C) {
         
         if(A == 0) return 0; 
        if(B == 0) return 1; 
        long halfpow = pow(A, B/2, C);
        long ans = (halfpow%C * halfpow%C)%C;

        if(B%2 == 0){
            return (int)ans;
        }
        else{
            ans = (int)(ans%C * A%C)%C; 
            if(ans < 0)  ans+= C; 
            }  
            return (int)ans; 
    }
}

// TC : O(LOGN) and SC : O(1)