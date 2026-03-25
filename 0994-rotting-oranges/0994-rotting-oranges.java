class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int freshfruit=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    freshfruit ++;
                }
            }
        }
        if(freshfruit==0) return 0;
        int[][] directions={{0,-1},{0,1},{1,0},{-1,0}};
        int minute=0;
        while(!q.isEmpty()){
            int n=q.size();
            boolean rotten=false;
            for(int i=0;i<n;i++){
                int[] ar=q.poll();
                int r=ar[0],c=ar[1];
                for(int[] x:directions){
                    int nr=r+x[0],nc=c+x[1];
                    if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        freshfruit--;
                        rotten=true;
                    }
                }
            }
            if(rotten) minute++;
        }
        return freshfruit==0?minute:-1;
        
    }
}