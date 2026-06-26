1class Solution {
2    public int removeDuplicates(int[] nums) {
3        TreeMap<Integer,Integer> freq=new TreeMap<>();
4        for(int i :nums){
5            freq.put(i,freq.getOrDefault(i,0)+1);
6        }
7        int k=0,cnt=0;
8        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
9            if(entry.getValue() > 1){
10                nums[k++]=entry.getKey();
11                nums[k++]=entry.getKey();
12            }
13            else if(entry.getValue() == 1){
14                nums[k++]=entry.getKey();
15            }
16            else break;
17        }
18        return k;
19    }
20}