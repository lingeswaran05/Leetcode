1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        if(k%n==0)    return;
5        k%=n;
6        int[] arr=new int[n];
7        int i,j;
8        for(i=0;i<n;i++){
9            arr[(i + k) % n] = nums[i];
10        }
11        for(int l=0;l<n;l++){
12            nums[l]=arr[l];
13        }
14    }
15}