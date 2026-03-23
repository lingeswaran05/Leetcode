class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,n=nums.length,sum=0;
        int curlen=1,res=Integer.MAX_VALUE;
        while(i < n && j < n){
            sum+=nums[j];
            while(sum >= target){
                res=Math.min(res, j - i + 1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}