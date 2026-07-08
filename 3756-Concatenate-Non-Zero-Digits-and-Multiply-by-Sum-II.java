class Solution {
    long MOD = 1_000_000_007;
    public int calc(String s){
        if(s.length()==0) return 0;
        long num=0;
        long sum=0;
        for(char c:s.toCharArray()){
            if(c=='0') continue;
            int d=c-'0';
            sum+=d;
            num=(num*10 + d) % MOD;
        }
        
        return (int)(sum%MOD * num%MOD);
    }
    public int[] sumAndMultiply(String s, int[][] queries) { 
        int n=queries.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=calc(s.substring(queries[i][0],queries[i][1]+1));
        }
        return res;   
    }
}