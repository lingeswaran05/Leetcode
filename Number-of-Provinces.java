1class Solution {
2    public int findCircleNum(int[][] isConn) {
3        int n=isConn.length;
4        List<List<Integer>> graph =new ArrayList<>();
5        for(int i=0;i<n;i++){
6            graph.add(new ArrayList<>());
7        }
8        for(int i=0;i<n;i++){
9            for(int j=0;j<n;j++){
10                if(isConn[i][j]==1 && i!=j){
11                    graph.get(i).add(j);
12                }
13            }
14        }
15
16        boolean[] vis = new boolean[n];
17        Arrays.fill(vis,false);
18
19        Queue<Integer> queue= new LinkedList<>();
20        int cnt=0;
21        for(int i=0;i<n;i++){
22            if(!vis[i]){
23                vis[i]=true;
24                queue.add(i);
25                cnt++;
26                while(!queue.isEmpty()){
27                    int curr=queue.poll();
28                    for(int x:graph.get(curr)){
29                        if(!vis[x]) queue.add(x);
30                        vis[x]=true;
31                    }
32                }
33            }
34        }
35        return cnt;
36
37
38
39
40
41    }
42}