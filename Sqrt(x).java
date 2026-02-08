1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0) return 0;
4        long r = x;
5        while (r * r > x) {
6            r = (r + x / r) / 2;
7        }
8        return (int) r;
9    }
10}
11