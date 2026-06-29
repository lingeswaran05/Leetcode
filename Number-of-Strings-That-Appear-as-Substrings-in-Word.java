1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int cnt=0; 
4        for(String s : patterns)
5            if(word.contains(s)) cnt++;
6        return cnt;
7    }
8}