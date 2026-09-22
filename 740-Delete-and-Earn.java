class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int[] pt=new int[n+1];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){map.put(i,map.getOrDefault(i,0)+1);}

        for(Map.Entry<Integer,Integer> es : map.entrySet()){
            pt[es.getKey()]= map.getOrDefault(es.getKey(),0) * es.getKey();
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=pt[1];
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+pt[i]);
        }
        return dp[n];
    }
}