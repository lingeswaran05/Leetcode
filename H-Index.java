1class Solution {
2    public int hIndex(int[] citations) {
3        // int[] sorted=Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder())
4        //                           .mapToInt(Integer::intValue).toArray();
5
6        // int max=0;
7        // for(int i=0;i<citations.length;i++){
8        //     if(sorted[i] >= i+1){
9        //         max=i+1;
10        //     }
11        // }
12        // return max;
13        Arrays.sort(citations);
14        int max=0;
15        for(int i=0,j=citations.length-1;j>=0;j--,i++){
16            if(citations[j] >= i+1){
17                max=i+1;
18            }
19        }
20        return max;
21    }
22}