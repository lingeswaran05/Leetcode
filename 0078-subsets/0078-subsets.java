class Solution {
    public void backtrack(int[] nums,int ind,List<Integer> temp,List<List<Integer>> res){
        if(ind==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[ind]);
        backtrack(nums,ind+1,temp,res);
        temp.remove(temp.size()-1);
        backtrack(nums,ind+1,temp,res);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        backtrack(nums,0,new ArrayList<>(),res);
        // for(int i=0;i<(1<<n);i++){
        //     List<Integer> li =new ArrayList<>();
        //     for(int j=0; j<n;j++){
        //         if( (i & (1<<j))!=0)
        //             li.add(nums[j]);
        //     }
        //     res.add(li);
        // }
    return res;
    }
}