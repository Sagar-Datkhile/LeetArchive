class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] xorPrefix = new int[n];
        
        xorPrefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            xorPrefix[i] = xorPrefix[i - 1] ^ nums[i];
        }
        
        int mask = (1 << maximumBit) - 1; 
        
        for (int i = 0; i < n; i++) {
            ans[i] = xorPrefix[n - 1 - i] ^ mask;
        }
        
        return ans;
    }
}
