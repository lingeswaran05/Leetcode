class Solution {
    static final long MOD = 1_000_000_007L;
    // public int calc(String s){
    //     if(s.length()==0) return 0;
    //     long num=0;
    //     long sum=0;
    //     for(char c:s.toCharArray()){
    //         if(c=='0') continue;
    //         int d=c-'0';
    //         sum+=d;
    //         num=(num*10 + d) % MOD;
    //     }
        
    //     return (int)(sum%MOD * num%MOD);
    // }

    public int[] sumAndMultiply(String s, int[][] queries){ 
        int n = s.length();
        int[] cnt = new int[n + 1];
        ArrayList<Integer> digit = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cnt[i + 1] = cnt[i];
            if (s.charAt(i) != '0') {
                digit.add(s.charAt(i) - '0');
                cnt[i + 1]++;
            }
        }

        int m = digit.size();
        long[] pref = new long[m + 1];
        long[] sum = new long[m + 1];
        long[] pow = new long[m + 1];

        pow[0] = 1;

        for (int i = 0; i < m; i++) {
            pow[i + 1] = (pow[i] * 10) % MOD;
            pref[i + 1] = (pref[i] * 10 + digit.get(i)) % MOD;
            sum[i + 1] = sum[i] + digit.get(i);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int left = cnt[l];
            int right = cnt[r + 1] - 1;

            if (left > right) {
                ans[i] = 0;
                continue;
            }

            int len = right - left + 1;

            long number =
                    (pref[right + 1]
                    - pref[left] * pow[len] % MOD
                    + MOD) % MOD;

            long digitSum = sum[right + 1] - sum[left];

            ans[i] = (int)((digitSum % MOD) * number % MOD);
        }

        return ans; 
    }
}