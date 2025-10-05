class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int count = 0;
    for(int a:nums1){
        for(int b:nums2){
            int key = a+b;
            map.put(key, map.getOrDefault(key,0) +1);
        }
    }

    for(int c:nums3){
        for(int d: nums4){
            int key = (-1)*(c+d);
            count+= map.getOrDefault(key,0);
        }
    }
    return count;

    }
}