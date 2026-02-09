1class Solution {
2    public int maxSubArray(int[] nums) { 
3        int curr = nums[0];
4        int res = nums[0];
5
6        for (int i = 1; i < nums.length; i++) {
7            curr = Math.max(nums[i], curr + nums[i]);
8            res = Math.max(res, curr);
9        }
10        return res;
11    }
12}