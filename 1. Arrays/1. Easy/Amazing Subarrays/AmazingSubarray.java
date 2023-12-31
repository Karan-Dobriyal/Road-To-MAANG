// You are given a string S, and you have to find all the amazing substrings of S.

// An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

// Input

// Only argument given is string S.
// Output

// Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
// Constraints

// 1 <= length(S) <= 1e6
// S can have special characters
// Example

// Input
//     ABEC

// Output
//     6

// Explanation
//     Amazing substrings of given string are :
//     1. A
//     2. AB
//     3. ABE
//     4. ABEC
//     5. E
//     6. EC
//     here number of substrings are 6 and 6 % 10003 = 6.

public class AmazingSubarray {
    public static void main()
    {
        String A = "ABEC";
        HashSet<Character> se = new HashSet<>();
        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
        se.add('A'); se.add('E'); se.add('I'); se.add('O'); se.add('U');
        
        int n = A.length();
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(se.contains(A.charAt(i))){
                ans += (n - i);
            }
        }
        System.out.println((int)(ans%10003));
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)