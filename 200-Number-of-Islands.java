class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;int cnt=0;
        int[][] dist={{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    Queue<int[]> q =new LinkedList<>();
                    q.add(new int[]{i,j});
                    cnt++;
                    while(!q.isEmpty()){
                        int[] curr=q.poll();
                        int x=curr[0];
                        int y=curr[1];
                        for(int[] dis:dist){
                            int ix=x+dis[0];
                            int jy=y+dis[1];
                            if((ix < n && ix >=0 && jy< m && jy >=0) && grid[ix][jy]=='1'){
                                q.add(new int[]{ix,jy});
                                grid[ix][jy]='0';
                            }
                        }
                    }
                    
                }
            }
        }
        return cnt;

    }
}