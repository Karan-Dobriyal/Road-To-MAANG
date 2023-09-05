// Print 1 to N Without Loop

public class printNumbers {
    public static int[] printNos(int x) {
        int[] ans = new int[x];
        printNum(x,ans);
        return ans;
    }

    // TC : O(N) and SC : O(1)
    static void printNum(int num, int[] ans)
    {
        if(num == 1)
        {
            ans[num-1] = num;
            return;
        }
        printNum(num-1, ans);
        ans[num-1] = num;
        
    }
}