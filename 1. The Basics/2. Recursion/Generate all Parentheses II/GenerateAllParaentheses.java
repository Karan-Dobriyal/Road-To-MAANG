// Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.



// Problem Constraints
// 1 <= A <= 10



// Input Format
// First and only argument is integer A.



// Output Format
// Return a sorted list of all possible parenthesis.



// Example Input
// Input 1:

// A = 3
// Input 2:

// A = 1


// Example Output
// Output 1:

// [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
// Output 2:

// [ "()" ]


// Example Explanation
// Explanation 1:

//  All paranthesis are given in the output list.
// Explanation 2:

//  All paranthesis are given in the output list.

import java.util.*;
public class GenerateAllParaentheses {
    static  ArrayList<String> lst;
    public void generateParenthesis(int A) {
        lst = new ArrayList<String>();
        String ans = "";
        ArrayList<String> a = paraenthesis(A,0,0,ans);

    }

    static  ArrayList<String> paraenthesis(int A, int o , int c, String str)
    { 
        if(str.length() == 2*A) 
        {
            lst.add(str);
            return lst;
        }
        if(o<A)
        {
            paraenthesis(A,o+1,c,str+"(");
        }
        if(c<o)
        {
            paraenthesis(A,o,c+1,str+")");
        } 
        return lst;
    }

    // Time Complexity : O(2^n) and Space Complexity : O(N)
}
