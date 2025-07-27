class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n < 2 || k == 0) return 0;
        // We use long to avoid overflow if prices large.
        long[][][] dp = new long[n][k + 1][3];

        for (int j = 1; j <= k; j++) {
            dp[0][j][0] = 0;
            dp[0][j][1] = -prices[0];        // bought a long
            dp[0][j][2] = prices[0];         // opened a short (sold first)
        }
        // Fill DP
        for (int i = 1; i < n; i++) {
            int price = prices[i];
            for (int j = 1; j <= k; j++) {
                // flat: either stayed flat, sold long today, or closed a short today
                dp[i][j][0] = Math.max(
                    dp[i - 1][j][0],
                    Math.max(dp[i - 1][j][1] + price,
                             dp[i - 1][j][2] - price)
                );
                // long: either continued long, or bought today (consume one transaction)
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - price);
                // short: either continued short, or opened short today
                dp[i][j][2] = Math.max(
                    dp[i - 1][j][2],
                    dp[i - 1][j - 1][0] + price
                );
            }
        }
        // Final result: at most k transactions, ending flat (state=0)
        return dp[n - 1][k][0];
    }
}
