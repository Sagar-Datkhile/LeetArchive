class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        
        // If only one number
        if (n == 1) {
            return String.valueOf(nums[0]);
        }
        
        // If two numbers
        if (n == 2) {
            return nums[0] + "/" + nums[1];
        }
        
        // For more than 2 numbers
        StringBuilder result = new StringBuilder();
        result.append(nums[0]).append("/(").append(nums[1]);
        
        for (int i = 2; i < n; i++) {
            result.append("/").append(nums[i]);
        }
        
        result.append(")");
        return result.toString();
    }
}