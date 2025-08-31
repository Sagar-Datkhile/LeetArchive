class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0]; // Start with the first element as candidate
        int count = 0;           // Counter to track "votes"

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // If count resets, choose a new candidate
            }
            if (num == candidate) {
                count++; // Same as candidate → add vote
            } else {
                count--; // Different → cancel a vote
            }
        }
        return candidate; // Majority element will remain as final candidate
    }
}
