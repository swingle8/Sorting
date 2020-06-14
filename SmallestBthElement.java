//solved the same questoin with Binary search in the searching repo.
// Here solving it using Selection Sort with high time complexity
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        List<Integer> C = new ArrayList<Integer>(A);
        for (int i = 0 ; i < C.size() ; i++) {
            int min = C.get(i);
            int min_index = i;
            
            for (int j = i ; j < C.size() ; j++) {
                if (min > C.get(j)) {
                    min = C.get(j);
                    min_index = j;
                }
            }
            
            C.set(min_index, C.get(i));
            C.set(i, min);
            B--;
            
            if (B == 0)
                return min;
        }
        
        return -1;
    }
}
