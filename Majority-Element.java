1import java.util.*;
2
3class Solution {
4    public int majorityElement(int[] nums) {
5        Map<Integer, Integer> map = new HashMap<>();
6        int n = nums.length;
7
8        for (int i = 0; i < n; i++) {
9            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
10            
11            if (map.get(nums[i]) > n / 2) {
12                return nums[i];
13            }
14        }
15
16        return -1; 
17    }
18}