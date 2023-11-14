// Problem Description
// The N-queens puzzle is the problem of placing N queens on an N×N chessboard such that no two queens attack each other.



// Given an integer A denoting the value of N, return all distinct solutions to the N-queens puzzle.

// Each solution contains a distinct board configuration of the N-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
// The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.



// Problem Constraints
// 1 <= A <= 10



// Input Format
// First argument is an integer A denoting the size of chessboard



// Output Format
// Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.



// Example Input
// Input 1:

// A = 4
// Input 2:

// A = 1


// Example Output
// Output 1:

// [
//  [".Q..",  // Solution 1
//   "...Q",
//   "Q...",
//   "..Q."],

//  ["..Q.",  // Solution 2
//   "Q...",
//   "...Q",
//   ".Q.."]
// ]
// Output 1:

// [
//  [Q]
// ]


// Example Explanation
// Explanation 1:

// There exist only two distinct solutions to the 4-queens puzzle:
// Explanation 1:

// There exist only one distinct solutions to the 1-queens puzzle:

import java.util.*;
class NQueens {
    public static List < List < String >> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];
        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
        return res;
    }



    static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }


    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String args[]) {
        int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }

    }
}

// Time Complexity: Exponential in nature since we are trying out all ways, to be precise its O(N! * N).

// Space Complexity: O(N)