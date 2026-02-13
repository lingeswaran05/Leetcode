1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3        int[] res=new int[2];
4        int cnt,n=nums.length,x=0;
5        for(int i=0;i<n;i++){
6            cnt=1;
7            for(int j=i+1;j<n;j++){
8                if(nums[i]==nums[j]){
9                    cnt++;
10                }
11            }
12            if(cnt==2){
13                res[x++]=nums[i];
14            }
15        }
16        return res;
17    }
18}