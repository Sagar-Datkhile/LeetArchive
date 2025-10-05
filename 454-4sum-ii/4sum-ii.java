class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
           HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Step 1: Compute all possible sums of nums1 and nums2
        // and store their frequencies in the map
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // Step 2: Compute all possible sums of nums3 and nums4
        // and check if the negated sum exists in the map
        for (int c : nums3) {
            for (int d : nums4) {
                int sum = c + d;
                if (map.containsKey(-sum)) {
                    count += map.get(-sum);
                }
            }
        }

        return count;
    }
}