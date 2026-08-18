class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        Set<Integer> tset=new TreeSet<>();
        for(int i:nums){
            tset.add(i);
        }
        List<Integer> set=new ArrayList<>(tset);
        int res=1;
        int curr=1;
        for(int i=1;i<set.size();i++){
            if((set.get(i)-set.get(i-1)) ==1){
                curr++;
            }
            else{
                curr=1;
            }
            res=Math.max(res,curr);
        }
        
        return res;
    }
}