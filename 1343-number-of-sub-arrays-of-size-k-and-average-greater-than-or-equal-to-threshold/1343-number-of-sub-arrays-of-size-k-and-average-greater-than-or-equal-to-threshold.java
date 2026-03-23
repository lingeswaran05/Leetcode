class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        for(int i=0;i<=arr.length-k;i++){
            int j=i+k,cursum=0;
            for(int m=i;m < j ;m++){
                cursum+=arr[m];
            }
            if((cursum/k)>=threshold) res++;
        }
        return res;
    }
}