// Find the highest/lowest frequency element

// Example 1:
// Input: array[] = {10,5,10,15,10,5};
// Output: 10 15
// Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

// Example 2:

// Input: array[] = {2,2,3,4,4,2};
// Output: 2 3
// Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.

import java.util.*;

public class HighLowFreq {

public static void getFrequencies(int []v) {

    Map<Integer,Integer>M=new HashMap<>();

    for(int i=0;i<v.length;i++)
    { 
        M.put(v[i], M.getOrDefault(v[i],0)+1); 
    }

    int Maxfreq=0; 
    int Minfreq=v.length; 
    int MaxEle=0; 
    int MinEle=Integer.MAX_VALUE; 
    for(Map.Entry<Integer,Integer>entry:M.entrySet())
    { 
        int count=entry.getValue(); 
        int element=entry.getKey(); 
    
        if(count>Maxfreq)
        { 
            MaxEle=element; 
            Maxfreq=count; 
        }  
        else if(count==Maxfreq)
        { 
            MaxEle=Math.min(MaxEle,element); 
        }  
        if(count<Minfreq)
        { 
            MinEle=element; 
            Minfreq=count; 
        } 
        else if(count==Minfreq)
        { 
            MinEle=Math.min(MinEle, element); 
        } 
    }

    int ans[]={MaxEle,MinEle};  
    for(int i=0; i<ans.length; i++)
    {
        System.out.println(ans[i]);
    }
    // Time Complexity is O(V) and Space Complexity is O(N) because we are creating HashMap as an extra space.
    } 
}
