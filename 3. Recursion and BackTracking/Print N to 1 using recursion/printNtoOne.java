public class printNtoOne
{
    public static int[] printNos(int x) {
        int[] ans = new int[x]; 
        printNum(x,ans); 
        return ans; 
    }
    // TC : O(N) and SC : O(N)
    static void printNum(int num,int[] ans) {
         if(num==1) { 
            ans[ans.length-1] = num;
            return;
        }
        ans[ans.length-num] = num;
        printNum(num-1,ans);
    }
}