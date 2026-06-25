1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n=nums.length;
4        int maxsum=Integer.MIN_VALUE;
5        int[] ps=new int[n+1];
6        ps[0]=0;
7        for(int i=1;i<=n;i++){
8            ps[i]=ps[i-1]+nums[i-1];
9        }
10        for(int i=k;i<=n;i++){
11            if(ps[i]-ps[i-k] > maxsum) maxsum=ps[i]-ps[i-k] ;
12        }
13        return (double) maxsum/k;
14    }
15}