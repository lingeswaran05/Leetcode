class Solution {
    public long countCommas(long n) {

        long tot=0;
        long th=1000;
        while(n >= th){
            tot+=(n-th+1);
            if(n/1000 < th) break;
            th*=1000; 
        }
        return tot;
    }
}