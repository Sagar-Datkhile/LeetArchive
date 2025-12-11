import java.util.*;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map to store remainder -> first index where it appeared
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0, -1);   // Important: prefix sum before start

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remainder = (k == 0) ? prefixSum : prefixSum % k;

            // If same remainder found before, subarray between them sum is multiple of k
            if (remainderIndex.containsKey(remainder)) {
                int prevIndex = remainderIndex.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                // Store first occurrence only to maximize length difference
                remainderIndex.put(remainder, i);
            }
        }

        return false;
    }
}
