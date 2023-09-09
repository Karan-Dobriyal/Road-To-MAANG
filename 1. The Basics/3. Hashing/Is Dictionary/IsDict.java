// Is Dictionary?

// Problem Description
// Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

// Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



// Problem Constraints
// 1 <= N, length of each word <= 105

// Sum of the length of all words <= 2 * 106



// Input Format
// The first argument is a string array A of size N.

// The second argument is a string B of size 26, denoting the order.



// Output Format
// Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



// Example Input
// Input 1:

//  A = ["hello", "scaler", "interviewbit"]
//  B = "adhbcfegskjlponmirqtxwuvzy"
// Input 2:

//  A = ["fine", "none", "bush"]
//  B = "qwertyuiopasdfghjklzxcvbnm"


// Example Output
// Output 1:

//  1
// Output 2:

//  0


// Example Explanation
// Explanation 1:

//  The order shown in string B is: h < s < i (adhbcfegskjlponmirqtxwuvzy) for the given words. 
//  So, Return 1.
// Explanation 2:

//  "none" should be present after "bush", Since b < n (qwertyuiopasdfghjklzxcvbnm). 
//  So, Return 0.

public class IsDict {
    public static void main(String[] args)
    {
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        int res = -1;
        int[] char_map = new int[26];

        for(int i=0; i<order.length(); i++)
        {
            char_map[order.charAt(i)-'a'] = i;
        }

        for(int i=1; i<words.length; i++)
        {
            int check = compare(words[i-1],words[i],char_map);
            if(check>0)
            {
                res = 0;
            }
        }
       res = 1;
       System.out.println(res);
    }

    public static int compare(String word1, String word2, int[] char_map)
    {
        int i=0;
        int j=0;
        int compare_val = 0;

        while(i<word1.length() && j<word2.length() && compare_val == 0)
        {
            compare_val = char_map[word1.charAt(i)-'a'] - char_map[word2.charAt(i)-'a'];
            i++;
            j++;
        }
        if(compare_val == 0)
        {
            return word1.length() - word2.length();
        }
        else 
        {
            return compare_val;
        }
    }
    // Time Complexity is O(N) and Space Complexity is O(1) because the array is size is fixed which is 26. 
}
