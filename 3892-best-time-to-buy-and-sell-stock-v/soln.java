public class soln {
        public long maximumProfit(int[] A, int k) {
        long[] res = new long[k + 1], bought = new long[k], sold = new long[k];
        Arrays.fill(bought, -1000000000);
        for (int a : A) {
            for (int j = k; j >= 1; j--) {
                res[j] = Math.max(res[j], Math.max(bought[j - 1] + a, sold[j - 1] - a));
                bought[j - 1] = Math.max(bought[j - 1], res[j - 1] - a);
                sold[j - 1] = Math.max(sold[j - 1], res[j - 1] + a);
            }
        }

        long ans = 0;
        for (long v : res)
            ans = Math.max(ans, v);
        return ans;
    }
}
