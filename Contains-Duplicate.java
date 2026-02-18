1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        int n=nums.length;
4        Set<Integer> set=new HashSet<>();
5        for(int x:nums){
6            if(set.contains(x)){
7                return true;
8            }
9            else{
10                set.add(x);
11            }
12        }
13        return false;
14    }
15}