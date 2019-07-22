Time Complexity:O(n)
Space Complexity:O(1)

//Approach Count number of zeros in the end
//When zeroCount is greater than K , that means we need to calculate end-start+1
//Hence we put start to new zero to calculate next sliding window

class Solution {
    public int longestOnes(int[] A, int K) {
        
        int start =0;
        int zeroCount =0;
        int res =0;
        
       for(int end =0;end<A.length;end++)
       {
           if(A[end]==0)
               zeroCount++;
           
           while(zeroCount>K)
           {
               if(A[start]==0) zeroCount--;
               start++;
           }
           
           Math.max(res,end-start+1);
       }
        return res;
    }
}
