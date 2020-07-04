//https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/

class Solution {
    public int findKthLargest(int[] nums, int k) {
       int max = Integer.MIN_VALUE;  
        while (k > 0) {
            int index = -1;
            max = Integer.MIN_VALUE;
            for (int i = 0 ; i < nums.length ; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            k--;
            nums[index] = Integer.MIN_VALUE;
        }
        
        return max;
        
        
        
    }
}