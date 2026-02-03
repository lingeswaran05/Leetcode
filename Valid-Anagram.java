1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] ar1=s.toCharArray();
4        char[] ar2=t.toCharArray();
5        Arrays.sort(ar1);
6        Arrays.sort(ar2);
7        s= new String(ar1);     
8        t= new String(ar2);     
9        if(s.equals(t)){
10            return true;
11        }
12        return false;
13    }
14}