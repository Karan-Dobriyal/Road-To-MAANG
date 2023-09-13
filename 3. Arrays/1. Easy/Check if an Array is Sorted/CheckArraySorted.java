// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: True.
// Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

public class CheckArraySorted {
    public static void main(String[] args)
    {
        int[]  a = {1,2,3,4,5};
        int ans=1;
        for(int i=1; i<a.length-1; i++)
        {
            if(a[i-1] <= a[i])
            {
                continue;
            } 
            else 
            {
                ans = 0;
                break;
            }
        }
        System.out.println(ans);
    }
}
// Time Complexity : O(N) and Space Complexity : O(1).
