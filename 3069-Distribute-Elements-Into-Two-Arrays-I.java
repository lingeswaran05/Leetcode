class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(l1.get(l1.size()-1) > l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }
            else
                l2.add(nums[i]);
        }
        int[] arr=new int[l1.size()+l2.size()];
        for(int x:l2) l1.add(x);
        int[] array = l1.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}