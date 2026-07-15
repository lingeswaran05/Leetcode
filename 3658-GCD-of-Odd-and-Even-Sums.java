class Solution {
    public static int gcd(int x,int y){
        if(y==0) return Math.abs(x);
        return gcd(y,x%y);
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=1;
        int sumodd=0;
        int even=2;
        int sumeven=0;
        for(int i=0;i<n;i++){
            sumodd+=odd;
            sumeven+=even;
            odd+=2;
            even+=2;
        }
        return gcd(sumodd,sumeven);
    }
}