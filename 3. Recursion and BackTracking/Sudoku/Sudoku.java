// Problem Description
// Write a program to solve a Sudoku puzzle by filling the empty cells. Empty cells are indicated by the character '.' You may assume that there will be only one unique solution.



// A sudoku puzzle,



// and its solution numbers marked in red.



// Problem Constraints
// N = 9


// Input Format
// First argument is an array of array of characters representing the Sudoku puzzle.


// Output Format
// Modify the given input to the required answer.


// Example Input
// Input 1:

// A = [[53..7....], [6..195...], [.98....6.], [8...6...3], [4..8.3..1], [7...2...6], [.6....28.], [...419..5], [....8..79]]


// Example Output
// Output 1:

// [[534678912], [672195348], [198342567], [859761423], [426853791], [713924856], [961537284], [287419635], [345286179]]


// Example Explanation
// Explanation 1:

// Look at the diagrams given in the question.

import java.util.*;

class Sudoku {

  public static boolean solveSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {

          for (char c = '1'; c <= '9'; c++) {
            if (isValid(board, i, j, c)) {
              board[i][j] = c;

              if (solveSudoku(board))
                return true;
              else
                board[i][j] = '.';
            }
          }

          return false;
        }
      }
    }
    return true;
  }

  public static boolean isValid(char[][] board, int row, int col, char c) {
    for (int i = 0; i < 9; i++) {
      if (board[i][col] == c)
        return false;

      if (board[row][i] == c)
        return false;

      if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {

   char[][] board= {
                    {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                    {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                    {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                    {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                    {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                    {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                    {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                    {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                    {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                    };
    solveSudoku(board);

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++)
        System.out.print(board[i][j] + " ");
      System.out.println();
    }
  }
}

// Time Complexity: O(9(n ^ 2)), in the worst case, for each cell in the n2 board, we have 9 possible numbers.

// Space Complexity: O(1), since we are refilling the given board itself, there is no extra space required, so constant space complexity.