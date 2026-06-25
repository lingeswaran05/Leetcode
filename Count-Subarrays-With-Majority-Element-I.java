1class Solution {
2
3    public int countMajoritySubarrays(int[] nums, int k){ 
4        int n=nums.length;
5        int ans=0;
6        for(int i=0;i<n;i++){
7            int cnt=0;
8            for(int j=i;j<n;j++){
9                if(nums[j]==k) cnt++;
10                int len=j - i + 1;
11                if(cnt >  len / 2 ) ans++;
12            }
13        }
14        return ans;
15    }
16}