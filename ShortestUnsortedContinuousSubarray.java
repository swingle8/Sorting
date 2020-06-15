class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1 ; i < nums.length ; i ++) {
            if (nums[i-1] > nums[i]) {
                if (max < nums[i-1])
                    max = nums[i-1];

                if (min > nums[i])
                    min = nums[i];
            } 
        }
        
        int left = 0;
        for (; left < nums.length ; left++) {
            if (min < nums[left])
                break;
        }
        
        int right = nums.length-1;
        for (; right >= 0 ; right--) {
            if (max > nums[right])
                break;
        }

        int len = (right-left);
        if (len < 0)
            return 0;
        
       return len+1;
     }
}