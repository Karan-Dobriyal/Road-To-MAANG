// Example 1:
// Input: [1,2,4,7,7,5]
// Output: Second Smallest : 2
// 	Second Largest : 5
// Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

// Example 2:
// Input: [1]
// Output: Second Smallest : -1
// 	Second Largest : -1
// Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

public class SecondSmallestSecondLargest {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6};
        int[] ans = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++)
        {
           if(min > a[i]) min = a[i];
           if(max < a[i]) max = a[i];
        }
        int secMax = Integer.MIN_VALUE;;
        int secMin = Integer.MAX_VALUE;;

        for(int i=0; i<a.length; i++)
        {
            if(a[i] != max)
            {
               secMax = Math.max(secMax,a[i]);
            }
            if(a[i] != min)
            {
               secMin = Math.min(secMin,a[i]);     
            }
        }
        ans[0] = secMax;
        ans[1] = secMin;

    }
}
// Time Complexity : O(N) and Space Complexity : O(1).
