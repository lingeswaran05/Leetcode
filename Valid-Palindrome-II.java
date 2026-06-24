1class Solution {
2    public boolean validPalindrome(String s) {
3        int l=0,r=s.length()-1;
4        while(l<r){
5            if(s.charAt(l)==s.charAt(r)){
6                l++;r--;
7            }
8            else {
9                return isvalid(s,l+1,r) || isvalid(s,l,r-1);
10            }
11                
12        }
13        return true;
14    }
15    public boolean isvalid(String s,int l,int r){
16        while(l<r){
17            if(s.charAt(l)!=s.charAt(r))
18                return false;
19                l++;
20                r--;
21        }
22        return true;
23    }
24}