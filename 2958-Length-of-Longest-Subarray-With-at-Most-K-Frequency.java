class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int maxlen=0,j=0;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while(map.get(arr[i]) > k){
                map.put(arr[j],map.get(arr[j])-1);
                j++;
            }
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}