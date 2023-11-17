// Given a digit string A, return all possible letter combinations that the number could represent.

// A mapping of digit to letters (just like on the telephone buttons) is given below.



// The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

// NOTE: Make sure the returned strings are lexicographically sorted.



// Problem Constraints
// 1 <= |A| <= 10



// Input Format
// The only argument is a digit string A.



// Output Format
// Return a string array denoting the possible letter combinations.



// Example Input
// Input 1:

//  A = "23"
// Input 2:

//  A = "012"


// Example Output
// Output 1:

//  ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
// Output 2:

//  ["01a", "01b", "01c"]

import java.util.*;
class LetterPhone {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}