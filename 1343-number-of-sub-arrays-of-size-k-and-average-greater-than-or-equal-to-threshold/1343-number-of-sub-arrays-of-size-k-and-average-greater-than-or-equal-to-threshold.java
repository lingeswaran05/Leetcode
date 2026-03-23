class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        int cursum=0;
        for(int i=0;i<k;i++)   {
            cursum+=arr[i];
        }
        if((cursum/k)>=threshold) res++;
        for(int i=k;i<arr.length;i++){
            cursum-=arr[i-k];
            cursum+=arr[i];
            if((cursum/k)>=threshold) res++;
        }
        return res;
    }
}