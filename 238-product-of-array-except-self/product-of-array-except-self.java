class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1; result[n-1] = 1;
        
        // Prefix
        for(int i=1; i<n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // Sufix
        int suffix = 1;
        for(int i = n-2; i>=0; i--){
            suffix = suffix * nums[i+1];
            result[i] = result[i] * suffix;
        }
        return result;
    }
}