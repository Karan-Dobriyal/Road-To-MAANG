// Problem Description
// Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.



// Problem Constraints
// 1 <= |s| <= 1000



// Input Format
// First line of input contains a string S.



// Output Format
// Print the character of the string S in reverse order.



// Example Input
// Input 1:

//  scaleracademy
// Input 2:

//  cool


// Example Output
// Output 1:

//  ymedacarelacs
// Output 2:

//  looc


// Example Explanation
// Explanation:

//  Print the reverse of the string in a single line.
 
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int st = 0;
        int e = n-1;
        char x[] = s.toCharArray();
        reverse(x,st,e);
        String s1 = String.valueOf(x);
        System.out.println(s1);
        sc.close();
        return;  
    }
       public static void reverse(char s[],int st,int e){
        if(st>e){
            return;
        }
        char t = s[e];
        s[e] = s[st];
        s[st] = t;
        reverse(s,st+1,e-1);
        return;
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1), will take stack memory but it is ok.