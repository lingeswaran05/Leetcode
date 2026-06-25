1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        boolean vis[] =new boolean[rooms.size()];
4        Arrays.fill(vis,false);
5        
6        Queue<Integer> queue= new LinkedList<>();
7
8        queue.add(0);
9        while(queue.size()!=0){
10            int curr=queue.poll();
11            if(vis[curr]) continue;
12            vis[curr]=true;
13
14            for(int key:rooms.get(curr)){
15                if(!vis[key]){
16                    queue.add(key);
17                }
18            }
19        }
20        for(boolean y:vis){
21            if(!y) return false;
22        }
23
24        return true;
25    }
26}