1class Solution {
2    static List<List<Integer>> thresum(int[] arr , List<List<Integer>> res){
3        Arrays.sort(arr);
4        int n = arr.length;
5        for(int i=0;i<n-2;i++){
6            int l =i+1,r=n-1;
7            // int remain=0-arr[i];
8            while(l<r){
9                int sum=arr[l]+arr[r]+arr[i];
10                if(sum==0){
11                    List<Integer> t=new ArrayList<>();
12                    t.add(arr[i]);
13                    t.add(arr[l]);
14                    t.add(arr[r]);
15                    res.add(t);
16                    l++;r--;
17                    while (l < r && arr[l] == arr[l - 1]) l++;
18                    while (l < r && arr[r] == arr[r + 1]) r--;
19                }
20                else if(sum < 0)
21                    l++;
22                else  
23                    r--;
24            }
25        }
26        return res;
27    }
28    public List<List<Integer>> threeSum(int[] nums) {
29        List<List<Integer>> res= new ArrayList<>();
30        res = thresum(nums,res);
31        Set<List<Integer>> uniqueElements = new HashSet<>(res);
32         res = new ArrayList<>(uniqueElements);
33        return res;
34    }
35}