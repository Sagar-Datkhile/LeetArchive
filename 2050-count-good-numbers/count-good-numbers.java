class Solution {
    static final long MOD = (long)1e9 + 7;

    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2;
        long oddPos = n / 2;

        long part1 = power(5, evenPos);
        long part2 = power(4, oddPos);

        return (int)((part1 * part2) % MOD);
    }

    // Fast exponentiation (binary exponentiation)
    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}
