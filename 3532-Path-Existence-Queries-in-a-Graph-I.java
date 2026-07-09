class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
       int[] set=new int[n];
       int x=1;
       for(int i=0;i<n-1;i++){
        set[i]=x;
        if(nums[i+1]-nums[i] > maxDiff){
            x++;
        }
       }
       set[n-1]=x;
       int m=queries.length;
       boolean[] res=new boolean[m];
       for(int i=0;i<m;i++){
        int u=queries[i][0];
        int v=queries[i][1];
        res[i]=set[u]==set[v];
       }
       return res;
    }
}