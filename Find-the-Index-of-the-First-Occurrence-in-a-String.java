1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(haystack.contains(needle)){
4            int res=haystack.indexOf(needle);
5            return res;
6        }
7        else
8            return -1;
9    }
10}