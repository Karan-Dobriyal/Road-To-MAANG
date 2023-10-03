// Problem Description
// Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

// You may assume that the intervals were initially sorted according to their start times.



// Problem Constraints
// 0 <= |intervals| <= 105



// Input Format
// First argument is the vector of intervals

// second argument is the new interval to be merged



// Output Format
// Return the vector of intervals after merging



// Example Input
// Input 1:

// Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
// Input 2:

// Given intervals [1, 3], [6, 9] insert and merge [2, 6] .


// Example Output
// Output 1:

//  [ [1, 5], [6, 9] ]
// Output 2:

//  [ [1, 9] ]


// Example Explanation
// Explanation 1:

// (2,5) does not completely merge the given intervals
// Explanation 2:

// (2,6) completely merges the given intervals


public class MergeIntervals {
    public static void main()
    {
        /**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
        ArrayList<Interval> list = new ArrayList<>();
        int n = intervals.size();
  
        for(int i=0; i<n; i++)
        {
            Interval status = intervals.get(i);
            int oldSi = status.start;
            int oldEi = status.end;
            int newSi = newInterval.start;
            int newEi = newInterval.end; 
            if(newSi > oldEi)
            {
              list.add(status);
            }
            else if(oldSi > newEi)
            {
              list.add(newInterval);
              for(int j=i; j<n; j++)
              {
                  status = intervals.get(j);
                  list.add(status);
              }
              return list;
            }
            else 
            {
              newInterval.start = Math.min(oldSi,newSi);
              newInterval.end =   Math.max(oldEi,newEi);
            }
        }
        list.add(newInterval);
        // Just Print the List.
    }
}


// Time Complexity : O(N)
// Space Compleixty : O(1)