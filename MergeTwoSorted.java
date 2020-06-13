public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = A.length;
        int n = B.length;
        int[] R = new int[m+n];
        
        while(i<m && j<n){
            if(A[i]<B[j]){
                R[k++] = A[i++];
            }else{
                R[k++] = B[j++];
            }
        }
        
        while(i<m){
            R[k++] = A[i++];
        }
        
        while(j<n){
            R[k++] = B[j++];
        }
        
        return R;
    }
}