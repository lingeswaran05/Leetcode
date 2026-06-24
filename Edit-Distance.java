1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m=word1.length();
4        int n=word2.length();
5
6        if(m==0) return word2.length();
7        if(n==0) return word1.length();
8        if(word1.equals(word2)) return 0;
9        int[][] dp = new int[m+1][n+1];
10        int k=0;
11        for(int i=0;i<=m;i++)
12            dp[i][0]=k++;
13            k=0;
14        for(int i=0;i<=n;i++)
15            dp[0][i]=k++;
16        for(int i=1;i<=m;i++){
17            for(int j=1;j<=n;j++){
18                if(word1.charAt(i-1)==word2.charAt(j-1)){
19                    dp[i][j]=dp[i-1][j-1];
20                }
21                else{
22                    dp[i][j]=1+(Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])));
23                }
24            }
25        }
26
27        return dp[m][n];
28        
29    }
30}