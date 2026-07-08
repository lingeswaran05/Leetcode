class NumArray {
    
    private int[] tree;
    private int[] nums;
    private int n;
    
    public NumArray(int[] nums) {
        this.n=nums.length;
        this.tree=new int[n+1];
        this.nums=nums.clone();
        for(int i=0;i<n;i++){
           add(i+1,nums[i]);
        }
    }
    public int prefixsum(int i){
        i++;
        int sum=0;
        while(i>0) {
            sum+=tree[i];
            i-=(i & (-i));
        }
        return sum;
    }
    public void update(int index, int val) {
        int delta=val-nums[index];
        nums[index]=val;
        add(index+1,delta);
    }
    public void add(int index, int val) {
        while(index <= n){
            tree[index]+=val;
            index += index & (-index);
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefixsum(right);
        return prefixsum(right) - prefixsum(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */