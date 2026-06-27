1class Solution {
2    public int maxProfit(int[] prices) {
3        if(prices.length==0 || prices.length==1) return 0;
4        int p1=0,p2=0,least=Integer.MAX_VALUE;
5        for(int i=0; i < prices.length;i++){
6            if(prices[i]<least)
7                least=prices[i];
8            p1=prices[i]-least;
9            if(p2<p1){
10                p2=p1;
11            }
12        }
13        return p2;
14    }
15}