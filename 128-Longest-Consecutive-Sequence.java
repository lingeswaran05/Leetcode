class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Set<Integer> set=new HashSet<>();
        Set<Integer> vis=new HashSet<>();
        int n=nums.length;

        for(int i:nums) {
            set.add(i);
        }
        int mx=0;

        for(int num:set){

            int cnt=1;

            if(vis.contains(num)) continue;

            int num1=num;
            vis.add(num);

            while(set.contains(--num1)){
                vis.add(num1);
                cnt++;
            }

            int num2=num;
            while(set.contains(++num2)){
                    vis.add(num2);
                    cnt++;
            }
            mx=Math.max(mx,cnt);
        }
        return mx;
    }
}