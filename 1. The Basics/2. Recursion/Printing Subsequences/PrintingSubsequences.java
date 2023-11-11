// Problem Statement

// Given an Array print all the Possible Subsequences.

// ex int[] arr = [3,1,2]
// o/p = 3 1 2
//       3 1
//       3 2
//       3
//       1 2
//       2
//       {}

// TakeAways. 
// Pick and not Pick

import java.util.*;

public class PrintingSubsequences {
    public static void PrintingSubsequences1(String[] args) {
    int[] arr = {3,1,2};
    int n = 3;
    ArrayList<Integer> lst = new ArrayList<>();
    printF(0,lst,arr,n);
  }
  
  static void printF(int index, ArrayList<Integer> lst, int[] arr, int n)
  {
    if(index == n)
    {
      for(int i=0; i<lst.size(); i++) System.out.print(lst.get(i));
       if(lst.size() == 0) System.out.print("{}");
      System.out.println();
      return;
    }
    
    lst.add(arr[index]);
    printF(index+1,lst,arr,n);
    lst.remove(lst.size()-1);
    printF(index+1,lst,arr,n);
  }
}

// Time Complexity : O(2^N) X N (for Printing the Array)
// Space Complexity : O(N)