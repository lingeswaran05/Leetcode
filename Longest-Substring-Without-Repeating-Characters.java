1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l=0;
4        int maxlen=0,n=s.length();
5        Set<Character> hashset= new HashSet<>();
6
7        for(int r=0 ; r<n ;r++){
8            if(!hashset.contains(s.charAt(r))){
9                hashset.add(s.charAt(r));
10                maxlen = Math.max(maxlen,r-l+1);
11            }
12            else{
13                while(hashset.contains(s.charAt(r))){
14                    hashset.remove(s.charAt(l));
15                    l++;
16                }
17                hashset.add(s.charAt(r));
18            }
19        }
20        return maxlen;
21    }
22}