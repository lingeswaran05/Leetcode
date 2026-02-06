1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int cnt = 0; 
4        int res = 0;  
5
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] == 1) {
8                cnt++;
9                if (cnt > res) {
10                    res = cnt;
11                }
12            } else {
13                cnt = 0;
14            }
15        }
16        return res;
17    }
18}