class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        long[][] mat=new long[n+1][m+1];

        for(int i=0;i<=n;i++){
                mat[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1) == t.charAt(j-1))
                    mat[i][j]= mat[i-1][j-1]+mat[i-1][j];                
                else
                    mat[i][j]= mat[i-1][j];
            }
        }
        return (int) mat[n][m];
    }
}