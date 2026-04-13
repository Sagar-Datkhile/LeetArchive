class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        
        if (n == 1) {
            return String.valueOf(nums[0]);
        }
        
        if (n == 2) {
            return nums[0] + "/" + nums[1];
        }
        
        StringBuilder result = new StringBuilder();
        result.append(nums[0]).append("/(").append(nums[1]);
        
        for (int i = 2; i < n; i++) {
            result.append("/").append(nums[i]);
        }
        
        result.append(")");
        return result.toString();
    }
}