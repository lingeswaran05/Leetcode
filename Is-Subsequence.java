1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.equals(t) || s.length()==0) return true;
4        int i=0,j=0;
5        while( i<s.length() &&j<t.length()){
6            if(s.charAt(i)==t.charAt(j)) {
7                i++;j++;
8                if(i==s.length()) return true;
9            }
10            else{j++;}
11        }
12        return false;
13    }
14}