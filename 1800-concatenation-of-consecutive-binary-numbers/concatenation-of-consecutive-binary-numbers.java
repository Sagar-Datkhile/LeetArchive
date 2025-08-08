class Solution {
    private static final int MOD = 1_000_000_007;
    public int concatenatedBinary(int n) {
        long result = 0;
        for(int i=1; i<=n; i++){
            int len = (int) (Math.log(i) / Math.log(2)) + 1;
            result = ((result << len) + i) % MOD;
        }
        return (int) result;
    }
}