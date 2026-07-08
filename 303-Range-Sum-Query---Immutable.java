class NumArray {
    int[] ps;
    public NumArray(int[] nums) {
        int n=nums.length;
        ps=new int[n+1];
        ps[0]=0;

        for(int i=1;i<=n;i++){
            ps[i]= ps[i-1]+nums[i-1];
        }
    }
    public int sumRange(int left, int right) {
        return ps[right+1] - ps[left];
    }
}
