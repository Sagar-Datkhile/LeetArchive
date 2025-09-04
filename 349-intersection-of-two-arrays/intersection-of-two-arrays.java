import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int n : nums1) {
            seen.add(n);
        }

        for (int n : nums2) {
            if (seen.contains(n)) {
                list.add(n);
                seen.remove(n); 
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
