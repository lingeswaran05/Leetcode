class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0,tsum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int val=nums[i]+nums[l]+nums[r];
                if(Math.abs(val-target) < Math.abs(tsum-target) ){
                    tsum=val;
                }
                else if(val<target){
                    l++;
                }
                else if(val>target)
                    r--;
                else
                    return val;           }
        }

        return tsum;
    }
}