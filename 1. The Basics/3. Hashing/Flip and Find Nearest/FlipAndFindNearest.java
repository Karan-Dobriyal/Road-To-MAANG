// Given a binary string A of size N. There are Q queries given by the 2-D array B of size Q x 2.

// Each query has 2 integers :-

// First integer denotes the type of query. Type of query can be either 1 or 2.
// Second integer denotes index x.
// If type = 1, Flip the value at index x.

// If type = 2, Find the index of the nearest 1 to the left or right of index x in the array. If there are multiple indices has the same distance from x, return the index with the lower value. If there is no occurrence of 1 in the array, return -1.

// Note :
// We use 1-based indexing



// Problem Constraints
// 1 <= N <= 105

// 1 <= Q <= 105

// 1 <= B[i][0] <= 2

// 1 <= B[i][1] <= N



// Input Format
// First argument A is a string.

// Second argument B is a 2D array of integers describing the queries.



// Output Format
// Return an array of integers denoting the answers to each query of type 2.



// Example Input
// Input 1:
// A = "10010"
// B = [[1, 2]
//      [2, 3]]
// Input 2:
// A = "010000100"
// B = [[2, 5]
//      [1, 7]
//      [2, 9]]


// Example Output
// Output 1:
// [2]
// Output 2:
// [7, 2]


// Example Explanation
// For Input 1:
// After first query, A = "11010".
// For second query, X = 3. Both index 2 and index 4 are at the same 
// distance but we choose the lower index.
// For Input 2:
// For first query, the index 2 is at a distance 3 and index 7 is at a distance 2. So we choose
// index 7.
// After second query, A = "010000000"
// For third query, the only index with '1' is 2.

public class FlipAndFindNearest {
    public static void main(String[] args)
    {
        Sring A = "10010";
        int[][] B = {{1, 2},{2, 3}};
        char[] C=A.toCharArray();
        int k=0,index=-1;
        int p1=-1,p2=-1;
        int n = B.length;
        int[] result = new int[n];

        for(int j=0;j< B.length;j++){
             if(B[j][0] ==1){
            int l = B[j][1]-1;
                C[l] =  (char)( (int)((C[l]-'0') ^1 ) + '0');
             }else{
               p2=p1=B[j][1]-1;
               index = findNearestOne(C,p1,p2);
               result[k++]=index;
             }
        }
        int count=0;
        for(int i=0;i<result.length;i++){
            if(result[i]!=0)
              count++;
        }
        int[] res = new int[count]; int l=0; 
        for(int i=0;i<result.length;i++){
            if(result[i]!=0)
              res[l++] = result[i];
        }
        System.out.println(res);
    }
    static int findNearestOne(char[] C,int p1,int p2){
        int li=-1,ri=-1;

        while(p1>=0 || p2<C.length){ 
        if(p1>=0) {
            if(C[p1] != '1'){
                p1--;
            }else{
                li=p1;
                return li+1;
            }
        }
        if(p2<C.length) { 
            if(C[p2] != '1'){
                p2++;
            }else{
                ri=p2;
                return ri+1;
            }
        }
        }
          return -1; 
    }
}

// Time Complexity : O(N) ans Space Complexity O(1).
