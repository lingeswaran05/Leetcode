class Solution {
    public void backtrack(int[]nums,int ind,List<Integer> temp,List<List<Integer>> res){
        
        res.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1])
                continue;
            temp.add(nums[i]);
            backtrack(nums,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
}