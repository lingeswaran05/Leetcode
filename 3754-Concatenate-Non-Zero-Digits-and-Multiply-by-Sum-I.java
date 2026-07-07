class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long sum=0;
        String s=String.valueOf(n);
        s=s.replace("0","");
        int num=Integer.parseInt(s);
        
        while(n>0){
            long rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum*num;
    }
}