1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int product=0;
4        int haszero=0;
5        for(int x:nums){
6            if(x==0){haszero++;continue;}
7            if(product==0)  product=1;
8            product*=x;
9        }
10        int[] ar=new int[nums.length];
11
12        if(haszero==1)
13        {
14            for(int i=0;i<nums.length;i++){
15                if(nums[i]==0){
16                    ar[i]=product;
17                }
18                else{
19                    ar[i]=0;
20                }
21            }
22        }
23        else if(haszero > 1)
24        {
25            for(int i=0;i<nums.length;i++){
26                    ar[i]=0;
27            }
28        }
29        else{
30            for(int i=0;i<nums.length;i++){
31                ar[i]=product/nums[i];
32            }
33        }
34        return ar;
35    }
36}