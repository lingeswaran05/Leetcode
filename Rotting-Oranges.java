1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        boolean changed;
6        int elapse=0;
7        int fresh=0;
8        Queue<int[]> q=new LinkedList<>();
9        int[][] direct={{1,0},{0,1},{-1,0},{0,-1}};
10        for(int i=0;i<n;i++){
11            for(int j=0;j<m;j++){
12                if(grid[i][j]==1)   fresh++;
13                if(grid[i][j]==2)   q.add(new int[]{i,j});
14            }
15        }
16        if(fresh==0) return 0;
17        while(!q.isEmpty()){
18            int size=q.size();
19            while(size-- > 0){
20                int[] cell=q.poll();
21                int x=cell[0];
22                int y=cell[1];
23                for(int dir[]:direct){
24                    int ix=dir[0]+x;
25                    int jy=dir[1]+y;
26                    if((ix >=0 && ix < n && jy >= 0 && jy < m) && grid[ix][jy]==1){
27                        grid[ix][jy]=2;
28                        fresh--;
29                        q.add(new int[]{ix,jy});
30                    }
31                }
32            }
33            elapse++;
34        }
35        return fresh==0 ? elapse-1 :-1;
36       
37    }
38}