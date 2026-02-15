1class Solution {
2    public int titleToNumber(String cT) {
3        int sum=0;
4        for(int i=0;i<cT.length();i++){
5            sum*=26;
6            char c=cT.charAt(i);
7             sum+=(c-'A')+1;
8        }
9        return sum;
10    }
11}