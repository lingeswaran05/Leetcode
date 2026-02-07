1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int ind1 = m - 1;     
4        int ind2 = n - 1;      
5        int ind = m + n - 1;
6
7        while (ind2 >= 0) {
8            if (ind1 >= 0 && nums1[ind1] > nums2[ind2]) {
9                nums1[ind] = nums1[ind1];
10                ind1--;
11            } else {
12                nums1[ind] = nums2[ind2];
13                ind2--;
14            }
15            ind--;
16        }
17    }
18}