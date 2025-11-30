import java.util.*;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int rem = (int)(totalSum % p);
        if (rem == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // prefix mod -> index

        long prefixSum = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int currMod = (int)(prefixSum % p);

            int target = (currMod - rem + p) % p;

            if (map.containsKey(target)) {
                minLen = Math.min(minLen, i - map.get(target));
            }

            map.put(currMod, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }
}
