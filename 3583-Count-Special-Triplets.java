class Solution {
    private static final long MOD=1_000_000_007;
    public int specialTriplets(int[] nums) {
        long res=0;
        int n=nums.length;

        int target;
        long leftcnt,rightcnt;
        HashMap<Integer,Integer> right=new HashMap<>();
        HashMap<Integer,Integer> left=new HashMap<>();
        for(int x:nums) right.put(x,right.getOrDefault(x,0)+1);

        for(int j=0;j<n-1;j++){
            right.put(nums[j],right.getOrDefault(nums[j],1)-1);
            target=nums[j]*2;
            leftcnt=left.getOrDefault(target,0);
            rightcnt=right.getOrDefault(target,0);
            res+=((leftcnt * rightcnt)%MOD);
            left.put(nums[j],left.getOrDefault(nums[j],0)+1);
        }
        return (int)(res % MOD);
    }
}