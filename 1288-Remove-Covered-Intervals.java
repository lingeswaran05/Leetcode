class Solution {
    public int removeCoveredIntervals(int[][] in) {
        int n=in.length;
        boolean[] covered = new boolean[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(covered[i]) continue;
            int a=in[i][0];
            int b=in[i][1];
            for(int j=0;j<n;j++){
                int c=in[j][0];
                int d=in[j][1];
                if( i!=j && c <=a && b <= d) {covered[i]=true;break;}
            }
        }
        for(int i=0;i<n;i++) if(! covered[i]) k++;
        return k;
    }
}