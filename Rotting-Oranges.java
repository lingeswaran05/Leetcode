1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        boolean changed;
6        int elapse=0;
7
8        int[][] direct={{1,0},{0,1},{-1,0},{0,-1}};
9
10        while(true){
11            changed=false;
12
13            for(int i=0;i<n;i++){
14                for(int j=0;j<m;j++){
15
16                    if(grid[i][j]==elapse+2){
17                        for(int[] dir:direct){
18                            int x=i+dir[0];
19                            int y=j+dir[1];
20                            if((x>=0 && x<n && y>=0 && y<m) && grid[x][y]==1){
21                                grid[x][y]=grid[i][j]+1;
22                                changed=true;
23                            }
24                        }
25                    }
26                }
27            }
28            if(!changed) break;
29            elapse++;
30        }
31        for(int i=0;i<n;i++){
32            for(int j=0;j<m;j++){
33                if(grid[i][j]==1) return -1;
34            }
35        }
36        return elapse;
37    }
38}