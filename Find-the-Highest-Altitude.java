1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] ps=new int[gain.length+1];
4        ps[0]=0;
5        int max=ps[0];
6        for(int i=1;i<gain.length+1;i++){
7            ps[i]=ps[i-1]+gain[i-1];
8            max=Math.max(max,ps[i]);
9        }
10        return max;
11
12    }
13}