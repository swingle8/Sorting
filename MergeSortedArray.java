//https://leetcode.com/problems/merge-sorted-array/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m-1;
        int k = n-1;
        
        int last = nums1.length - 1;
        
        while (l >= 0 && k >= 0) {
            if (nums1[l] > nums2[k]) {
                nums1[last] = nums1[l];
                last--;
                l--;
            }
            else {
                nums1[last] = nums2[k];
                last--;
                k--;
            }
        }
        
        while (k >= 0 && last >= 0) {
            nums1[last] = nums2[k];
            last--;
            k--;
        }
      
        
    }
}