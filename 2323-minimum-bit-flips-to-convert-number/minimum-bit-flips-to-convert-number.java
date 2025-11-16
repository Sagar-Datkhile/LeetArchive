class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        // int count = 0;
        return Integer.bitCount(ans);
    }
}