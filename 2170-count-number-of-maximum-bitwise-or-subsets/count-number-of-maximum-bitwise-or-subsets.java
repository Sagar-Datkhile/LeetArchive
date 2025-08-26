class Solution {
    private int maxOr = 0;
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            maxOr |= num;
        }

        backtrack(nums, 0, 0);
        return count;
    }

    private void backtrack(int[] nums, int index, int currentOr) {
        if (index == nums.length) {
            if (currentOr == maxOr) {
                count++;
            }
            return;
        }

        backtrack(nums, index + 1, currentOr | nums[index]);

        backtrack(nums, index + 1, currentOr);
    }
}
